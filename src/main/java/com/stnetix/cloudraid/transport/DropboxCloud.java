package com.stnetix.cloudraid.transport;

import com.dropbox.core.*;
import com.dropbox.core.v2.DbxClientV2;
import com.stnetix.cloudraid.api.IExternalCloudAuthApi;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Dropbox it is external cloud implementation
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class DropboxCloud extends ExternalCloud implements IExternalCloudAuthApi {
    private DbxRequestConfig config;
    private DbxClientV2 client;
    private String clientID;
    private final String appKey = "hmj02ob4lb88e80";
    private final String appSecret = "kp01dpbzm8oyre3";
    private DbxWebAuth auth;
    private DbxAppInfo appInfo;

    //TODO продумать обработку DbxException: Throws в сигнатуре или блок try-catch?
    //TODO продумать механизм различения первого коннекта от последующих
    //FIXME appKey & appSecret ссылаются на тестовое приложение Restest, возможно, надо это менять

    public DropboxCloud(URL cloudUrl) {
        super(cloudUrl, SupportedClouds.DROPBOX);
        clientID = "CloudRAID/1.0"; //не понятно, зачем этот ID на практике
        config = new DbxRequestConfig(clientID);
    }

    @Override
    /**
     * Establishing connection with Dropbox Server means that you've successfully created an instance of Dropbox object.
     * Method connect allows one to get this instance and make the API calls.
     */
    public boolean connect()  {
        client = new DbxClientV2( config, getSettings().getToken().getAccessToken() );
        return true;
    }

    @Override
    /**
     * Allows one to get an Access Token during the first connection. After Access Token is acquired it will be encrypted and saved on Local Disk (?)
     * If you have got an Access Token than call connect() method
     */
     public boolean authUrlOpener(){
        //preparing app info
        appInfo = new DbxAppInfo(appKey, appSecret);
        auth = new DbxWebAuth(config, appInfo);
        //creating request and acquiring authorization URL
        DbxWebAuth.Request authRequest = DbxWebAuth.newRequestBuilder().withNoRedirect().build();
        String authorizeURL = auth.authorize(authRequest);
        //automatic authorization URL opener
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(authorizeURL));
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean tokenExtractor(String authorizationCode){
        String code = System.console().readLine();
        if (authorizationCode != null) {
            authorizationCode = authorizationCode.trim();
            DbxAuthFinish authFinish = null;
            try {
                authFinish = auth.finishFromCode(authorizationCode);
            } catch (DbxException e) {
                e.printStackTrace();
                return false;
            }
            getSettings().getToken().setAccessToken( authFinish.getAccessToken() );
        }
        return true;
    }
}

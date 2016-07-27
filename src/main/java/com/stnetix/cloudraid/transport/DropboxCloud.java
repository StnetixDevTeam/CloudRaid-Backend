package com.stnetix.cloudraid.transport;

import com.dropbox.core.*;
import com.dropbox.core.v2.DbxClientV2;

import java.net.URL;

/**
 * Dropbox it is external cloud implementation
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class DropboxCloud extends ExternalCloud {
    private DbxRequestConfig config;
    private DbxClientV2 client;
    private String clientID;
    private final String appKey = "hmj02ob4lb88e80";
    private final String appSecret = "kp01dpbzm8oyre3";

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
     public boolean firstConnectWithoutAcsToken(){
        DbxAppInfo appInfo = new DbxAppInfo(appKey, appSecret);
        DbxWebAuth auth = new DbxWebAuth(config, appInfo);

        DbxWebAuth.Request authRequest = DbxWebAuth.newRequestBuilder().withNoRedirect().build();
        String authorizeURL = auth.authorize(authRequest);

        //TODO внедрить автопереход на authorizeURL и автозахват кода авторизации
        /*
        if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().browse(new URI(authorizeURL));
            }
        */
        System.out.println("1. Go to " + authorizeURL);
        System.out.println("2. Click \"Allow\" (you might have to log in first).");
        System.out.println("3. Copy the authorization code.");
        System.out.print("Enter the authorization code here: ");

        String code = System.console().readLine();
        if (code != null) {
            code = code.trim();
            DbxAuthFinish authFinish = null;
            try {
                authFinish = auth.finishFromCode(code);
            } catch (DbxException e) {
                e.printStackTrace();
            }
            //FIXME проверить весь каскад методов, кажется, тут ошибка
            getSettings().getToken().setAccessToken( authFinish.getAccessToken() );
        }

        return true;
    }


}

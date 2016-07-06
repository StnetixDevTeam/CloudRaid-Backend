package com.stnetix.cloudraid.model;

import com.stnetix.cloudraid.util.Crypto;

/**
 * Users profile
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class UserProfile {
    private String login;
    private String nickname;
    private String email;
    private String password;

    public UserProfile(String login, String nickname, String email, String password) {
        this.login = login;
        this.nickname = nickname;
        this.email = email;
        this.password = Crypto.getSha256(password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Crypto.getSha256(password);
    }
}

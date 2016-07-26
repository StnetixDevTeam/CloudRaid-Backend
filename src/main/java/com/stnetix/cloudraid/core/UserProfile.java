package com.stnetix.cloudraid.core;

import com.stnetix.cloudraid.util.HashGenerator;
import com.stnetix.cloudraid.util.exception.HashGenerationException;

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
        this.password = HashGenerator.generateSHA256(password);
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
        try {
            this.password = HashGenerator.generateSHA256(password);
        } catch (HashGenerationException e) {
            e.printStackTrace();
        }
    }
}

package org.maxkey.authn.support.rememberme;

import java.io.Serializable;
import java.util.Date;

public class RemeberMe implements Serializable {

    private static final long serialVersionUID = 8010496585233991785L;

    String id;

    String username;

    String authKey;

    Date lastLogin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "RemeberMe [id=" + id 
                + ", username=" + username 
                + ", authKey=" + authKey + ", lastLogin=" + lastLogin
                + "]";
    }
}

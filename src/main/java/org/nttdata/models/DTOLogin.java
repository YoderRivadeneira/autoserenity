package org.nttdata.models;

public class DTOLogin {

    private String usuario;
    private String password;

    public String getUsername() {
        return usuario;
    }
    public void setUsername(String username) {
        this.usuario = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

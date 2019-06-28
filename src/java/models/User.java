/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author bestuser
 */
public class User {
    
    private int id;
    private String username;
    private String password;
    private LocalDateTime loginDate;
    private String remoteIp;

    public User() {
    }

    public User(String username, String password, LocalDateTime loginDate, String remoteIp) {
        this.username = username;
        this.password = password;
        this.loginDate = loginDate;
        this.remoteIp = remoteIp;
    }

    public User(int id, String username, String password, LocalDateTime loginDate, String remoteIp) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.loginDate = loginDate;
        this.remoteIp = remoteIp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }
    
    
    
    
}

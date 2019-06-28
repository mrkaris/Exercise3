/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsersDao;
import java.time.LocalDateTime;

/**
 *
 * @author bestuser
 */
public class UserService {
    
    UsersDao udao = new UsersDao();
    
    public String getUserNameByName(String name){
        String user;
        user = udao.getUserNameByName(name);
        return user;
    }
    public String getUserPassByName(String name){
        String password;
        password = udao.getUserPassByName(name);
        return password;
    }
    public boolean updateDate(String username, LocalDateTime date, String ip){
        return udao.updateDate(username, date, ip);
    }
    
    
}

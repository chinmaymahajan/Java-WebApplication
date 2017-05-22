/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dreamscoder.model;

import java.util.HashMap;

/**
 *
 * @author chinmay
 */
public class LoginService {
    
    HashMap<String,String> users = new HashMap<String,String>();    
    
    public LoginService(){
        
        users.put("chinmay", "chinmay");
        users.put("dreamscoder", "dreamscoder");
    
    }
    public Boolean loginAuthentication(String uname, String password) {
        if(uname == "" || password == ""){
        return false;
        }
        else
            return true;
    }
    
    public Users getUsername(String uid){
        Users details = new Users();
        details.setUsername(users.get(uid));
        details.setUserID(uid);
        
        return details;
        
    }
    
}

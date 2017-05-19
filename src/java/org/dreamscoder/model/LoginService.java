/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dreamscoder.model;

/**
 *
 * @author chinmay
 */
public class LoginService {
    
    public Boolean loginAuthentication(String uname, String password) {
        if(uname == "" || password == ""){
        return false;
        }
        else
            return true;
    }
    
}

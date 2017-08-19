package com.tripty.triptybeta.data.model;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 17/08/2017.
 */

public class Account {
    public String username;
    public String password;

    public Account MakeAccount (String username, String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    public Account (){
        this.username = "username";
        this.password = "password";
    }
}

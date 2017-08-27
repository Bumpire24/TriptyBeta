package com.tripty.triptybeta.data.model;

import com.tripty.triptybeta.data.enums.AccountType;
import com.tripty.triptybeta.data.enums.Gender;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by miguelfontamillas on 17/08/2017.
 */

public class Account {
    public String username;
    public String password;
    public String email;
    public String firstName;
    public String lastName;
    public Date birthDate;
    public Gender gender;
    public AccountType accountType;

    public Account MakeAccount (String username, String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    public Account MakeAccount (String firstName, String lastName, String email, String password, Date birthDate, Gender gender, AccountType accountType) {
        this.username = email;
        this.email = email;
        this.password = password;
        return this;
    }

    public Account (){
        username = "";
        password = "";
        email = "";
        firstName = "";
        lastName = "";
        birthDate = new Date();
    }

    public String fulllName() {
        return this.firstName + " " + this.lastName;
    }
}

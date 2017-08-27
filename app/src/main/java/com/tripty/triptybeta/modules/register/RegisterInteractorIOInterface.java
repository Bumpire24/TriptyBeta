package com.tripty.triptybeta.modules.register;

import com.tripty.triptybeta.data.enums.AccountType;
import com.tripty.triptybeta.data.enums.Gender;

import java.util.Date;

/**
 * Created by miguelfontamillas on 25/08/2017.
 */

interface RegisterInteractorInputInterface {
    public void validateAndRegisterAccount(String firstname, String lastName, String email, String password, Date birthDate, Gender gender, AccountType accountType);
    public void validatePasswords(String originalPassword, String repeatPassword);
}

interface RegisterInteractorOutputInterface {
    public void showMessage(String message);
}


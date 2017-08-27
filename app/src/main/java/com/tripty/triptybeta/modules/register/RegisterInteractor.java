package com.tripty.triptybeta.modules.register;

import android.util.Patterns;

import com.tripty.triptybeta.data.enums.AccountType;
import com.tripty.triptybeta.data.enums.Gender;
import com.tripty.triptybeta.data.model.Account;

import java.util.Date;

/**
 * Created by miguelfontamillas on 25/08/2017.
 */

public class RegisterInteractor implements RegisterInteractorInputInterface {
    //region variables
    RegisterService service;
    RegisterInteractorOutputInterface output;
    //endregion

    //region RegisterInteractorInputInterface methods
    @Override
    public void validateAndRegisterAccount(String firstname, String lastName, String email, String password, Date birthDate, Gender gender, AccountType accountType) {
        Account account = new Account().MakeAccount(firstname, lastName, email, password, birthDate, gender, accountType);
        if (isAccountValid(account)) {
            service.createAccount(account, new RegisterServiceInterfaceCallBack() {
                @Override
                public void callBackWithResults(Boolean wasSuccessful, Error e) {
                }
            });
        }
    }

    @Override
    public void validatePasswords(String originalPassword, String repeatPassword) {
        if (originalPassword.equals(repeatPassword)) {
            output.showMessage("Passwords do not match");
        }
    }
    //endregion

    //region private
    Boolean isAccountValid(Account account) {
        Boolean isValid = true;

        if(account.firstName.length() == 0) {
            isValid = false;
            output.showMessage("Missing First Name");
            return isValid;
        }

        if(!isValid && account.lastName.length() == 0) {
            isValid = false;
            output.showMessage("Missing Last Name");
            return isValid;
        }

        if(isValid && account.email.length() == 0) {
            isValid = false;
            output.showMessage("Missing Email Address");
            return isValid;
        }

        if(isValid && !(Patterns.EMAIL_ADDRESS.matcher(account.email).matches())) {
            isValid = false;
            output.showMessage("Incorrect Email Address");
            return isValid;
        }

        return isValid;
    }
    //endregion
}

package com.tripty.triptybeta.modules.register;

import com.tripty.triptybeta.data.enums.AccountType;
import com.tripty.triptybeta.data.enums.Gender;

import java.util.Date;

/**
 * Created by miguelfontamillas on 25/08/2017.
 */

public class RegisterPresenter implements RegisterInteractorOutputInterface {
    public RegisterInteractorInputInterface interactorInput;

    //region RegisterInteractorOutputInterface methods
    @Override
    public void showMessage(String message) {

    }
    //endregion

    //region public
    public void validateAndRegisterAccount(String firstname, String lastName, String email, String password, Date birthDate, Gender gender, AccountType accountType) {
        interactorInput.validateAndRegisterAccount(firstname, lastName, email, password, birthDate, gender, accountType);
    }

    public void validatePasswords(String originalPassword, String repeatPassword) {
        interactorInput.validatePasswords(originalPassword, repeatPassword);
    }
    //endregion
}

package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInInteractor implements LogInInteractorInput{
    public LogInService logInService;
    public LogInInteractorOutput output;

    @Override
    public void validateUsernameAndPassword(String username, final String Password) {
        logInService.retrieveAccountByUsername(username, new LogInServiceInterfaceCallBack() {
            @Override
            public void callBackWithResults(Account account, Error e) {
                if (e == null) {
                    CheckUsernameAndPasswordValidity(account, Password);
                } else {
                    output.showMessage(e.getMessage().toString());
                }
            }
        });
    }

    void CheckUsernameAndPasswordValidity(Account account, String password) {
        String message = "Success!";
        // Validate password
        if (!account.password.equals(password)) {
            message = "Invalid Password";
        }
        output.showMessage(message);
    }
}

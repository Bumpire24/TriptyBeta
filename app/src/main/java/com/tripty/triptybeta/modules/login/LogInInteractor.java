package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInInteractor implements LogInInteractorInput{
    public LogInService logInService;
    public LogInInteractorOutput output;

    @Override
    public void validateUsernameAndPassword(String username, String Password) {
        logInService.retrieveAccountByUsernameandPassword(username, Password, new LogInServiceInterfaceCallBack() {
            @Override
            public void callBackWithResults(String Message, Error e) {
                if (e != null) {
                    output.showMessage(e.getMessage().toString());
                } else {
                    output.showMessage(Message);
                }
            }
        });
    }
}

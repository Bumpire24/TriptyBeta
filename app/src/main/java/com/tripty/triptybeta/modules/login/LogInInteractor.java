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
    public void logInUsernameAndPassword(String username, String Password) {
        logInService.retrieveListByUserNameAndPassword(username, Password, new CallBackUtilityInterface(){
            @Override
            public void returnComplete() {

            }

            @Override
            public void returnCompleteWithResults(ArrayList<Object> objects, Error e) {
                if (e != null) {
                    output.showMessage(e.getMessage().toString());
                } else {
                    output.showMessage("Success!");
                }
            }

        });
    }
}

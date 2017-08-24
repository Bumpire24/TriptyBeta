package com.tripty.triptybeta.modules.login;

/**
 * Created by miguelfontamillas on 17/08/2017.
 */

interface LogInInteractorInput {
    public void validateUsernameAndPassword(String username, String Password);
}

interface LogInInteractorOutput {
    public void showMessage(String message);
}

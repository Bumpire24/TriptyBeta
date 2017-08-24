package com.tripty.triptybeta.modules.login;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInPresenter implements  LogInInteractorOutput{
    LogInInteractorInput interactorInput;
    LogInViewInterface view;

    public void logInUsernameAndPassword(String username, String password) {
        interactorInput.validateUsernameAndPassword(username, password);
    }

    @Override
    public void showMessage(String message) {
        view.showMessage(message);
    }
}

package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.modules.register.RegisterWireframe;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInPresenter implements  LogInInteractorOutput{
    LogInInteractorInput interactorInput;
    LogInViewInterface view;
    RegisterWireframe registerWireframe;

    public void logInUsernameAndPassword(String username, String password) {
        interactorInput.validateUsernameAndPassword(username, password);
    }

    @Override
    public void showMessage(String message) {
        view.showMessage(message);
        view.clearPasswordTextBox();
    }

    public void presentRegisterPage() {
        registerWireframe.presentRegisterActivity();
    }
}

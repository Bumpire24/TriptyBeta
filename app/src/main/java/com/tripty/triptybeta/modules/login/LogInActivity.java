package com.tripty.triptybeta.modules.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tripty.triptybeta.R;
import com.tripty.triptybeta.data.store.DataStoreArray;
import com.tripty.triptybeta.modules.base.BaseActivity;
import com.tripty.triptybeta.modules.register.RegisterWireframe;

/**
 * Created by miguelfontamillas on 15/08/2017.
 */

public class LogInActivity extends BaseActivity implements LogInViewInterface{
    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonLogin;
    Button buttonRegister;
    LogInPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setUpDependencyConfig() {
        presenter = new LogInPresenter();
        LogInInteractor interactor = new LogInInteractor();
        LogInService logInService = new LogInService();

        DataStoreArray dataStoreArray = new DataStoreArray();
        logInService.dataStore = dataStoreArray;

        presenter.view = this;
        presenter.interactorInput = interactor;
        presenter.registerWireframe = new RegisterWireframe(this);

        interactor.logInService = logInService;
        interactor.output = presenter;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.login);
        editTextUsername = (EditText)findViewById(R.id.editTextUsername);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonRegister = (Button)findViewById(R.id.buttonRegister);
    }

    @Override
    public void setEventsHandle() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.logInUsernameAndPassword(editTextUsername.getText().toString(), editTextPassword.getText().toString());
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.presentRegisterPage();
            }
        });
    }

    //region LogInViewInterface Implementation
    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void clearPasswordTextBox() {
        editTextPassword.setText("");
    }
    //endregion
}

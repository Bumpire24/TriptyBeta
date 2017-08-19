package com.tripty.triptybeta.modules.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tripty.triptybeta.R;
import com.tripty.triptybeta.data.store.DataStoreArray;
import com.tripty.triptybeta.modules.base.BaseActivity;

/**
 * Created by miguelfontamillas on 15/08/2017.
 */

public class LogInActivity extends BaseActivity implements LogInViewInterface{
    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonLogin;
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

        interactor.logInService = logInService;
        interactor.output = presenter;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.login);
        editTextUsername = (EditText)findViewById(R.id.editTextUsername);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
    }

    @Override
    public void setEventsHandle() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.logInUsernameAndPassword(editTextUsername.getText().toString(), editTextPassword.getText().toString());
            }
        });
    }

    //region LogInViewInterface Implementation
    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
    //endregion
}

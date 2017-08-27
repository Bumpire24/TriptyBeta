package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.data.model.Account;

/**
 * Created by miguelfontamillas on 19/08/2017.
 */

public interface LogInServiceInterfaceCallBack {
    public void callBackWithResults(Account account, Error e);
}

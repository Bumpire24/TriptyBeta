package com.tripty.triptybeta.modules.register;

import com.tripty.triptybeta.data.model.Account;

/**
 * Created by miguelfontamillas on 25/08/2017.
 */

public interface RegisterServiceInterfaceCallBack {
    public void callBackWithResults(Boolean wasSuccessful, Error e);
//    public void callBackWithResults(Account account, Error e);
}

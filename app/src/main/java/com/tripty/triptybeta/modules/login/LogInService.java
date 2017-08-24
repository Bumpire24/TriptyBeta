package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.data.store.DataStoreCallBackInterface;
import com.tripty.triptybeta.data.store.DataStoreInterface;
import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInService {
    public DataStoreInterface dataStore;

    public void retrieveAccountByUsernameandPassword(final String username, final String password, final LogInServiceInterfaceCallBack callback) {
        dataStore.retrieveListByModelName(Account.class, new DataStoreCallBackInterface() {
            @Override
            public void returnCompleteWithResults(ArrayList<Object> objects, Error e) {
                if (e == null) {
                    // find account
                    for (Object object : objects) {
                        Account account = (Account)object;
                        if (account.username.equals(username) && account.password.equals(password)) {
                            callback.callBackWithResults("Success!", null);
                            break;
                        }
                    }
                    callback.callBackWithResults("Account not found", new Error("Account not found"));
                } else {
                    callback.callBackWithResults("Something happened", new Error("Something happened"));
                }
            }
        });
    }
}

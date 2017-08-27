package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.data.store.DataStoreInterface;
import com.tripty.triptybeta.data.store.DataStoreCallBackRetrieveInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInService {
    public DataStoreInterface dataStore;

    public void retrieveAccountByUsername(final String username, final LogInServiceInterfaceCallBack callback) {
        dataStore.retrieveListByModelName(Account.class, new DataStoreCallBackRetrieveInterface() {
            @Override
            public void returnCompleteWithResults(ArrayList<Object> objects, Error e) {
                if (e == null) {
                    // find account
                    boolean foundAccount = false;
                    for (Object object : objects) {
                        Account account = (Account)object;
                        if (account.username.equals(username)) {
                            callback.callBackWithResults(account, null);
                            foundAccount = true;
                            break;
                        }
                    }

                    if (!foundAccount) {
                        callback.callBackWithResults(null, new Error("Account not found!"));
                    }
                } else {
                    callback.callBackWithResults(null, new Error("Something happened"));
                }
            }
        });
    }
}

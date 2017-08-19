package com.tripty.triptybeta.modules.login;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.data.store.DataStoreInterface;
import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class LogInService implements DataStoreInterface {
    public DataStoreInterface dataStore;

    @Override
    public void retrieveListByUserNameAndPassword(final String username, final String password, final CallBackUtilityInterface callback) {
        dataStore.retrieveListByUserNameAndPassword(username, password, new CallBackUtilityInterface() {
            @Override
            public void returnComplete() {

            }

            @Override
            public void returnCompleteWithResults(ArrayList<Object> objects, Error e) {
                boolean foundAccount = false;
                for (Object object : objects) {
                    Account account = (Account)object;
                    if (account.username.equals(username) && account.password.equals(password)) {
                        foundAccount = true;
                        break;
                    }
                }
                if (foundAccount) {
                    callback.returnCompleteWithResults(null, null);
                } else {
                    callback.returnCompleteWithResults(null, new Error("Did not Find Account!"));
                }
            }
        });


    }
}

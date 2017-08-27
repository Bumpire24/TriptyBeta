package com.tripty.triptybeta.modules.register;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.data.store.DataStoreCallbackInsertInterface;
import com.tripty.triptybeta.data.store.DataStoreInterface;

/**
 * Created by miguelfontamillas on 25/08/2017.
 */

public class RegisterService {
    //region variables
    public DataStoreInterface dataStore;
    //endregion

    //region public
    public void createAccount(Account account, final RegisterServiceInterfaceCallBack callBack) {
        dataStore.insertNewRecordCallback(Account.class, account, new DataStoreCallbackInsertInterface() {
            @Override
            public void returnCompleteWithResults(Boolean wasSuccessful, Error e) {
                callBack.callBackWithResults(wasSuccessful, e);
            }
        });
    }
    //endregion
}

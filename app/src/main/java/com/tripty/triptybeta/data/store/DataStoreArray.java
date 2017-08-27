package com.tripty.triptybeta.data.store;

import com.tripty.triptybeta.data.model.Account;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class DataStoreArray implements DataStoreInterface {
    //region DataStoreInterface methods
    @Override
    public void retrieveListByModelName(Class model, DataStoreCallBackRetrieveInterface callback) {
        ArrayList<Object> objects = new ArrayList<>();
        // overwrite
        if (model.equals(Account.class)) {
            objects.add(new Account().MakeAccount("Sample", "Sample"));
            objects.add(new Account().MakeAccount("Sample1", "Sample1"));
        }
        callback.returnCompleteWithResults(objects, null);
    }

    @Override
    public void insertNewRecordCallback(Class model, Object object, DataStoreCallbackInsertInterface callback) {

    }
    //endregion
}

package com.tripty.triptybeta.data.store;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 24/08/2017.
 */

public interface DataStoreInterface {
    public void retrieveListByModelName(Class model, DataStoreCallBackRetrieveInterface callback);
    public void insertNewRecordCallback(Class model, Object object, DataStoreCallbackInsertInterface callback);
}

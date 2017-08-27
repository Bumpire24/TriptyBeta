package com.tripty.triptybeta.data.store;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public interface DataStoreCallBackRetrieveInterface {
    public void returnCompleteWithResults(ArrayList<Object> objects, Error e);
}
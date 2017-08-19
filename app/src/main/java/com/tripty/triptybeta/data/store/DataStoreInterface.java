package com.tripty.triptybeta.data.store;

import com.tripty.triptybeta.utility.CallBackUtilityInterface;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public interface DataStoreInterface {
    void retrieveListByUserNameAndPassword(String username, String password, CallBackUtilityInterface callback);
}

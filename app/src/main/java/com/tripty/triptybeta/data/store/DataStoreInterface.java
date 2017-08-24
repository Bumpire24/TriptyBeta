package com.tripty.triptybeta.data.store;

import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public interface DataStoreInterface {
    public void retrieveListByModelName(Class model, DataStoreCallBackInterface callback);
}
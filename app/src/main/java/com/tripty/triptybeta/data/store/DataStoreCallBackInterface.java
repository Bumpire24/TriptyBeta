package com.tripty.triptybeta.data.store;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 24/08/2017.
 */

public interface DataStoreCallBackInterface {
    public void returnCompleteWithResults(ArrayList<Object> objects, Error e);
}

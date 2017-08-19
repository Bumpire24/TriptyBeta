package com.tripty.triptybeta.data.store;

import com.tripty.triptybeta.data.model.Account;
import com.tripty.triptybeta.utility.CallBackUtilityInterface;

import java.util.ArrayList;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class DataStoreArray implements DataStoreInterface{
    @Override
    public void retrieveListByUserNameAndPassword(String username, String password, CallBackUtilityInterface callback) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account().MakeAccount("Sample", "Sample"));
        accounts.add(new Account().MakeAccount("Sample1", "Sample1"));
        callback.returnCompleteWithResults(new ArrayList<Object>(accounts), null);
    }
}

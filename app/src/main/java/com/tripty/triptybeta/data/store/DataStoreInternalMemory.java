package com.tripty.triptybeta.data.store;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by miguelfontamillas on 24/08/2017.
 */

public class DataStoreInternalMemory implements DataStoreInterface {
    //region variables
    String fileName = "tripty.data";
    Context context;
    HashMap<String, ArrayList<Object>> data;
    //endregion

    //region DataStoreInterface Methods
    @Override
    public void retrieveListByModelName(Class model, DataStoreCallBackRetrieveInterface callback) {
        Error e = null;
        e = readData();
        if (readData() == null) {
            callback.returnCompleteWithResults((ArrayList<Object>)data.get(model.getName()),null);
        } else {
            callback.returnCompleteWithResults(null,e);
        }
    }

    @Override
    public void insertNewRecordCallback(Class model, Object object, DataStoreCallbackInsertInterface callback) {
        Error eRead = null;
        eRead = readData();
        if (readData() == null) {
            ArrayList<Object> objects;
            objects = (ArrayList<Object>)data.get(model.getName());
            if (objects == null) {
                objects = new ArrayList<>();
            }
            objects.add(object);
            data.put(model.getName(), objects);
            try {
                saveDataToInternalMermory();
                callback.returnCompleteWithResults(true,null);
            } catch (IOException e) {
                callback.returnCompleteWithResults(false,new Error(e.getMessage()));
            }
        } else {
            callback.returnCompleteWithResults(false,eRead);
        }
    }
    //endregion

    //region public
    public DataStoreInternalMemory(Context context) {
        this.context = context;
        data = new HashMap<>();
    }
    //endregion

    //region private
    void readDataFromInternalMemory() throws IOException, ClassNotFoundException {
        FileInputStream fis = context.openFileInput(fileName);
        ObjectInputStream oiStream = new ObjectInputStream(fis);
        data = (HashMap<String, ArrayList<Object>>) oiStream.readObject();
    }

    void saveDataToInternalMermory() throws IOException {
        FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        ObjectOutputStream ooStream = new ObjectOutputStream(fos);
        ooStream.writeObject(data);
        ooStream.close();
        fos.close();
    }

    Error readData() {
        try {
            readDataFromInternalMemory();
            return null;
        } catch (IOException e) {
            return new Error(e.getMessage());
        } catch (ClassNotFoundException e) {
            return new Error(e.getMessage());
        }
    }
    //endregion
}

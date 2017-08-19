package com.tripty.triptybeta.utility;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public interface CallBackUtilityInterface {
    public void returnComplete();
    public void returnCompleteWithResults(ArrayList<Object> objects, Error e);
}

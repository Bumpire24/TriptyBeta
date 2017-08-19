package com.tripty.triptybeta.modules.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by miguelfontamillas on 15/08/2017.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpDependencyConfig();
        setContentView();
        setEventsHandle();
    }

    public void setUpDependencyConfig() {

    }

    public void setContentView() {

    }

    public void setEventsHandle() {

    }
}

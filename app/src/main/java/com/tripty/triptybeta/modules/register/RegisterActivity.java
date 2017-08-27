package com.tripty.triptybeta.modules.register;

import android.os.Bundle;

import com.tripty.triptybeta.R;
import com.tripty.triptybeta.modules.base.BaseActivity;

/**
 * Created by miguelfontamillas on 27/08/2017.
 */

public class RegisterActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setUpDependencyConfig() {
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.register);
    }

    @Override
    public void setEventsHandle() {
    }
}

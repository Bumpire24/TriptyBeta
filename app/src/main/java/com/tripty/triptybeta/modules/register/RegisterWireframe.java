package com.tripty.triptybeta.modules.register;

import android.content.Context;
import android.content.Intent;

/**
 * Created by miguelfontamillas on 27/08/2017.
 */

public class RegisterWireframe {
    Context context;

    public RegisterWireframe (Context context) {
        this.context = context;
    }

    public void presentRegisterActivity() {
        Intent intent = new Intent(context, RegisterActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }
}

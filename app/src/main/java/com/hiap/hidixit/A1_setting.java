package com.hiap.hidixit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by WoonGi on 2017-03-10.
 */

public class A1_setting extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_setting);

        findViewById(R.id.b1_back).setOnClickListener(this);
        findViewById(R.id.b1_signout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1_back:
                finish();
                break;
            case R.id.b1_signout:
                ((A1_login)A1_login.mContext).signOut();
                finish();
                break;
        }
    }
}

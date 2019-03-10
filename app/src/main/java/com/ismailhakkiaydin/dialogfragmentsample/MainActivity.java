package com.ismailhakkiaydin.dialogfragmentsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {

        MyFragment myFragment=new MyFragment();
        myFragment.show(getFragmentManager(), "My Dialog");

    }

    @Override
    public void dialogVerisiniGOnder(String mesaj) {

        Toast.makeText(this, mesaj, Toast.LENGTH_LONG).show();

    }

}

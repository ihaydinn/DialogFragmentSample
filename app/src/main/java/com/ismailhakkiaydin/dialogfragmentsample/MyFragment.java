package com.ismailhakkiaydin.dialogfragmentsample;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragment extends DialogFragment implements View.OnClickListener {
    Button evet, hayir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.my_dialog, container, false);
        evet = (Button) view.findViewById(R.id.btnEvet);
        hayir = (Button) view.findViewById(R.id.btnHayir);

        evet.setOnClickListener(this);
        hayir.setOnClickListener(this);

        setCancelable(false);
        return view;
    }



    @Override
    public void onClick(View v) {

        MyListener myListener = (MyListener) getActivity();

        if (v.getId() == R.id.btnEvet) {

            myListener.dialogVerisiniGOnder("EVET TIKLANDI");

            dismiss();


        } else {

            myListener.dialogVerisiniGOnder("HAYIR TIKLANDI");
            dismiss();

        }

    }
}

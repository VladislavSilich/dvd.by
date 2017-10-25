package com.example.silich.vladislav.d4dby;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class RegistrationFragment extends android.app.Fragment implements View.OnClickListener{

    EditText edtName,edtEmail,edtPass,edtRepeatPass;
    Button btnRegister,btnCancel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_registration, container, false);
        edtName = (EditText)v.findViewById(R.id.edt_register_name);
        edtEmail = (EditText)v.findViewById(R.id.edt_register_email);
        edtPass = (EditText)v.findViewById(R.id.edt_register_pas);
        edtRepeatPass = (EditText)v.findViewById(R.id.edt_register_repeatPas);

        btnRegister = (Button)v.findViewById(R.id.btn_register_reg);
        btnCancel = (Button)v.findViewById(R.id.btn_register_cancel);

        btnRegister.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        switch (v.getId()){
            case R.id.btn_register_reg :
                break;
            case R.id.btn_register_cancel:
                fragmentManager.beginTransaction().replace(R.id.content_frame,new StartFragment()).commit();
                break;
        }
    }
}

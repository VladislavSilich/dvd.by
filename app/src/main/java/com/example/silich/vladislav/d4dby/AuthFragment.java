package com.example.silich.vladislav.d4dby;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class AuthFragment extends android.app.Fragment implements View.OnClickListener{

    EditText edtEmail,edtPass;
    Button btnRegister,btnCancel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_auth,container,false);

        edtEmail = (EditText)v.findViewById(R.id.edt_auth_email);
        edtPass = (EditText)v.findViewById(R.id.edt_auth_pass);

        btnRegister = (Button) v.findViewById(R.id.btn_auth_register);
        btnCancel = (Button)v.findViewById(R.id.btn_auth_cancel);

        btnCancel.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        switch (v.getId()){
            case R.id.btn_auth_register :
                break;
            case R.id.btn_auth_cancel :
                fragmentManager.beginTransaction().replace(R.id.content_frame,new StartFragment()).commit();
                break;
        }
    }
}

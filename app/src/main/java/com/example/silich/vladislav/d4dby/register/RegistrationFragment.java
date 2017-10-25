package com.example.silich.vladislav.d4dby.register;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.silich.vladislav.d4dby.R;
import com.example.silich.vladislav.d4dby.SearchSpareParts.SearchSparePartsFragment;
import com.example.silich.vladislav.d4dby.utills.InputValidation;


public class RegistrationFragment extends android.app.Fragment implements View.OnClickListener{

    private   EditText edtName,edtEmail,edtPass,edtRepeatPass;
    private Button btnRegister,btnCancel;
    private RadioButton buyer,seller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_registration, container, false);
        edtName = (EditText)v.findViewById(R.id.edt_register_name);
        edtEmail = (EditText)v.findViewById(R.id.edt_register_email);
        edtPass = (EditText)v.findViewById(R.id.edt_register_pas);
        edtRepeatPass = (EditText)v.findViewById(R.id.edt_register_repeatPas);

        buyer = (RadioButton)v.findViewById(R.id.radio_register_buyer);
        seller = (RadioButton)v.findViewById(R.id.radio_register_seller);

        btnRegister = (Button)v.findViewById(R.id.btn_register_reg);
        btnCancel = (Button)v.findViewById(R.id.btn_register_cancel);

        btnRegister.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        return v;
    }
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        String name = edtName.getText().toString();
        String email = edtEmail.getText().toString();
        String pass = edtPass.getText().toString();
        String repeatPass = edtRepeatPass.getText().toString();
        switch (v.getId()){
            case R.id.btn_register_reg :
                if (InputValidation.checkEmptyData(name,email,pass,repeatPass,getActivity())){
                    if (InputValidation.checkPasswordEquals(pass,repeatPass,getActivity())) {
                        if(InputValidation.checkCheckBox(buyer.isChecked(),seller.isChecked(),getActivity())) {
                            Toast.makeText(getActivity(), "Добро пожаловать" + " " + name + "!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                break;
            case R.id.btn_register_cancel:
                fragmentManager.beginTransaction().replace(R.id.content_frame,new SearchSparePartsFragment()).commit();
                break;
        }
    }
}

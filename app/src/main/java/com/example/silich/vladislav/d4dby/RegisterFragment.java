package com.example.silich.vladislav.d4dby;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RegisterFragment extends android.app.Fragment implements View.OnClickListener{
    private Button btnRegBuyer;
    private Button btnRegSeller;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_register,container,false);
        btnRegBuyer = (Button)v.findViewById(R.id.btn_register_buyer);
        btnRegSeller = (Button)v.findViewById(R.id.btn_register_seller);

        btnRegBuyer.setOnClickListener(this);
        btnRegSeller.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        switch (v.getId()){
            case R.id.btn_register_buyer:
                break;
            case R.id.btn_register_seller:
                break;
        }
    }
}

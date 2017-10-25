package com.example.silich.vladislav.d4dby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


public class StartFragment extends android.app.Fragment {
    MaterialBetterSpinner spinMarkAuto;
    MaterialBetterSpinner spinModelAuto;
    MaterialBetterSpinner spinYearAuto;
    MaterialBetterSpinner spinCitySearch;

    String [] masMark = {"BMW","asdasdas"};
    String [] masAuto = {"E34","sdada"};
    String [] masYearAuto = {"2017","2016"};
    String [] masCitySearch = {"Москва", "Минск"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start, container, false);

        spinMarkAuto = (MaterialBetterSpinner)v.findViewById(R.id.mark_auto);
        spinModelAuto = (MaterialBetterSpinner)v.findViewById(R.id.model_auto);
        spinYearAuto =(MaterialBetterSpinner)v.findViewById(R.id.year_auto) ;
        spinCitySearch = (MaterialBetterSpinner)v.findViewById(R.id.city_search);
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                 android.R.layout.simple_dropdown_item_1line , masMark);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masAuto);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masYearAuto);
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masCitySearch);


        spinModelAuto.setAdapter(arrayAdapter1);
        spinMarkAuto.setAdapter(arrayAdapter);
        spinYearAuto.setAdapter(arrayAdapter2);
        spinCitySearch.setAdapter(arrayAdapter3);
        return v;


    }

}

package com.example.silich.vladislav.d4dby.SearchSpareParts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.silich.vladislav.d4dby.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


public class SearchSparePartsFragment extends android.app.Fragment {
    private MaterialBetterSpinner spinMarkAuto;
    private MaterialBetterSpinner spinModelAuto;
    private MaterialBetterSpinner spinYearAuto;
    private MaterialBetterSpinner spinCitySearch;

    private ArrayAdapter<String> markAdapter;
    private ArrayAdapter<String> modelAdapter;
    private ArrayAdapter<String> yearsAdapter;
    private ArrayAdapter<String> citySearchAdapter;

    String [] masMark = {"BMW","asdasdas"};
    String [] masAuto = {"E34","sdada"};
    String [] masYearAuto = {"2017","2016"};
    String [] masCitySearch = {"Москва", "Минск"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_serarch_spare_parts, container, false);

        spinMarkAuto = (MaterialBetterSpinner)v.findViewById(R.id.mark_auto);
        spinModelAuto = (MaterialBetterSpinner)v.findViewById(R.id.model_auto);
        spinYearAuto =(MaterialBetterSpinner)v.findViewById(R.id.year_auto) ;
        spinCitySearch = (MaterialBetterSpinner)v.findViewById(R.id.city_search);
          markAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                 android.R.layout.simple_dropdown_item_1line , masMark);
        modelAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masAuto);
        yearsAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masYearAuto);
        citySearchAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masCitySearch);


        spinModelAuto.setAdapter(markAdapter);
        spinMarkAuto.setAdapter(modelAdapter);
        spinYearAuto.setAdapter(yearsAdapter);
        spinCitySearch.setAdapter(citySearchAdapter);
        return v;


    }

}

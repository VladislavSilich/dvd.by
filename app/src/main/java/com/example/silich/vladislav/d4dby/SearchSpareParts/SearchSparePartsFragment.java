package com.example.silich.vladislav.d4dby.SearchSpareParts;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.silich.vladislav.d4dby.R;
import com.example.silich.vladislav.d4dby.listResponce.ListSellersFragment;
import com.example.silich.vladislav.d4dby.manager.DataManager;
import com.example.silich.vladislav.d4dby.model.res.SparePartsRes;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SearchSparePartsFragment extends android.app.Fragment implements View.OnClickListener{
    private MaterialBetterSpinner spinMarkAuto;
    private MaterialBetterSpinner spinModelAuto;
    private MaterialBetterSpinner spinYearAuto;
    private MaterialBetterSpinner spinCitySearch;
	private AutoCompleteTextView edtComleteSpare;
    private Button btnSearchSpare;
	private DataManager manager;
    private ArrayAdapter<String> markAdapter;
    private ArrayAdapter<String> modelAdapter;
    private ArrayAdapter<String> yearsAdapter;
    private ArrayAdapter<String> citySearchAdapter;
	private ArrayList<SparePartsRes> listSpare;
    private FragmentManager fragmentManager;

    ArrayList<String> spareParts;
    String [] masMark = {"BMW","asdasdas"};
    String [] masAuto = {"E34","sdada"};
    List<String> listYear = new ArrayList<>();
    String [] masCitySearch = {"Москва", "Минск"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_serarch_spare_parts, container, false);

        fragmentManager = getFragmentManager();
        listSpare = new ArrayList<>();
		spareParts = new ArrayList<>();
		manager = DataManager.getInstance();
		getSpareParts();
		edtComleteSpare = (AutoCompleteTextView)v.findViewById(R.id.edtComlete_spare) ;
        spinMarkAuto = (MaterialBetterSpinner)v.findViewById(R.id.mark_auto);
        spinModelAuto = (MaterialBetterSpinner)v.findViewById(R.id.model_auto);
        spinYearAuto =(MaterialBetterSpinner)v.findViewById(R.id.year_auto) ;
        spinCitySearch = (MaterialBetterSpinner)v.findViewById(R.id.city_search);

        getActivity().setTitle("Поиск запчастей");
        btnSearchSpare = (Button)v.findViewById(R.id.btnSearchSpare);

        addYearsInList();

          markAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                 android.R.layout.simple_dropdown_item_1line , masMark);
        modelAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masAuto);
        yearsAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, listYear);
        citySearchAdapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                android.R.layout.simple_dropdown_item_1line, masCitySearch);


        spinModelAuto.setAdapter(markAdapter);
        spinMarkAuto.setAdapter(modelAdapter);
        spinYearAuto.setAdapter(yearsAdapter);
        spinCitySearch.setAdapter(citySearchAdapter);

        btnSearchSpare.setOnClickListener(this);
        return v;


    }

	private void getSpareParts() {
		Call<List<SparePartsRes>> call = manager.getSpare();
		call.enqueue(new Callback<List<SparePartsRes>>() {
			@Override
			public void onResponse(Call<List<SparePartsRes>> call, Response<List<SparePartsRes>> response) {
				listSpare.addAll(response.body());
				createListSpare(listSpare);
			}

			@Override
			public void onFailure(Call<List<SparePartsRes>> call, Throwable t) {

			}
		});
	}

	private void addYearsInList() {
        for (int i = 0; i <= 28; i++){
            int sum = 2018 - i;
            listYear.add(String.valueOf(sum));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSearchSpare:
                fragmentManager.beginTransaction().replace(R.id.content_frame, new ListSellersFragment()).addToBackStack("fragBack").commit();
                break;
        }

    }
	public void createListSpare(ArrayList<SparePartsRes> list){
		for (int i = 0; i < list.size(); i++){
			spareParts.add(list.get(i).getName());
		}
		spareParts.size();
		ArrayAdapter<String> adapter =
				new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, spareParts);
		edtComleteSpare.setAdapter(adapter);
	}
}

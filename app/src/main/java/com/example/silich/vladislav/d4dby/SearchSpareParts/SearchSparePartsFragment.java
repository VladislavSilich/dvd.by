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
import com.example.silich.vladislav.d4dby.model.res.MarksResponce;
import com.example.silich.vladislav.d4dby.model.res.SparePartsRes;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SearchSparePartsFragment extends android.app.Fragment implements View.OnClickListener{
    private MaterialBetterSpinner spinnerMarks,spinnerModel,spinnerYear,spinnerCity;
	private AutoCompleteTextView edtComleteSpare;
    private Button btnSearchSpare;
	private DataManager manager;
    private FragmentManager fragmentManager;
	private ArrayList<SparePartsRes> listSpare;
    private ArrayList<String> listMarks;
    private ArrayList<String> listModels;
    private ArrayList<String> listYear;
    private ArrayList<String> listCity;
	private ArrayList<String> spareParts;
	private ArrayList<String> listMarksId;
	private ArrayList<MarksResponce> marksResponces;
	ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_serarch_spare_parts, container, false);

        fragmentManager = getFragmentManager();

		manager = DataManager.getInstance();
		spinnerMarks = (MaterialBetterSpinner)v.findViewById(R.id.mark_auto);
		spinnerModel = (MaterialBetterSpinner)v.findViewById(R.id.model_auto);
		spinnerYear = (MaterialBetterSpinner)v.findViewById(R.id.year_auto);
		spinnerCity = (MaterialBetterSpinner)v.findViewById(R.id.city_search);
		edtComleteSpare = (AutoCompleteTextView)v.findViewById(R.id.edtComlete_spare) ;

        getActivity().setTitle("Поиск запчастей");
        btnSearchSpare = (Button)v.findViewById(R.id.btnSearchSpare);

        marksResponces = new ArrayList<>();
        spareParts = new ArrayList<>();
		listSpare = new ArrayList<>();
		listMarks = new ArrayList<>();
		listModels = new ArrayList<>();
		listModels.add("asdasdsa");
		listYear = new ArrayList<>();
		listCity = new ArrayList<>();
		listCity.add("asda");

		listMarksId = new ArrayList<>();
		generatedYear();
		getAutoMarks();
		getSpareParts();

		adapter = new ArrayAdapter<>(getActivity().getBaseContext(),
				android.R.layout.simple_spinner_item,R.id.row_txt_value, listMarks);
		spinnerMarks.setAdapter(adapter);
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity().getBaseContext(),
				android.R.layout.simple_spinner_item, listModels);
		spinnerModel.setAdapter(adapter1);
		ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity().getBaseContext(),
				android.R.layout.simple_spinner_item, listYear);
		spinnerYear.setAdapter(adapter3);
		ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity().getBaseContext(),
				android.R.layout.simple_spinner_item, listCity);
		spinnerCity.setAdapter(adapter4);
		btnSearchSpare.setOnClickListener(this);
        return v;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSearchSpare:
                fragmentManager.beginTransaction().replace(R.id.content_frame, new ListSellersFragment()).addToBackStack("fragBack").commit();
                break;
        }
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
	public void createListSpare(ArrayList<SparePartsRes> list){
		for (int i = 0; i < list.size(); i++){
			spareParts.add(list.get(i).getName());
		}
		spareParts.size();
		ArrayAdapter<String> adapter =
				new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, spareParts);
		edtComleteSpare.setAdapter(adapter);
	}

	public void  getAutoMarks(){
		final int level = 1;
		Call<List<MarksResponce>> call = manager.getMarksAll(level);
		call.enqueue(new Callback<List<MarksResponce>>() {
			@Override
			public void onResponse(Call<List<MarksResponce>> call, Response<List<MarksResponce>> response) {
				marksResponces.addAll(response.body());
				createListMarks(marksResponces);

			}

			@Override
			public void onFailure(Call<List<MarksResponce>> call, Throwable t) {

			}
		});
	}

	public void createListMarks(ArrayList<MarksResponce> list){
		//ArrayList<MarksSpinnerModel> marksSpinnerModels = new ArrayList<>();

		for (int i = 0; i < list.size(); i++){
			listMarks.add(list.get(i).getName().toString());
		}
		ArrayAdapter<String> adapter =
				new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, listMarks);
		spinnerMarks.setAdapter(adapter);



	}
	public void generatedYear(){
		for (int i = 2018; i >=1990;i--){
			String a = String.valueOf(i);
			listYear.add(a);
		}
	}

}

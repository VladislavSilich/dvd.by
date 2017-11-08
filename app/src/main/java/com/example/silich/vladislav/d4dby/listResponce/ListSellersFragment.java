package com.example.silich.vladislav.d4dby.listResponce;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silich.vladislav.d4dby.R;
import com.example.silich.vladislav.d4dby.adapter.RecyclerSellersAdapter;

import java.util.ArrayList;


public class ListSellersFragment extends android.app.Fragment {
	private RecyclerView recyclerView;
	private RecyclerView.Adapter mAdapter;
	private RecyclerView.LayoutManager mLayoutManager;
	private ArrayList<String> list;
	private ArrayList<String> mLocation;
	private ArrayList<String> mPhone;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_list_sellers, container, false);

		getActivity().setTitle("Продавцы");
		recyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewSellers);
		mLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
		recyclerView.setLayoutManager(mLayoutManager);
		mLocation = new ArrayList<>();
		list = new ArrayList<>();
		mPhone = new ArrayList<>();

		mPhone.add("+375297698675");
		mPhone.add("+375297698675");
		mPhone.add("+375297698675");
		mPhone.add("+375297698675");
		mPhone.add("+375297698675");
		mPhone.add("+375297698675");

		
		mLocation.add("Минск");
		mLocation.add("Минск");
		mLocation.add("Минск");
		mLocation.add("Минск");
		mLocation.add("Минск");
		mLocation.add("Минск");

		list.add("Владислав");
		list.add("Максим ");
		list.add("Артём ");
		list.add("Роман ");
		list.add("Денис ");
		list.add("Илья ");

		mAdapter = new RecyclerSellersAdapter(list,mLocation,mPhone);
		recyclerView.setAdapter(mAdapter);
		return v;
	}




}

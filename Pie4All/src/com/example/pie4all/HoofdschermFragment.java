package com.example.pie4all;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

public class HoofdschermFragment extends Fragment{

	@Override
	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	 {
		View v = inflater.inflate( R.layout.productscherm, container, false );
	  
		return v;
	 }
}


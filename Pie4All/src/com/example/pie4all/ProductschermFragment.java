package com.example.pie4all;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class ProductschermFragment extends Fragment {	//implements OnCliCkListener
	
	private int categorie, productposition;
	private String productnaam;

	@Override
	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	 {
		View v = inflater.inflate( R.layout.productscherm, container, false );
	  
		Button bevestig = (Button) v.findViewById(R.id.bestelbutton);
		//bevestig.setOnClickListener(this);
		
		Button annuleer = (Button) v.findViewById(R.id.Annuleerknop);
		//annuleer.setOnClickListener(this);
		
		TextView titel = (TextView) v.findViewById(R.id.producttekst);
		
		TextView omschrijving = (TextView) v.findViewById(R.id.product_omschrijvingText);
		
		return v;
	 }
	
	
}

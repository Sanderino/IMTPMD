package com.example.pie4all;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BestelFragment extends Fragment implements View.OnClickListener{

	@Override
	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	 {
	  View v = inflater.inflate( R.layout.bestelscherm, container, false );

	  Button bestelKnop = (Button) v.findViewById(R.id.bestelknop_bestelscherm);
	  Button annuleerKnop = (Button) v.findViewById(R.id.annuleerknop_bestelscherm);
	  
	  bestelKnop.setOnClickListener(this);
	  annuleerKnop.setOnClickListener(this);
	 

	  return v;
	 }


	@Override
	public void onClick(View v) {
		TextView username = (TextView) v.findViewById(R.id.naamText);
		TextView adres = (TextView) v.findViewById(R.id.adresText);
		TextView telefoon = (TextView) v.findViewById(R.id.telefoonText);
		TextView email = (TextView) v.findViewById(R.id.emailText);
		
		String usernaamText = usernaam.getText().toString();
		String wachtwoordText = wachtwoord.getText().toString();
		
		System.out.println(usernaamText);
		System.out.println(wachtwoordText);
	//if()
	//{
	//SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(v.getContext());
	//	SharedPreferences.Editor editor = settings.edit();
	//	editor.putString("email", usernaamText);
    //    editor.commit();
	//}
	 
	

	}
}

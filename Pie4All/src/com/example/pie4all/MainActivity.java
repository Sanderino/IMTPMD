package com.example.pie4all;

import com.example.pie4all.R; 
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
	

	//deze methoden worden door de knoppen aangeroepen en zijn gekoppeld in de XML via het onClick attribuut
	public void openProductscherm( View view )
	{
		//toon het optiescherm
		this.setContentView( R.layout.productscherm );

	}
	
	//deze methoden worden door de knoppen aangeroepen en zijn gekoppeld in de XML via het onClick attribuut
	public void openBestelscherm( View view )
	{
		//toon het optiescherm
		this.setContentView( R.layout.bestelscherm );

	}
		
	//deze methoden worden door de knoppen aangeroepen en zijn gekoppeld in de XML via het onClick attribuut
	public void openHoofdscherm( View view )
	{
		//toon het optiescherm
		this.setContentView( R.layout.fragment_main );

	}	
	}

package com.example.projet;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ListeLecture extends Activity{

	ToggleButton toggle1;
	ToggleButton toggle2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liste_lecture);
		
		toggle1 = (ToggleButton)findViewById(R.id.togglebutton1);
		toggle2 = (ToggleButton)findViewById(R.id.togglebutton2);
		
		toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		        if (isChecked) {
		            // The toggle is enabled
		        } else {
		            // The toggle is disabled
		        }
		    }
		});
		
		toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		        if (isChecked) {
		            // The toggle is enabled
		        } else {
		            // The toggle is disabled
		        }
		    }
		});
	}
	

	@Override
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.liste_lecture, menu);
		return true;
	}


}

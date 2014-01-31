package com.example.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainMenu extends Activity implements OnClickListener {

	Button b1 = null;
	Button b2 = null;
	Button b3 = null;
	Button b4 = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		b1 = (Button)findViewById(R.id.button_liste_lecture);
		//b2 = (Button)findViewById(R.id.button_onglet);
		b3 = (Button)findViewById(R.id.button_liste_appareils);
		b4 = (Button)findViewById(R.id.button_parametres);
		
		b1.setOnClickListener(this);
		//b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}


	@Override
	public void onClick(View v) {
		if(v == b1){
			Intent monIntent  = new Intent(this,ListeLecture.class);
			startActivity(monIntent);
		}
		if(v == b2){
			
		}
		if(v == b3){
			
		}
		if(v == b4){
			Intent monIntent  = new Intent(this,Parametres.class);
			startActivity(monIntent);
		}
	}

}

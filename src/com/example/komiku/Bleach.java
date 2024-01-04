package com.example.komiku;

import android.app.Activity;
import android.app.SearchManager.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Bleach extends Activity implements OnClickListener{
	
	Button btnblc1;
	Button btnblc2;
	Button btnblc3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bleach);
		
		btnblc1 = (Button)findViewById(R.id.btnblc1);
		btnblc2 = (Button)findViewById(R.id.btnblc2);
		btnblc3 = (Button)findViewById(R.id.btnblc3);
		
		btnblc1.setOnClickListener(this);
		btnblc2.setOnClickListener(this);
		btnblc3.setOnClickListener(this);
			}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if ( v == btnblc1){
			Intent i = new Intent(this, Blc1.class);
			startActivity(i);
		}
		else if (v == btnblc2)
		{
			Intent i = new Intent(this, Blc2.class);
			startActivity(i);
		}
		else if (v == btnblc3)
		{
			Intent i = new Intent(this, Blc3.class);
			startActivity(i);
		}
	}

}

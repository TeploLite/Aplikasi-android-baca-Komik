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

public class Capter extends Activity implements OnClickListener{
	
	Button btncsmcp1;
	Button btncsmcp2;
	Button btncsmcp3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.capter);
		
		btncsmcp1 = (Button)findViewById(R.id.btncsmcp1);
		btncsmcp2 = (Button)findViewById(R.id.btncsmcp2);
		btncsmcp3 = (Button)findViewById(R.id.btncsmcp3);
		
		btncsmcp1.setOnClickListener(this);
		btncsmcp2.setOnClickListener(this);
		btncsmcp3.setOnClickListener(this);
			}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if ( v == btncsmcp1){
			Intent i = new Intent(this, Csm1.class);
			startActivity(i);
		}
		else if (v == btncsmcp2)
		{
			Intent i = new Intent(this, Csm2.class);
			startActivity(i);
		}
		else if (v == btncsmcp3)
		{
			Intent i = new Intent(this, Csm3.class);
			startActivity(i);
		}
	}

}
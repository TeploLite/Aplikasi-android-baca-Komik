package com.example.komiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;



public class Judul extends Activity implements OnClickListener{
	Button btnjudul1;
	Button btnjudul2;
		
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		btnjudul1 = (Button)findViewById(R.id.btnjudul1);
		btnjudul2 = (Button)findViewById(R.id.btnjudul2);
		
		btnjudul1.setOnClickListener(this);
		btnjudul2.setOnClickListener(this);
			}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if ( v == btnjudul1){
			Intent i = new Intent(this, Capter.class);
			startActivity(i);
		}
		else if (v == btnjudul2)
		{
			Intent i = new Intent(this, Bleach.class);
			startActivity(i);
		}
	}
}
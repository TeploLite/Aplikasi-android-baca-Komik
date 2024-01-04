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



public class Anime extends Activity implements OnClickListener{
	Button btnjudul1;
		
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anime);
		
		btnjudul1 = (Button)findViewById(R.id.btnjudul1);
				
		btnjudul1.setOnClickListener(this);
					}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if ( v == btnjudul1){
			Intent i = new Intent(this, Naruto1.class);
			startActivity(i);
		}
		
	}
}

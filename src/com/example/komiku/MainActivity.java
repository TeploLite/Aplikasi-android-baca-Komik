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

public class MainActivity extends Activity implements OnClickListener{
	Button btnmenu1;
	Button btnmenu2;
	Button btnkeluar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnmenu1 = (Button)findViewById(R.id.btnmenu1);
		btnmenu2 = (Button)findViewById(R.id.btnmenu2);
		btnkeluar = (Button)findViewById(R.id.btnkeluar);
		
		
		btnmenu1.setOnClickListener(this);
		btnmenu2.setOnClickListener(this);
		btnkeluar.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if ( v == btnmenu1){
			Intent i = new Intent(this, Judul.class);
			startActivity(i);
		}
		else if (v == btnmenu2)
		{
			Intent i = new Intent(this, Anime.class);
			startActivity(i);
		}else if (v == btnkeluar)
		{
			finish();
		}
	}
}

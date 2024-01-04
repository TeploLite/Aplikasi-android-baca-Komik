package com.example.komiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Window;

public class Loading extends Activity{
	

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.loading);
			Thread timer = new Thread(){
			public void run(){
				try {
					sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally{
					finish();
					Intent lay2 = new Intent(Loading.this, MainActivity.class);
					startActivityForResult(lay2, 2);
				}
			}
			};
			timer.start();
		}
	}



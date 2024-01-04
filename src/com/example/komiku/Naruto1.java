package com.example.komiku;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Environment;
import android.content.Intent;
import android.net.*;
import java.io.*;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Naruto1 extends Activity{
	
	String srcpath = ("android.resource://" + getPackageName() + "/" + R.raw.cob);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.TRANSLUCENT);
		setContentView(R.layout.naruto1);
		VideoView videoView1 = (VideoView)findViewById(R.id.videoView1);
		videoView1.setVideoPath(srcpath);
		videoView1.setMediaController(new MediaController(this));
		videoView1.requestFocus();
			
		//Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cob);
		//videoView1.setVideoURI(uri);
		//videoView1.start();		
	
	}
	
}

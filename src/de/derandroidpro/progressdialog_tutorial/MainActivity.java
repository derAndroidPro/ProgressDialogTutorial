package de.derandroidpro.progressdialog_tutorial;

import android.support.v7.app.ActionBarActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	public Button btn1;
	public ProgressDialog pd1;
	
	public int value = 50;
	public int max = 200;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		
		pd1 = new ProgressDialog(this);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1:{
			
			pd1.setTitle("Laden....");
			pd1.setMessage("Bitte warten...");
			pd1.setIcon(R.drawable.ic_launcher);
			
			pd1.setCanceledOnTouchOutside(false);
			
			pd1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			
			pd1.setMax(max);
			pd1.show();
			
			pd1.setProgress(value);
			
			
		}
		
		}
		
	}


}

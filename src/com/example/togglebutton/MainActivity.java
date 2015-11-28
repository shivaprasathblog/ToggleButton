package com.example.togglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity 

{
	//STEP 1 : Defining the Toggle button
	ToggleButton tbt;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//STEP 2 : Referring the toggle button from xml
		tbt=(ToggleButton)findViewById(R.id.toggleButton1);
		//STEP 3 : Creating on checked change listener for Toggle Button 
		tbt.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				//STEP 4 : If Toggle button is in condition one
				if(arg1==true)
				{
					 Toast.makeText(getApplicationContext(), "Machine is ON , Press to OFF",Toast.LENGTH_LONG).show();
				}
				//STEP 5 : If Toggle button is in condition two
				else if(arg1==false)
				{
					 Toast.makeText(getApplicationContext(), " Machine is OFF , Press to ON ",Toast.LENGTH_LONG).show();
				}
				
			}
		});
	}

	

}

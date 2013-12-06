package com.example.test;

import java.util.ArrayList;
import java.util.List;





import android.R.string;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Mpbyname extends Activity {
	
	SQLiteConnector sqlConnect;
public static String mpnamesearch;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mpbyname);
		
		
		
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mpbyname, menu);
		return true;
	}
	
	 public void onClickMpName(View v) {
		 EditText  mpname=(EditText)findViewById(R.id.mpname);
		 mpnamesearch=mpname.getText().toString();
			System.out.print(mpnamesearch);
		 ListView listmpbyname = (ListView) findViewById(R.id.listView1);
			sqlConnect = new SQLiteConnector(this);
			Log.d("AISI",Mpbyname.mpnamesearch);
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, sqlConnect.mpname());
			listmpbyname.setAdapter(adapter);
        }
	
	
	}
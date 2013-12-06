package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Constituency extends Activity {
	public static String Constituencysearch;
	ListView listconstituency;
	SQLiteConnector sqlConnect;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_constituency);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.constituency, menu);
		return true;
	}

	public void onClickConstituency(View v) {
		 EditText ConstituencyText=(EditText)findViewById(R.id.ConstituencyText);
		Constituencysearch =ConstituencyText.getText().toString();
		listconstituency = (ListView) findViewById(R.id.list_constituency);
			sqlConnect = new SQLiteConnector(this);
		
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, sqlConnect.constituency());
			listconstituency.setAdapter(adapter);
       }
	
}

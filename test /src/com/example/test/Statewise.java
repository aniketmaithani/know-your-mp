package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Statewise extends Activity {
	
	public static String Statewisesearch;
	ListView liststatewise;
	SQLiteConnector sqlConnect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_statewise);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.statewise, menu);
		return true;
	}

	public void onClickStatewise(View v) {
		 EditText  statewise=(EditText)findViewById(R.id.statewiseText);
		 Statewisesearch=statewise.getText().toString();
		
		 ListView liststatewise = (ListView) findViewById(R.id.statewiselist);
			sqlConnect = new SQLiteConnector(this);

			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, sqlConnect.statewise());
			liststatewise.setAdapter(adapter);
       }
	
}

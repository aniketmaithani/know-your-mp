package com.example.test;

import java.util.ArrayList;
import java.util.List;
import com.example.test.Mpbyname;




import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
/**
 * 
 * @author manish.s
 *
 */

public class SQLiteConnector extends Activity{
	
	private SQLiteDatabase database;
	private SQLiteHelper sqlHelper;
	private Cursor cursor;
	private String mpname=Mpbyname.mpnamesearch;
	private String constituency=Constituency.Constituencysearch;
	private String state=Statewise.Statewisesearch;
	private static final String TABLE_RECORD = "mp";
	
	public SQLiteConnector(Context context) {
		sqlHelper = new SQLiteHelper(context);
		
	}
	
	// Getting All records
			public List<String> mpname() {
			
				List<String> studentList = new ArrayList<String>();
				
				String selectQuery = "SELECT  Attendance,name FROM " + TABLE_RECORD + " where name LIKE '"+mpname+"' ; ";

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery(selectQuery, null);
				if (cursor.moveToFirst()) {
					do {
						studentList.add(cursor.getString(0)+"  "+cursor.getString(1));
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}
			
			public List<String> constituency() {
				
				List<String> studentList = new ArrayList<String>();
				
				String selectQuery = "SELECT  Attendance,name FROM " + TABLE_RECORD + " where Constituency LIKE '"+constituency+"' ; ";

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery(selectQuery, null);
				if (cursor.moveToFirst()) {
					do {
						studentList.add(cursor.getString(0)+"  "+cursor.getString(1));
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}
			
public List<String> statewise() {
				
				List<String> studentList = new ArrayList<String>();
				
				String selectQuery = "SELECT  Attendance,name FROM " + TABLE_RECORD + " where State LIKE '"+state+"' ; ";

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery(selectQuery, null);
				if (cursor.moveToFirst()) {
					do {
						studentList.add(cursor.getString(0)+"  "+cursor.getString(1));
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}

	
}

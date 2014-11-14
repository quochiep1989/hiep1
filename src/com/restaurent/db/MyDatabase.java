package com.restaurent.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase {

	String DATABASE_NAME = "db_easy_order";
	private static Context context;
	private static SQLiteDatabase db;
	private DBHelper dbHelper;

	public MyDatabase(Context c) {
		MyDatabase.context = c;
	}

	public MyDatabase open() throws SQLException {

		dbHelper = new DBHelper(context);
		db = dbHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		dbHelper.close();
	}

	private class DBHelper extends SQLiteOpenHelper {

		public DBHelper(Context context) {
			super(context, DATABASE_NAME, null, 1);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			try {

				// CREATE TABLE NHAN VIEN
				db.execSQL("CREATE TABLE NHANVIEN (username VARCHAR(50), password VARCHAR(20));");

				// CREATE TABLE THUC DON
				db.execSQL("CREATE TABLE THUCDON (dodung VARCHAR(100), gia VARCHAR(20));");

			} catch (Exception e) {

			}
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS NHANVIEN;");
			db.execSQL("DROP TABLE IF EXISTS THUCDON;");

			onCreate(db);
		}

	}
}

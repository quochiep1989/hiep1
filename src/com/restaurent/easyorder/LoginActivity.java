package com.restaurent.easyorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
	
	public void Click_Login(View v){
		Intent i = new Intent(LoginActivity.this, MainActivity.class);
		LoginActivity.this.startActivity(i);
	}
}

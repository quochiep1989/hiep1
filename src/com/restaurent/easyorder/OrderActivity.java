package com.restaurent.easyorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OrderActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.order_back_home, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemid = item.getItemId();

		if (itemid == R.id.backHome) {
			Intent i = new Intent(OrderActivity.this, MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
					| Intent.FLAG_ACTIVITY_CLEAR_TASK);
			OrderActivity.this.startActivity(i);
		} else if (itemid == R.id.Setting) {
			Intent i = new Intent(OrderActivity.this, SettingActivity.class);
			OrderActivity.this.startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}
}

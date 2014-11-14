package com.restaurent.easyorder;

import com.restaurent.setting.SettingActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final LinearLayout lm = (LinearLayout) findViewById(R.id.LinearLayout1);

		// create the layout params that will be used to define how your
		// button will be displayed
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		// Create four
		int k = 0;
		for (int i = 0; i <= 20; i++) {
			// Create LinearLayout
			LinearLayout ll2 = new LinearLayout(this);
			ll2.setOrientation(LinearLayout.HORIZONTAL);
			for (int j = 0; j <= 3; j++) {
				// Create LinearLayout
				LinearLayout ll = new LinearLayout(this);
				ll.setOrientation(LinearLayout.HORIZONTAL);

				// Create ImageButton
				final ImageButton btn1 = new ImageButton(this);
				// Give button an ID
				btn1.setId(i + j + 1);
				btn1.setClickable(true);
				btn1.setImageResource(R.drawable.table86);
				btn1.setBackgroundColor(Color.parseColor("#d9d7d7"));
				btn1.setPadding(5, 5, 5, 5);
				//btn1.setText("Ban ");
				// set the layoutParams on the button
				btn1.setLayoutParams(params);

				final int index = i+j+1+k;
				// Set click listener for button
				btn1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
//						Log.i("TAG", "index :" + index);
//
//						Toast.makeText(getApplicationContext(),
//								"Clicked Button Index :" + index,
//								Toast.LENGTH_LONG).show();
						Intent i = new Intent(MainActivity.this, OrderActivity.class);
						MainActivity.this.startActivity(i);

					}
				});
				// Add button to LinearLayout
				ll2.addView(btn1);
				// Add button to LinearLayout defined in XML

			}
			k=k+3;
			lm.addView(ll2);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemid = item.getItemId();
		String a="1";

		if (itemid == R.id.Setting) {
			//Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_SHORT).show();
			Intent i = new Intent(MainActivity.this, SettingActivity.class);
			MainActivity.this.startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}
}

package com.restaurent.setting;

import com.restaurent.easyorder.MainActivity;
import com.restaurent.easyorder.R;
import com.restaurent.easyorder.R.id;
import com.restaurent.easyorder.R.layout;
import com.restaurent.easyorder.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SettingActivity extends Activity {

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		int itemid = item.getItemId();

		if (itemid == R.id.backHome) {
			Intent i = new Intent(SettingActivity.this, MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
					| Intent.FLAG_ACTIVITY_CLEAR_TASK);
			SettingActivity.this.startActivity(i);
		}
		if (itemid == R.id.AddDodung) {
			LinearLayout layout_adddondung = (LinearLayout) findViewById(R.id.layout_addDodung);
			if (layout_adddondung.getVisibility()==View.GONE) {
				layout_adddondung.setVisibility(View.VISIBLE);
			}else {
				layout_adddondung.setVisibility(View.GONE);
			}
		}
		
		return super.onMenuItemSelected(featureId, item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.setting_back_home, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		init();
	}
	public void init(){
		LinearLayout layout_adddondung = (LinearLayout) findViewById(R.id.layout_addDodung);
		layout_adddondung.setVisibility(View.GONE);
	}
}

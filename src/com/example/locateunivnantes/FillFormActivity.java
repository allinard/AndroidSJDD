package com.example.locateunivnantes;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FillFormActivity extends Activity {

		Button buttonLaunchClassification;

		/**
		 * 
		 */
		private Menu m = null;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			// Choix du layou activity_choix_action.xml
			setContentView(R.layout.activity_fill_form);

			addListenerOnButtonLaunchClassification();
		}

		private void addListenerOnButtonLaunchClassification() {
			buttonLaunchClassification = (Button) findViewById(R.id.btnLaunchClassification);
			
			buttonLaunchClassification.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(FillFormActivity.this,
							ClassifyActivity.class);
					startActivity(intent);
				}

			});
		}


		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.main, menu);
			m = menu;
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			Configuration c = new Configuration(getResources()
					.getConfiguration());
			switch (item.getItemId()) {
			case R.id.item1:
				Intent intent1 = new Intent(FillFormActivity.this,
						MainActivity.class);
				startActivity(intent1);
				return true;
			case R.id.item5:
				return true;
			case R.id.item7:
				c.locale = new Locale("es");
				getResources().updateConfiguration(c,
						getResources().getDisplayMetrics());
				return true;
			case R.id.item8:
				c.locale = new Locale("ct");
				getResources().updateConfiguration(c,
						getResources().getDisplayMetrics());
				return true;
			case R.id.item6:
				Intent intent = new Intent(FillFormActivity.this,
						AideActivity.class);
				startActivity(intent);
				return true;
			}
			return super.onOptionsItemSelected(item);
		}


	
}

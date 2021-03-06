package com.example.asmaprediccio;

import java.util.Locale;

import com.example.asmaprediccio.R;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity pour choisir l'action que l'utilisateur veut effectuer (localisation
 * ou navigation)
 * 
 * @author Alex
 * 
 */
public class ChoixActionActivity extends Activity {

	/**
	 * Bouton aller vers (= choix navigation)
	 */
	Button buttonFillForm;

	/**
	 * Bouton Ou suis-je (= choix localisation)
	 */
	Button buttonConnectDatabase;

	/**
	 * 
	 */
	private Menu m = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Choix du layou activity_choix_action.xml
		setContentView(R.layout.activity_choix_action);
		// d�claration des listeners
		addListenerOnButtonFillForm();
		addListenerOnButtonConnectDatabase();
	}

	/**
	 * Listener sur le bouton aller vers
	 */
	private void addListenerOnButtonFillForm() {
		buttonFillForm = (Button) findViewById(R.id.btnFillForm);

		buttonFillForm.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Lorsque clique sur le bouton Aller vers, on d�marre une
				// nouvelle activity (ChoixDestination), pour choisir la
				// destination voulue
				Intent intent = new Intent(ChoixActionActivity.this,
						FillFormActivity.class);
				startActivity(intent);
			}

		});

	}

	/**
	 * 
	 */
	private void addListenerOnButtonConnectDatabase() {
		buttonConnectDatabase = (Button) findViewById(R.id.btnConnectDatabase);

		buttonConnectDatabase.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(
						getApplicationContext(),"Todavía no implementado\nEncara no implementat", Toast.LENGTH_LONG).show();
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
			Intent intent1 = new Intent(ChoixActionActivity.this,
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
			Intent intent = new Intent(ChoixActionActivity.this,
					AideActivity.class);
			startActivity(intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

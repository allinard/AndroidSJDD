package com.example.asmaprediccio;

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
import android.widget.EditText;
import android.widget.Toast;

import com.example.asmaprediccio.utils.LoginHospSJD;
import com.example.asmaprediccio.R;

/**
 * Activity pour le login
 * @author Alex
 *
 */
public class LoginActivity extends Activity {

	/**
	 * Bouton pour effectuer le login
	 */
	Button buttonLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//on choisit le layout activity_login.xml
		setContentView(R.layout.activity_login);
		//on ajoute les listeners sur les boutons
		addListenerOnButtonLogin();
	}

	private Menu m = null;

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
			Intent intent1 = new Intent(LoginActivity.this,
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
			Intent intent = new Intent(LoginActivity.this,
					AideActivity.class);
			startActivity(intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
	/**
	 * Listener sur le bouton login
	 */
	public void addListenerOnButtonLogin() {
		buttonLogin = (Button) findViewById(R.id.btnLogin);
		buttonLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//on r�cupere le login et mdp
				EditText login = (EditText) findViewById(R.id.editTextLogin);
				EditText password = (EditText) findViewById(R.id.editTextPassWd);
				
				//on recup�re l'instance du LoginCASUnivNantes
				LoginHospSJD loginCASUnivNantes = LoginHospSJD.getInstance();
				
				//si le login est ok, on bascule sur ChoixActionActivity
				if(loginCASUnivNantes.logIn(login.getText().toString(), password.getText().toString())){
					Intent intent = new Intent(LoginActivity.this,
							ChoixActionActivity.class);
					startActivity(intent);
				}
				//sinon on redemande le login et le mdp en affichant un message et en nettoyant les champs du formulaire
				else{
					login.setText("");
					password.setText("");
					Toast toast = Toast.makeText(getApplicationContext(),"Conexión fallida\nConnexió fallida", Toast.LENGTH_LONG);
					toast.show();
				}
			}

		});
	}
	
}



package com.example.asmaprediccio;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

import com.example.asmaprediccio.R;
import com.example.asmaprediccio.utils.ArffWriter;
import com.example.asmaprediccio.utils.WekaPredictor;

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

public class ClassifyActivity extends Activity {

	private Menu m = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Choix du layou activity_choix_action.xml
		setContentView(R.layout.activity_classify);

		// Donde producemos un arff
		doWriteArff();

		// Donde arrancamos el arff en el modelo
		doClassify();
	}

	private void doClassify() {

		// Copy resultat4Android.arff on sd card
		File f = new File("/sdcard/resultat4Android.arff");
		if (!f.exists()) {
			try {
				InputStream is = getAssets().open("resultat4Android.arff");
				int size = is.available();
				byte[] buffer = new byte[size];
				is.read(buffer);
				is.close();

				java.io.FileOutputStream fos = new java.io.FileOutputStream(f);
				fos.write(buffer);
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		List<double[]> machin = WekaPredictor.classify();
	}

	private void doWriteArff() {
		Bundle b = getIntent().getExtras();
		String arffLine = "";
		arffLine += "\"" + b.getString("fechaini") + "\",";
		arffLine += b.getString("edad") + ",";
		arffLine += b.getString("codigopoblacion") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesambquinafreqüènciahatositduranteldiaenausènciaderefredat")
				+ ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasperlanit")
				+ ",";
		arffLine += b.getString("Altresmanifestacionsdatòpia") + ",";
		arffLine += b.getString("Edatdinicipatologiarespiratoriaanys") + ",";
		arffLine += b.getString("Antecedentspersonals") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesquantesvegadeshaingresatenelhospitalacausadelasma")
				+ ",";
		arffLine += b.getString("Símptomesintercrisisasma") + ",";
		arffLine += b.getString("CANControlAsmaNens07puntsboncontrol") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesAmbquinafreqüènciahatingutxiuletsosibilànciesdurantlanit")
				+ ",";
		arffLine += b.getString("Desencadenants") + ",";
		arffLine += b.getString("Moquetescatifesendomicilihabitual") + ",";
		arffLine += b.getString("Freqüènciacrisisasma") + ",";
		arffLine += b.getString("Ingresosperasma") + ",";
		arffLine += b.getString("Tractamentdebaseperlasma") + ",";
		arffLine += b.getString("asma") + ",";
		arffLine += b.getString("rinitis") + ",";
		arffLine += b.getString("acaros") + ",";
		arffLine += b.getString("alergia") + ",";
		arffLine += b.getString("rinoconjuntivitis") + ",";
		arffLine += b.getString("budesonida") + ",";
		arffLine += b.getString("fluticasona") + ",";
		arffLine += b.getString("ciclesonida") + ",";
		arffLine += b.getString("mometasona") + ",";
		arffLine += b.getString("montelukast") + ",";
		arffLine += b.getString("singulair") + ",";
		arffLine += b.getString("salmeterolfluticasona") + ",";
		arffLine += b.getString("formoterolbudesonida") + ",";
		arffLine += b.getString("omalizumab") + ",";
		arffLine += b.getString("ocs") + ",";
		arffLine += b.getString("salbutamol") + ",";
		arffLine += b.getString("Tossibilàncies") + ",";
		arffLine += b.getString("Símptomesderinoconjuntivitis") + ",";
		arffLine += b.getString("Fumadorsaldomicilihabitual") + ",";
		arffLine += b.getString("Medicacióderescat") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasduranteldia")
				+ ",";
		arffLine += b.getString("Respostaabroncodilatadors") + ",";
		arffLine += b.getString("Dispneadiurna") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesquanfaelnenexercicioesriuarialladestexiuletsotos")
				+ ",";
		arffLine += b.getString("Estacionalitat") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesquantsdieshavingutaurgènciesacausadelasma")
				+ ",";
		arffLine += b.getString("evolucioPatologia") + ",";
		arffLine += b.getString("Antecedentsfamiliarsdatòpia") + ",";
		arffLine += b.getString("ReaccionsalaITE") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesambquinafreqüènciahatositdurantlanitenausènciaderefredat")
				+ ",";
		arffLine += b.getString("Altresantecedentsfamiliarsdinterès") + ",";
		arffLine += b.getString("Dispneanocturna") + ",";
		arffLine += b.getString("Immunoteràpia") + ",";
		arffLine += b.getString("Crisisdasma") + ",";
		arffLine += b.getString("pis") + ",";
		arffLine += b.getString("humed") + ",";
		arffLine += b.getString("casa") + ",";
		arffLine += b.getString("ventilad") + ",";
		arffLine += b.getString("solead") + ",";
		arffLine += b.getString("peluches") + ",";
		arffLine += b
				.getString("Enlesdarreres4setmanesambquinafreqüènciahatingutxiuletsosibilànciesduranteldia")
				+ ",";
		arffLine += b.getString("Animalsaldomicilihabitual") + ",";
		arffLine += b.getString("Tractamentdebaseperlarinitis") + ",";
		arffLine += b.getString("Faltesescolars") + ",";
		arffLine += b.getString("Símptomésambesforç") + ",";
		arffLine += b.getString("numurgenciasnecesitandoingres") + ",";
		arffLine += b.getString("numurgenciasnecesitandoingresno") + ",";
		arffLine += b.getString("Visitesaurgències");
		arffLine = arffLine.replaceAll(",,", ",?,");
		ArffWriter.writeOnSD(arffLine);
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
		Configuration c = new Configuration(getResources().getConfiguration());
		switch (item.getItemId()) {
		case R.id.item1:
			Intent intent1 = new Intent(ClassifyActivity.this,
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
			Intent intent = new Intent(ClassifyActivity.this,
					AideActivity.class);
			startActivity(intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

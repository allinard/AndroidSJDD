package com.example.asmaprediccio;

import java.util.Locale;

import com.example.asmaprediccio.R;

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
import android.widget.CheckBox;
import android.widget.EditText;
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
					
					EditText fechaini = (EditText) findViewById(R.id.fechaini);
					EditText edad = (EditText) findViewById(R.id.edad);
					EditText codigopoblacion = (EditText) findViewById(R.id.codigopoblacion);
					EditText Enlesdarreres4setmanesambquinafreqüènciahatositduranteldiaenausènciaderefredat = (EditText) findViewById(R.id.Enlesdarreres4setmanesambquinafreqüènciahatositduranteldiaenausènciaderefredat);
					EditText Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasperlanit = (EditText) findViewById(R.id.Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasperlanit);
					CheckBox Altresmanifestacionsdatòpia = (CheckBox) findViewById(R.id.Altresmanifestacionsdatòpia);
					EditText Edatdinicipatologiarespiratoriaanys = (EditText) findViewById(R.id.Edatdinicipatologiarespiratoriaanys);
					CheckBox Antecedentspersonals = (CheckBox) findViewById(R.id.Antecedentspersonals);
					EditText Enlesdarreres4setmanesquantesvegadeshaingresatenelhospitalacausadelasma = (EditText) findViewById(R.id.Enlesdarreres4setmanesquantesvegadeshaingresatenelhospitalacausadelasma);
					CheckBox Símptomesintercrisisasma = (CheckBox) findViewById(R.id.Símptomesintercrisisasma);
					EditText CANControlAsmaNens07puntsboncontrol = (EditText) findViewById(R.id.CANControlAsmaNens07puntsboncontrol);
					EditText Enlesdarreres4setmanesAmbquinafreqüènciahatingutxiuletsosibilànciesdurantlanit = (EditText) findViewById(R.id.Enlesdarreres4setmanesAmbquinafreqüènciahatingutxiuletsosibilànciesdurantlanit);
					CheckBox Desencadenants = (CheckBox) findViewById(R.id.Desencadenants);
					CheckBox Moquetescatifesendomicilihabitual = (CheckBox) findViewById(R.id.Moquetescatifesendomicilihabitual);
					CheckBox Visitesaurgències = (CheckBox) findViewById(R.id.Visitesaurgències);
					EditText Freqüènciacrisisasma = (EditText) findViewById(R.id.Freqüènciacrisisasma);
					CheckBox Ingresosperasma = (CheckBox) findViewById(R.id.Ingresosperasma);
					CheckBox Tractamentdebaseperlasma = (CheckBox) findViewById(R.id.Tractamentdebaseperlasma);
					CheckBox asma = (CheckBox) findViewById(R.id.asma);
					CheckBox rinitis = (CheckBox) findViewById(R.id.rinitis);
					CheckBox acaros = (CheckBox) findViewById(R.id.acaros);
					CheckBox alergia = (CheckBox) findViewById(R.id.alergia);
					CheckBox rinoconjuntivitis = (CheckBox) findViewById(R.id.rinoconjuntivitis);
					CheckBox budesonida = (CheckBox) findViewById(R.id.budesonida);
					CheckBox fluticasona = (CheckBox) findViewById(R.id.fluticasona);
					CheckBox ciclesonida = (CheckBox) findViewById(R.id.ciclesonida);
					CheckBox mometasona = (CheckBox) findViewById(R.id.mometasona);
					CheckBox montelukast = (CheckBox) findViewById(R.id.montelukast);
					CheckBox singulair = (CheckBox) findViewById(R.id.singulair);
					CheckBox salmeterolfluticasona = (CheckBox) findViewById(R.id.salmeterolfluticasona);
					CheckBox formoterolbudesonida = (CheckBox) findViewById(R.id.formoterolbudesonida);
					CheckBox omalizumab = (CheckBox) findViewById(R.id.omalizumab);
					CheckBox ocs = (CheckBox) findViewById(R.id.ocs);
					CheckBox salbutamol = (CheckBox) findViewById(R.id.salbutamol);
					CheckBox Tossibilàncies = (CheckBox) findViewById(R.id.Tossibilàncies);
					CheckBox Símptomesderinoconjuntivitis = (CheckBox) findViewById(R.id.Símptomesderinoconjuntivitis);
					CheckBox Fumadorsaldomicilihabitual = (CheckBox) findViewById(R.id.Fumadorsaldomicilihabitual);
					CheckBox Medicacióderescat = (CheckBox) findViewById(R.id.Medicacióderescat);
					EditText Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasduranteldia = (EditText) findViewById(R.id.Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasduranteldia);
					CheckBox Respostaabroncodilatadorsini = (CheckBox) findViewById(R.id.Respostaabroncodilatadors);
					CheckBox Dispneadiurna = (CheckBox) findViewById(R.id.Dispneadiurna);
					EditText Enlesdarreres4setmanesquanfaelnenexercicioesriuarialladestexiuletsotos = (EditText) findViewById(R.id.Enlesdarreres4setmanesquanfaelnenexercicioesriuarialladestexiuletsotos);
					CheckBox Estacionalitat = (CheckBox) findViewById(R.id.Estacionalitat);
					EditText Enlesdarreres4setmanesquantsdieshavingutaurgènciesacausadelasma = (EditText) findViewById(R.id.Enlesdarreres4setmanesquantsdieshavingutaurgènciesacausadelasma);
					CheckBox evolucioPatologia = (CheckBox) findViewById(R.id.evolucioPatologia);
					CheckBox Antecedentsfamiliarsdatòpia = (CheckBox) findViewById(R.id.Antecedentsfamiliarsdatòpia);
					CheckBox ReaccionsalaITE = (CheckBox) findViewById(R.id.ReaccionsalaITE);
					EditText Enlesdarreres4setmanesambquinafreqüènciahatositdurantlanitenausènciaderefredat = (EditText) findViewById(R.id.Enlesdarreres4setmanesambquinafreqüènciahatositdurantlanitenausènciaderefredat);
					CheckBox Altresantecedentsfamiliarsdinterès = (CheckBox) findViewById(R.id.Altresantecedentsfamiliarsdinterès);
					CheckBox Dispneanocturna = (CheckBox) findViewById(R.id.Dispneanocturna);
					CheckBox Immunoteràpia = (CheckBox) findViewById(R.id.Immunoteràpia);
					CheckBox Crisisdasma = (CheckBox) findViewById(R.id.Crisisdasma);
					CheckBox pis = (CheckBox) findViewById(R.id.pis);
					CheckBox humed = (CheckBox) findViewById(R.id.humed);
					CheckBox casa = (CheckBox) findViewById(R.id.casa);
					CheckBox ventilad = (CheckBox) findViewById(R.id.ventilad);
					CheckBox solead = (CheckBox) findViewById(R.id.solead);
					CheckBox peluches = (CheckBox) findViewById(R.id.peluches);
					EditText Enlesdarreres4setmanesambquinafreqüènciahatingutxiuletsosibilànciesduranteldia = (EditText) findViewById(R.id.Enlesdarreres4setmanesambquinafreqüènciahatingutxiuletsosibilànciesduranteldia);
					CheckBox Animalsaldomicilihabitual = (CheckBox) findViewById(R.id.Animalsaldomicilihabitual);
					CheckBox Tractamentdebaseperlarinitis = (CheckBox) findViewById(R.id.Tractamentdebaseperlarinitis);
					CheckBox Faltesescolars = (CheckBox) findViewById(R.id.Faltesescolars);
					CheckBox Símptomésambesforç = (CheckBox) findViewById(R.id.Símptomésambesforç);
					EditText numurgenciasnecesitandoingres = (EditText) findViewById(R.id.numurgenciasnecesitandoingres);
					EditText numurgenciasnecesitandoingresno = (EditText) findViewById(R.id.numurgenciasnecesitandoingresno);
					
					
					intent.putExtra("fechaini",fechaini.getText().toString());
					intent.putExtra("edad",edad.getText().toString());
					intent.putExtra("codigopoblacion",codigopoblacion.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesambquinafreqüènciahatositduranteldiaenausènciaderefredat",Enlesdarreres4setmanesambquinafreqüènciahatositduranteldiaenausènciaderefredat.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasperlanit",Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasperlanit.getText().toString());
					intent.putExtra("Edatdinicipatologiarespiratoriaanys",Edatdinicipatologiarespiratoriaanys.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesquantesvegadeshaingresatenelhospitalacausadelasma",Enlesdarreres4setmanesquantesvegadeshaingresatenelhospitalacausadelasma.getText().toString());
					intent.putExtra("CANControlAsmaNens07puntsboncontrol",CANControlAsmaNens07puntsboncontrol.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesAmbquinafreqüènciahatingutxiuletsosibilànciesdurantlanit",Enlesdarreres4setmanesAmbquinafreqüènciahatingutxiuletsosibilànciesdurantlanit.getText().toString());
					intent.putExtra("Freqüènciacrisisasma",Freqüènciacrisisasma.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasduranteldia",Enlesdarreres4setmanesambquinafreqüèncialihacostatrespirarnopelnasduranteldia.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesquanfaelnenexercicioesriuarialladestexiuletsotos",Enlesdarreres4setmanesquanfaelnenexercicioesriuarialladestexiuletsotos.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesquantsdieshavingutaurgènciesacausadelasma",Enlesdarreres4setmanesquantsdieshavingutaurgènciesacausadelasma.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesambquinafreqüènciahatositdurantlanitenausènciaderefredat",Enlesdarreres4setmanesambquinafreqüènciahatositdurantlanitenausènciaderefredat.getText().toString());
					intent.putExtra("Enlesdarreres4setmanesambquinafreqüènciahatingutxiuletsosibilànciesduranteldia",Enlesdarreres4setmanesambquinafreqüènciahatingutxiuletsosibilànciesduranteldia.getText().toString());
					intent.putExtra("numurgenciasnecesitandoingres",numurgenciasnecesitandoingres.getText().toString());
					intent.putExtra("numurgenciasnecesitandoingresno",numurgenciasnecesitandoingresno.getText().toString());
					if(Altresmanifestacionsdatòpia.isChecked())
						intent.putExtra("Altresmanifestacionsdatòpia","1");
					else
						intent.putExtra("Altresmanifestacionsdatòpia","0");
					
					if(Antecedentspersonals.isChecked())
						intent.putExtra("Antecedentspersonals","1");
					else
						intent.putExtra("Antecedentspersonals","0");
					if(Símptomesintercrisisasma.isChecked())
						intent.putExtra("Símptomesintercrisisasma","1");
					else
						intent.putExtra("Símptomesintercrisisasma","0");
					if(Desencadenants.isChecked())
						intent.putExtra("Desencadenants","1");
					else
						intent.putExtra("Desencadenants","0");
					if(Moquetescatifesendomicilihabitual.isChecked())
						intent.putExtra("Moquetescatifesendomicilihabitual","1");
					else
						intent.putExtra("Moquetescatifesendomicilihabitual","0");
					if(Visitesaurgències.isChecked())
						intent.putExtra("Visitesaurgències","1");
					else
						intent.putExtra("Visitesaurgències","0");
					if(Ingresosperasma.isChecked())
						intent.putExtra("Ingresosperasma","1");
					else
						intent.putExtra("Ingresosperasma","0");
					if(Tractamentdebaseperlasma.isChecked())
						intent.putExtra("Tractamentdebaseperlasma","1");
					else
						intent.putExtra("Tractamentdebaseperlasma","0");
					if(asma.isChecked())
						intent.putExtra("asma","1");
					else
						intent.putExtra("asma","0");
					if(rinitis.isChecked())
						intent.putExtra("rinitis","1");
					else
						intent.putExtra("rinitis","0");
					if(acaros.isChecked())
						intent.putExtra("acaros","1");
					else
						intent.putExtra("acaros","0");
					if(alergia.isChecked())
						intent.putExtra("alergia","1");
					else
						intent.putExtra("alergia","0");
					if(rinoconjuntivitis.isChecked())
						intent.putExtra("rinoconjuntivitis","1");
					else
						intent.putExtra("rinoconjuntivitis","0");
					if(budesonida.isChecked())
						intent.putExtra("budesonida","1");
					else
						intent.putExtra("budesonida","0");
					if(fluticasona.isChecked())
						intent.putExtra("fluticasona","1");
					else
						intent.putExtra("fluticasona","0");
					if(ciclesonida.isChecked())
						intent.putExtra("ciclesonida","1");
					else
						intent.putExtra("ciclesonida","0");
					if(mometasona.isChecked())
						intent.putExtra("mometasona","1");
					else
						intent.putExtra("mometasona","0");
					if(montelukast.isChecked())
						intent.putExtra("montelukast","1");
					else
						intent.putExtra("montelukast","0");
					if(singulair.isChecked())
						intent.putExtra("singulair","1");
					else
						intent.putExtra("singulair","0");
					if(salmeterolfluticasona.isChecked())
						intent.putExtra("salmeterolfluticasona","1");
					else
						intent.putExtra("salmeterolfluticasona","0");
					if(formoterolbudesonida.isChecked())
						intent.putExtra("formoterolbudesonida","1");
					else
						intent.putExtra("formoterolbudesonida","0");
					if(omalizumab.isChecked())
						intent.putExtra("omalizumab","1");
					else
						intent.putExtra("omalizumab","0");
					if(ocs.isChecked())
						intent.putExtra("ocs","1");
					else
						intent.putExtra("ocs","0");
					if(salbutamol.isChecked())
						intent.putExtra("salbutamol","1");
					else
						intent.putExtra("salbutamol","0");
					if(Tossibilàncies.isChecked())
						intent.putExtra("Tossibilàncies","1");
					else
						intent.putExtra("Tossibilàncies","0");
					if(Símptomesderinoconjuntivitis.isChecked())
						intent.putExtra("Símptomesderinoconjuntivitis","1");
					else
						intent.putExtra("Símptomesderinoconjuntivitis","0");
					if(Fumadorsaldomicilihabitual.isChecked())
						intent.putExtra("Fumadorsaldomicilihabitual","1");
					else
						intent.putExtra("Fumadorsaldomicilihabitual","0");
					if(Medicacióderescat.isChecked())
						intent.putExtra("Medicacióderescat","1");
					else
						intent.putExtra("Medicacióderescat","0");
					if(Respostaabroncodilatadorsini.isChecked())
						intent.putExtra("Respostaabroncodilatadorsini","1");
					else
						intent.putExtra("Respostaabroncodilatadorsini","0");
					if(Dispneadiurna.isChecked())
						intent.putExtra("Dispneadiurna","1");
					else
						intent.putExtra("Dispneadiurna","0");
					if(Estacionalitat.isChecked())
						intent.putExtra("Estacionalitat","1");
					else
						intent.putExtra("Estacionalitat","0");
					if(evolucioPatologia.isChecked())
						intent.putExtra("evolucioPatologia","1");
					else
						intent.putExtra("evolucioPatologia","0");
					if(Antecedentsfamiliarsdatòpia.isChecked())
						intent.putExtra("Antecedentsfamiliarsdatòpia","1");
					else
						intent.putExtra("Antecedentsfamiliarsdatòpia","0");
					if(ReaccionsalaITE.isChecked())
						intent.putExtra("ReaccionsalaITE","1");
					else
						intent.putExtra("ReaccionsalaITE","0");
					if(Altresantecedentsfamiliarsdinterès.isChecked())
						intent.putExtra("Altresantecedentsfamiliarsdinterès","1");
					else
						intent.putExtra("Altresantecedentsfamiliarsdinterès","0");
					if(Dispneanocturna.isChecked())
						intent.putExtra("Dispneanocturna","1");
					else
						intent.putExtra("Dispneanocturna","0");
					if(Immunoteràpia.isChecked())
						intent.putExtra("Immunoteràpia","1");
					else
						intent.putExtra("Immunoteràpia","0");
					if(Crisisdasma.isChecked())
						intent.putExtra("Crisisdasma","1");
					else
						intent.putExtra("Crisisdasma","0");
					if(pis.isChecked())
						intent.putExtra("pis","1");
					else
						intent.putExtra("pis","0");
					if(humed.isChecked())
						intent.putExtra("humed","1");
					else
						intent.putExtra("humed","0");
					if(casa.isChecked())
						intent.putExtra("casa","1");
					else
						intent.putExtra("casa","0");
					if(ventilad.isChecked())
						intent.putExtra("ventilad","1");
					else
						intent.putExtra("ventilad","0");
					if(solead.isChecked())
						intent.putExtra("solead","1");
					else
						intent.putExtra("solead","0");
					if(peluches.isChecked())
						intent.putExtra("peluches","1");
					else
						intent.putExtra("peluches","0");
					if(Animalsaldomicilihabitual.isChecked())
						intent.putExtra("Animalsaldomicilihabitual","1");
					else
						intent.putExtra("Animalsaldomicilihabitual","0");
					if(Tractamentdebaseperlarinitis.isChecked())
						intent.putExtra("Tractamentdebaseperlarinitis","1");
					else
						intent.putExtra("Tractamentdebaseperlarinitis","0");
					if(Faltesescolars.isChecked())
						intent.putExtra("Faltesescolars","1");
					else
						intent.putExtra("Faltesescolars","0");
					if(Símptomésambesforç.isChecked())
						intent.putExtra("Símptomésambesforç","1");
					else
						intent.putExtra("Símptomésambesforç","0");
					
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

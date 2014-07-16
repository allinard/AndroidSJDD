package com.example.asmaprediccio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;

import weka.classifiers.Classifier;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaPredictor {

	public static List<double[]> classify() {

		List<double[]> retour = new ArrayList<double[]>();

		System.gc();

		try {

			//Serialize model only if not existant yet
			File f = new File("/sdcard/modelMPVisitesUrg.model");
			if (!f.exists()) {

				// create J48
				Classifier cls = new J48();

				// train
				Instances inst = new Instances(new BufferedReader(
						new FileReader("/sdcard/resultat4Android.arff")));
				inst.setClassIndex(inst.numAttributes() - 1);

				cls.buildClassifier(inst);

				// serialize model
				ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream("/sdcard/modelMPVisitesUrg.model"));
				oos.writeObject(cls);
				oos.flush();
				oos.close();

			}

			// deserialize model
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"/sdcard/modelMPVisitesUrg.model"));
			Classifier cls2 = (Classifier) ois.readObject();
			ois.close();

			// Classification
			DataSource source = new DataSource("/sdcard/outputReaded.arff");
			Instances data = source.getDataSet();

			if (data.classIndex() == -1)
				data.setClassIndex(data.numAttributes() - 1);

			Instance inst2;
			for (int i = 0; i < data.numInstances(); i++) {
				inst2 = data.instance(i);
				retour.add(cls2.distributionForInstance(inst2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retour;

	}

}
package com.example.asmaprediccio.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ArffWriter {

	public static void writeOnSD(String s) {
		try {
			File myFile = new File("/sdcard/outputReaded.arff");
			myFile.createNewFile();
			FileOutputStream fOut = new FileOutputStream(myFile);
			OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
			myOutWriter.append(s);
			myOutWriter.close();

			fOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

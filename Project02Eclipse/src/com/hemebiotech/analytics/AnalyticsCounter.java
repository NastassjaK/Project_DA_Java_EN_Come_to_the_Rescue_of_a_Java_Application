package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {


	public static void main(String args[]) throws Exception {
	ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
	WriteResultFromMap write = new WriteResultFromMap();

	write.WriteResultFromMap(read.ReadSymptomDataFromFile());
	}
}

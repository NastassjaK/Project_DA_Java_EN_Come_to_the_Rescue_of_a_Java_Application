package com.hemebiotech.analytics;


public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {
        ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
        WriteResultFromMap write = new WriteResultFromMap();

        write.WriteResultFromMap(read.ReadSymptomDataFromFile()); /** The write method need a sortedmap parameter ; the read method returns a sortedmap to the write method */
    }
}

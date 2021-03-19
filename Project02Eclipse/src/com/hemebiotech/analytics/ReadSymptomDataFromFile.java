package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.SortedMap;
import java.util.TreeMap;


class ReadSymptomDataFromFile implements ISymptomReader {

    private SortedMap<String, Integer> mapSymptoms = new TreeMap<>();


    public SortedMap<String, Integer> ReadSymptomDataFromFile() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (mapSymptoms.containsKey(line)) {
                    System.out.println("The following desease already exists:" + line); // Indicates desease increment
                    mapSymptoms.replace(line, mapSymptoms.get(line) + 1);
                } else {
                    System.out.println("Add the following desease:" + line); // add a new desease type to the list
                    mapSymptoms.put(line, 1);
                }
                line = reader.readLine();
            }
            System.out.println("The data were successfully processed");
        } catch (Exception e) {
            System.out.println("The file was not found");
        }

        return mapSymptoms; // return the map defined in parameter

    }

}

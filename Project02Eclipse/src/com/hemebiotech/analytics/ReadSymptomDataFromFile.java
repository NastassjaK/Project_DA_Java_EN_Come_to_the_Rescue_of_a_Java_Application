package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.SortedMap;
import java.util.TreeMap;


class ReadSymptomDataFromFile implements ISymptomReader {

    private SortedMap<String, Integer> mapSymptoms = new TreeMap<>();

    /** THE FOLLOWING METHOD READS AND CLASSIFY THE SYMPTOM.TXT FILE */

    public SortedMap<String, Integer> ReadSymptomDataFromFile() { /** Defines the interface method "ReadSymptomDataFromfiLE */
        try {

            BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
			/** BufferedReader class - load an external file
			 * FileReader method - reads text from an external file */
            String line = reader.readLine();
			/** readLine method - Reads a line of text until the last blank */
            while (line != null) {
                if (mapSymptoms.containsKey(line)) {
                    System.out.println("The following desease already exists:" + line); /** indicates disease increment */
                    mapSymptoms.replace(line, mapSymptoms.get(line) + 1); /** calculates the occurrence of an existing disease */
                } else {
                    System.out.println("Add the following desease:" + line); /** indicates the creation of a new disease type */
					mapSymptoms.put(line, 1); /** for a new disease type, add 1 */
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

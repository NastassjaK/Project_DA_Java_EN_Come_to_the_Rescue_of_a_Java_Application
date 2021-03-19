package com.hemebiotech.analytics;

import java.util.SortedMap;
import java.io.FileWriter;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteResultFromMap {

    void WriteResultFromMap(SortedMap <String, Integer> map) {
        try {
        FileWriter writer = new FileWriter("result.out");
        for (Entry<String, Integer> entry : map.entrySet()) {
            writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
        }
            writer.close();
            System.out.println("The following doc was successfully processed");

    } catch (Exception e) {
            System.out.println("The file was not found");
        }

}

}

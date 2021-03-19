package com.hemebiotech.analytics;

import java.util.SortedMap;
import java.io.FileWriter;
import java.util.Map.Entry;

public class WriteResultFromMap {

    /** THE FOLLOWING METHOD CREATES AND WRITES INSIDE THE result.out FILE */

    void WriteResultFromMap(SortedMap<String, Integer> map) {
        try {
            FileWriter writer = new FileWriter("result.out");
            for (Entry<String, Integer> entry : map.entrySet()) {
                /** Works only with iterations "for", get key and key value of each map index
                 // index 1 = key 1 + key value 1 */
                writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
                /** Write method - Write a string ; Key 1 = Key Value 1 */
            }
            writer.close();
            System.out.println("The following doc was successfully processed");

        } catch (Exception e) {
            System.out.println("The file was not found");
        }

    }

}

package com.WebTests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D07ReadFromCSV2 {

	public static void main(String[] args) {
		//Apache Open CSV
		//https://mvnrepository.com/artifact/org.apache.commons/commons-csv/1.14.1
		String path = "C:\\Users\\Dell\\Desktop\\Friends.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // split by comma
                System.out.println("Col1: " + values[0] + " | Col2: " + values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

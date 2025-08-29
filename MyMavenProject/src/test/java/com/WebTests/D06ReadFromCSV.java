package com.WebTests;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class D06ReadFromCSV {

	public static void main(String[] args) throws CsvValidationException, IOException {
		//Open CSV
		//https://mvnrepository.com/artifact/org.apache.commons/commons-csv
		
		String path = "C:\\Users\\Dell\\Desktop\\Friends.csv";  // path to your CSV file
        CSVReader reader = new CSVReader(new FileReader(path));

        String[] line;
        while ((line = reader.readNext()) != null) {
            System.out.println("Column 1: " + line[0] + ", Column 2: " + line[1]);
        }
        reader.close();
	}

}

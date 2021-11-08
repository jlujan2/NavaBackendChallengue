package com.nava.challengue.nava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class test {

	public static void main(String[] args) throws IOException, CsvException {
		
		/*
		 * Scanner sc = new Scanner(new
		 * File("C:\\Users\\Juan Carlos\\Desktop\\NavaBackendChallengue\\nava\\src\\main\\resources\\schema\\booleanmeasures.csv"
		 * )); sc.useDelimiter(","); //sets the delimiter pattern while (sc.hasNext())
		 * //returns a boolean value { String st = sc.next(); System.out.print( st+" ");
		 * //find and returns the next complete token from this scanner } sc.close();
		 */
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Juan Carlos\\Desktop\\NavaBackendChallengue\\nava\\src\\main\\resources\\schema\\booleanmeasures.csv"));
		String[] lineInArray;
	      while ((lineInArray = reader.readNext()) != null) {
	          System.out.println(lineInArray[0] + lineInArray[1] + "etc...");
	      }
		
	}

}

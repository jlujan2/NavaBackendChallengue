package com.nava.challengue.nava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

@Service
public class DataFileDAO extends DataFile{

	@Autowired
	DataFileRepository repo;
	
	public List<DataFile> getAllDataFiles(){
		return repo.findAll();
	}
	
	public Map<String, Object> readTextFile(String fileName) throws IOException, CsvValidationException, NumberFormatException {
		//Read CSV
		
		String path = "C:\\Users\\Juan Carlos\\Desktop\\NavaBackendChallengue\\nava\\src\\main\\resources\\schema\\" + fileName+".csv";
		CSVReader reader = new CSVReader(new FileReader(path));
		
		List<Column> columns = new ArrayList<>();
		String[] lineInArray;
	      while ((lineInArray = reader.readNext()) != null) {
	    	  Column c = new Column();
	    	  c.setName(lineInArray[0]);
	    	  c.setWidth(Integer.parseInt(lineInArray[1]));
	    	  c.setDataType(lineInArray[2]);
	    	  columns.add(c);
	      }
		
		
		//Read file
		path = "C:\\Users\\Juan Carlos\\Desktop\\NavaBackendChallengue\\nava\\src\\main\\resources\\data\\" + fileName+".txt";
		File file = new File(path);
		
		BufferedReader br
        = new BufferedReader(new FileReader(file));
		
		String st;
		
		List<DataFileParsed> dataFilesParsed = new ArrayList<>(); 
		
		while ((st = br.readLine()) != null) {
			dataFilesParsed.add(getValues(st));
		}
		
		Map<String, Object> hm = new HashMap<>();
		
		hm.put(columns.get(0).getName(), dataFilesParsed.get(0).getMeasureId());
		hm.put(columns.get(1).getName(), dataFilesParsed.get(0).getPerformanceYear());
		hm.put(columns.get(2).getName(), dataFilesParsed.get(0).isRequired());
		hm.put(columns.get(3).getName(), dataFilesParsed.get(0).getMinScore());
		
		return hm;
	}
	
	
	private DataFileParsed getValues(String line)
	{
		DataFileParsed dataParsed = new DataFileParsed();
		String measureId;
		
		StringBuilder sb = new StringBuilder(line);
		
		measureId = sb.substring(0, 10);
		dataParsed.setMeasureId(measureId);
		
		sb.delete(0, 10);
		
		dataParsed.setPerformanceYear(Integer.parseInt(sb.substring(0,4)));
		sb.delete(0, 4);
		
		StringBuilder sb2 = new StringBuilder();
		
		for(Character c:sb.toString().toCharArray()) {
			if(Character.isDigit(c)) {
				sb2.append(c);
			}
		}
		dataParsed.setRequired("1".equals(sb2.substring(0, 1)));
		dataParsed.setMinScore(Integer.parseInt(sb2.substring(1)));
		return dataParsed;
	}
	
}

package com.nava.challengue.nava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.exceptions.CsvValidationException;

@RestController
public class SpreadSheetGenerator {

	@Autowired
	DataFileDAO dataService;
	
	@GetMapping(path="/nava/{name}")
	public Map<String, Object> generateValues(@PathVariable String name) throws IOException, CsvValidationException, NumberFormatException {
		return dataService.readTextFile(name);
	}
	
}

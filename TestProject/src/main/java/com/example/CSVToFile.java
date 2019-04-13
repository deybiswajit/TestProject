package com.example;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;
import java.util.UUID;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSVToFile {
	public static void main(String[] args) throws Exception{
		
		//DACH project
		/*Reader inputCSV = new FileReader("D:\\Auto-ML SDK\\PG Model\\TrainingSetCSVFile\\warranty\\Retagging_phase+2_16Warranty_docs_201811120722.csv");
		//Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("submissionUUID","document_xml_link_tagged").parse(inputCSV);
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("ocr_document_url_tagged").parse(inputCSV);
		int idx = 0;
		for (CSVRecord record : records) {
			if(0 == idx) { 
				idx = 1; 
				continue; 
			}
			String doc_content = record.get("ocr_document_url_tagged");
			
			//String subUUID = record.get("submissionUUID")
			int hashCode = doc_content.hashCode();
			//PrintWriter outputHTML = new PrintWriter("path_to_output_file"+subUUID+".xml")
			PrintWriter outputHTML = new PrintWriter("D:\\Project\\P&G\\Training Set\\warranty\\auto-ml\\" + UUID.randomUUID() + ".xml");
			outputHTML.println(doc_content);
			outputHTML.close();
			
		}*/
		
		
		
		//MO project
				Reader inputCSV = new FileReader("D:\\backup from desktop\\Project\\P&G\\Training Set\\wkz\\Model+Tagging_phase+1_201810251349.csv");
				//Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("submissionUUID","document_xml_link_tagged").parse(inputCSV);
				Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("ocr_document_url_tagged").parse(inputCSV);
				int idx = 0;
				for (CSVRecord record : records) {
					if(0 == idx) { 
						idx = 1; 
						continue; 
					}
					String doc_content = record.get("ocr_document_url_tagged");
					
					//String subUUID = record.get("submissionUUID")
					int hashCode = doc_content.hashCode();
					//PrintWriter outputHTML = new PrintWriter("path_to_output_file"+subUUID+".xml")
					PrintWriter outputHTML = new PrintWriter("D:\\backup from desktop\\Project\\P&G\\Training Set\\wkz\\xml\\" + UUID.randomUUID() + ".xml");
					outputHTML.println(doc_content);
					outputHTML.close();
					
				}
		
      
    }
}

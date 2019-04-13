package com.example;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import com.opencsv.CSVReaderBuilder;

public class CSVToFileVenkat {
	public static void main(String[] args) throws Exception{
		/*Reader inputCSV = new FileReader("D:\\Auto-ML SDK\\PG Model\\TrainingSetCSVFile\\dach_claim_model_training_set.csv");
		//Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("submissionUUID","document_xml_link_tagged").parse(inputCSV);
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("tagged_text").parse(inputCSV);
		int idx = 0;
		for (CSVRecord record : records) {
			if(0 == idx) { 
				idx = 1; 
				continue; 
			}
			String doc_content = record.get("tagged_text");
			
			//String subUUID = record.get("submissionUUID")
			int hashCode = doc_content.hashCode();
			//PrintWriter outputHTML = new PrintWriter("path_to_output_file"+subUUID+".xml")
			PrintWriter outputHTML = new PrintWriter("D:\\Auto-ML SDK\\PG Model\\TrainingSetXMLFile\\"+Integer.toString(hashCode)+".xml");
			outputHTML.println(doc_content);
			outputHTML.close();
			
		}*/
		
        try {
            // Create an object of file reader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader("D:\\Auto-ML SDK\\PG Model\\TestData\\BP-FSS-AR-EU-Claims+Dispute+DACH-v1.1_201811191210.csv");

            // create csvReader object and skip first Line
            com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(2).build();
            List<String[]> allData = csvReader.readAll();

            // print Data
            for (String[] row : allData) {
            	PrintWriter outputHTML = new PrintWriter("D:\\Auto-ML SDK\\PG Model\\TestDataXMLFile\\" + UUID.randomUUID() + ".xml");
                outputHTML.println(row[1]);
                outputHTML.close();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

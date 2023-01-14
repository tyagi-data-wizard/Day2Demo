package utilityDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import com.opencsv.CSVWriter;

public class fileGen {
	
	public static void create() {
		System.out.print("--------------------First File Gen Utility Method Called---------------\n");

		String filePath = "C:/Users/utyagi3/OneDrive - UHG/clinExp/";
		
		File f = new File(filePath+"clinSmp.csv");
		
		if(!f.exists()) {
		try {
			FileWriter file = new FileWriter(filePath+"clinSmp.csv");
			
			CSVWriter writer = new CSVWriter(file);
			
			String[] header = {"Name","Class","Marks"};
			writer.writeNext(header);
			
			String[] data1 = {"Ujjwal","12","1000"};
			writer.writeNext(data1);
			
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}else {
			System.out.print("File already exists there");
		}
		return;
		
	}

}

package utilities;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSV {

	//this method is use to read data from csv and return as a list
	public static List<String[]>  read(String file) {
		List<String[]> data=new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((dataRow=br.readLine())!=null)
			{
			String[] dataRecords=dataRow.split(",");
			data.add(dataRecords);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Could not read file");
			e.printStackTrace();
		}
		return data;
	}
	
}

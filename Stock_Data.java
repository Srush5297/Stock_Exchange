package Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stock_Data
{
	public static void main(String [] args0) 
	{
		String file = "C:/Users/MY PC/Desktop/IConnect/30Jan.csv";
		BufferedReader reader = null;
		String line ="";
		
		try
		{
			reader = new BufferedReader(new FileReader (file));
			while((line= reader.readLine()) != null)
			{		
			    String[] row= line.split(",");
				
				String Symbol = row[0];
				String High = row[3];
				String Low = row[4];
				System.out.println(row[0]);	
				System.out.println(" | ");	
				System.out.println(row[3]);	
				System.out.println(" | ");	
				System.out.println(row[4]);	
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}

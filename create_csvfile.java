package Data;
import java.io.PrintWriter;

public class create_csvfile 
{
	public static void main(String [] args)
	{
		try
		{
			PrintWriter pw = new PrintWriter("C:/Users/MY PC/Desktop/SinglCsv.csv");
			StringBuilder sb = new StringBuilder();
			
			sb.append("Symbol");
			sb.append("Daily_Range");
			sb.append("DATR");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("Finished");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

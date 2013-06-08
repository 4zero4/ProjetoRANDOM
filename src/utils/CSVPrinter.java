package utils;

import java.io.FileWriter;

public class CSVPrinter{
	private int j=0;
	private int i=0;
	private double[][] v;
	
	//Constructor method
	public CSVPrinter(double[][] argv){
		v=argv;
	}
	
	public void createCSV(String path){
		try{
			FileWriter writer = new FileWriter("test.csv");
			for(; i < v.length; i++){
				for (; j<v[0].length; j++){
					writer.append(v[i][j]+"");
					writer.append(',');
				}
				writer.append(v[i][j-1]+"");
				writer.append('\n');
				writer.flush();
			}
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
}

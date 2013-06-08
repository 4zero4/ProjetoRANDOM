package utils;

import java.io.FileWriter;

public class CSVPrinter {
	private int j=0;
	private int i=0;
	
	//Constructor Method, deve ter o nome da classe, roda quando o objeto for instanciado. É o 'main' do objeto
	public CSVPrinter(double[][] v){
		
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
	}//CSVPrinter
		

}

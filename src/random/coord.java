package random;
import javax.swing.*;
public class coord {
	//Xf=(a*Xi+b)%m;
	public static double seed = 1;
	public static double a = 179424361;
	public static double b = 11;
	public static double m = 1000000000;
	public static double dNom = 100000;
	public static double[][] matriz;
	
	public static void main(String[] args){
		msg("Programa de cria��o de coordenadas utilizando\nalgoritimos pseudo-randomicos");
		double n = entrDouble("Entre com o n�mero de estrelas a serem geradas");
		matriz(matriz,(int)n);
		
		for(int c=0;c<matriz[0].length;c++){
			for(int l=0;l<matriz.length;l++){
				//matriz[l][c] = 
			}
		}
		
	}//main
	
	//==============================================================
	public static void matriz(double v[][],int n){
		v = new double[n][4];
	}//matriz
	
	public static double seeder(double Xi){
		double Xf;
		Xf = (a*Xi+b)%m;
		Xf = (int)(Xf/dNom);
		return Xf;
	}//seeder
	
	public static void msg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}//msg
	
	public static double entrDouble(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
}

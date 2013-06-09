package utils;

//General purpose class for all debugging tools for the project

public class DebugTools{


	public static void printStars(double stars[][]){

		//Prints the ID's and coordinates of generated stars in "stars" matrix
		//Input must be 
		
		for(int linha=0;linha<stars.length;linha++){
			for(int coluna=0;coluna<4;coluna++){
				
				if(coluna==0){// ID da estrela
					System.out.printf("ID =%15.1f",stars[linha][coluna]);
					System.out.print(" ");	
					
				}else if(coluna==1){// Coordenada X
					System.out.printf("X = %15.1f",stars[linha][coluna]);
					System.out.print(" ");
					
				}else if(coluna==2){// Coordenada Y
					System.out.printf("Y = %15.1f",stars[linha][coluna]);
					System.out.print(" ");
					
				}else if(coluna==3){// Coordenada Z
					System.out.printf("Z = %15.1f",stars[linha][coluna]);
					System.out.println();
				}
			}
		}
	}//printStars
	
}//DebugTools
import java.util.*;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int [][] matris = new int [][] {{2,3,4},{10,11,12},{2,6,8}};
		int transpoz[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				transpoz[i][j] = matris[j][i]; //ilk transpoz yazılır. i ve j matriste yer değiştirdi.
			}
		}
		System.out.println("Matris:");  
		for(int i = 0; i < 3; i++){    
			for(int j = 0; j < 3; j++){    
				System.out.print(matris[i][j]+" ");    
		}      
			System.out.println();
		}    
		System.out.println("Transpoz:");  
		for(int i = 0; i < 3; i++){    
			for(int j = 0; j < 3; j++){    
				System.out.print(transpoz[i][j]+" ");    
		}     
			System.out.println(); 
		}    
    }  
}

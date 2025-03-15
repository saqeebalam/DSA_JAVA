package src.patterPrinting;

import java.util.Iterator;

//*________* // 8 spaces

//**______** // 6 spaces

//***____*** // 4 spaces

//****__**** // 2 spaces

//********** // 0 spaces


public class HelloInvertedPyramid {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			
			for(int k=1;k<=n*2-2*i;k++) {
				System.out.print(' ');
			}
			
			for(int l=1;l<=i;l++) {
				System.out.print('*');
			}
			
			System.out.print('\n');
		}
	}

}

package src.patterPrinting;

//********** // 0 spaces

//****__**** // 2 spaces

//***____*** // 4 spaces

//**______** // 6 spaces

//*________* // 8 spaces




public class HallowPyramid {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--) {
			
			//inverted
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			
			//for space
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

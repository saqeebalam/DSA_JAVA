package src.patterPrinting;


//1 2 3 4 5 6 7 
//2 3 4 5 6 7 
// 3 4 5 6 7 
//  4 5 6 7 
//   5 6 7 
//    6 7 
//     7 
//    6 7 
//   5 6 7 
//  4 5 6 7 
// 3 4 5 6 7 
//2 3 4 5 6 7 
//1 2 3 4 5 6 7


public class MirrorTriangleImage {
	
	public static void main(String[] args) {
		int n=7;
		//for(int i=n;i>=1;i--) {
		//mirroe trianle
				for(int i=1;i<=n;i++) {
					//for left space
					for(int j=1;j<=i;j++) {
						System.out.print(' ');
					}
					
					
					for(int k=i;k<=n;k++) {
						System.out.print(k+" ");
					}
					
					
					System.out.print('\n');
					
				}
				
				//upside  triangle
				for(int i=n;i>=1;i--) {
					//for left space
					for(int j=1;j<=i;j++) {
						System.out.print(' ');
					}
					
					
					for(int k=i;k<=n;k++) {
						System.out.print(k+" ");
					}
					
					
					System.out.print('\n');
					
				}
		
		
	}

}

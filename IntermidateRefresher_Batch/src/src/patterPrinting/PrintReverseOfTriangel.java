package src.patterPrinting;

//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 


public class PrintReverseOfTriangel {
	
	public static void main(String[] args) {
		
		
		int n=6;
		//for(int i=n;i>=1;i--) {
		for(int i=1;i<=n;i++) {
			//for left space
			for(int j=1;j<=i;j++) {
				System.out.print(' ');
			}
			
			//star
//			for(int k=1;k<=i;k++) {
//				System.out.print(""
//						+ (k+chain)+" ");
//				//chain++;
//			}
			
			for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}
			
			
			System.out.print('\n');
			
		}
	}

}

package src.patterPrinting;

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 


public class PrintTriangel {
	
	public static void main(String[] args) {
		int n = 5;

		for(int i=1;i<=n;i++) {
			//for left space
			for(int j=n-i;j>=1;j--) {
				System.out.print(' ');
			}
			
			//star
			for(int k=1;k<=i;k++) {
				System.out.print(""
						+ "* ");
			}
			
			System.out.print('\n');
			
		}
	}	
	

}

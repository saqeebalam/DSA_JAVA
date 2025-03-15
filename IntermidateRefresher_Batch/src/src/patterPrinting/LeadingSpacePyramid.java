package src.patterPrinting;

//____*
//___**
//__***
//_****
//*****


public class LeadingSpacePyramid {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			
			//for space
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			
			//for star
			
			for(int k=1;k<=i;k++) {
				System.out.print('*');
			}
			
			System.out.print('\n');
			
		}
		
	}

}

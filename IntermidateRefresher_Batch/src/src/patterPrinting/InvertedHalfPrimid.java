package src.patterPrinting;

//****
//***
//**
//*


public class InvertedHalfPrimid {
	
	public static void main(String[] args) {
		
		int n=5;
		
//		for(int i=n;i>=1;i--) {
//			
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print('*');
//			}
//			System.out.print('\n');
//		}
		int i=n;
		while(i>=1) {
			
			int j=1;
			while(j<=i) {
				System.out.print('*');
				j++;
			}
			System.out.print('\n');
			i--;
		}
		
	}

}

package src.patterPrinting;

public class StairPattern {

	//*
	//**
	//***
	//****
	
	
	public static void main(String[] args) {
		
		//number of row
		int n=10;
		
		//this loop if for row
		for(int i=1;i<=n;i++) {
			//this loop is for column
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}

}

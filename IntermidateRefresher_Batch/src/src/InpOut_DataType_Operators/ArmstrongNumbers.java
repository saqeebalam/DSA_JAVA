package src.InpOut_DataType_Operators;

public class ArmstrongNumbers {
	
	public static void main(String[] args) {
		
		int N=100;
		
		for(int i=1;i<=N;i++) {
			checkArmstrong(i);
		}
		
		
	}
	
	public static boolean checkArmstrong(int i) {
		int sum=0;
		int initialValue=i;
		while(i>0) {
			int temp=i%10;
			sum=sum+(temp*temp*temp);
			i=i/10;
		}
		if(initialValue==sum) {
			System.out.println(initialValue);
			return true;
		}else {
			//System.out.println("Not ArmStrong");
			return false;
		}
		
	}

}

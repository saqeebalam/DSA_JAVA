package src.InpOut_DataType_Operators;

public class Q3 {
	public static void main(String[] args) {
		
		//Scanner sc =new Scanner(System.in);
        //int N=sc.nextInt();
		int N=5;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0)
                 System.out.print(j);
                else
                   System.out.print('*');
                if(j>=1 && j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	}



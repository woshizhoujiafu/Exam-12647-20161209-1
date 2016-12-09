package hand.zjf;
public class PrimeNumber {
	public static void main(String[] args){
		int flag=0;
		int number=0;
	
        for(int i=101;i<=200;i++){
        	if(prime(i)==1){
        		number++;
        	}
        }
        	System.out.print("101-200间总共有"+number+"个素数,分别是：");
        for(int i=101;i<=200;i++){
        	if(prime(i)==1){
        		if(i==199){
        			System.out.println(i);
        		}else{
        		System.out.print(i+",");
        		}
        	}
        }
		
	}
	public static int prime(int x)
	{
	       int i;
	       for (i=2;i<x/2;i++)
	              if(x%i==0)return 0;
	              return 1;

	}
}

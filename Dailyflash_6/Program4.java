//WAP to print a strong no in a given range
//Input : 1 to 10
import java.io.*;
class P4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i = start;i<=end;i++){
			if(strong(i)){
				System.out.println(i+" is a strong no");
			}
		}
	}
	public static boolean strong(int no){
		int original = no;
		int sum = 0;
		while(no>0){
			int digit = no%10;
			sum +=fact(digit);
			no = no/10;
		}
		return sum == original;
	}
	static int fact(int n){
		if(n==0){
			return 1;
		}
		int result = 1;
		for(int i=1;i<=n;i++){
			result *= i;
		}
		return result;
	}
}

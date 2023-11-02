//WAP to check whether the given no is prefect or not
import java.io.*;
class P3{
	static boolean prefect(int n){
		if(n <= 0){
			return false;
		}
		int sum =0;
		for(int i=1;i<=n/2;i++){
			if(n%i == 0){
				sum +=i;
			}
		}
		return sum == n;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(prefect(n)){
			System.out.println(n+" is a prefect no");
		}else{
			System.out.println(n+" is not a prefect no");
		}
	}
}

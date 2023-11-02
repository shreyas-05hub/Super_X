//WAP to check whether the given no is prime or composite
import java.io.*;
class P3{
	static boolean prime(int no){
		if(no<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(no);i++){
			if(no%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		if(prime(no)){
			System.out.println(no +" is a prime no");
		}else{
			System.out.println(no +" is a composite no");
		}
	}
}

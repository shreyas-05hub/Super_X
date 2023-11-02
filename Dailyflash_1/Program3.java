import java.io.*;
class P3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num%2==0){
			System.out.println(num +" is even");
		}
		else{
			System.out.println(num+ " is odd");
		}



	}
}

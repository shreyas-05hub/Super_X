// 5 
// 6 8 
// 7 10 13 
// 8 12 16 20
// 9 14 19 24 29
class P3{
	public static void main(String[] args){
		int num = 5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			num =  5 + i;
		}
	}
}

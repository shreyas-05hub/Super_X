// 0
// 3  8
// 15 24 35
// 48 63 80 99
class P2{
	public static void main(String[] args){
		int num = 1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num * num - 1+" ");
				num++;
			}
			System.out.println();
		}
	}
}	

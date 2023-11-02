//       1
//     2 4
//   3 6 9
//4 8 12 16
class P4{
	public static void main(String[] args){
		int row = 4;
		for(int i=1;i<=4;i++){
			int num = i;
			for(int j=1;j<=row-i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num = num + i;
			}
			System.out.println();
		}
	}
}

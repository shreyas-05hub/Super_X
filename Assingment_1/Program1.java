/*
 1 2 3 4
 4 5 6 7 
 6 7 8 9
 7 8 9 10
 */
class P1{
	public static void main(String[] args){
		int num = 1;
		int row = 4;
		int cols = 4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=cols;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			num = num - i;
		}
	}
}

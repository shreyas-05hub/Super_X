/*
 1 
 2 4
 3 6 9
 4 8 12 16
 */
class P2{
	public static void main(String[] args){
		int rows = 4;
		int count = 1;
		for(int i=0;i<rows;i++){
			int num = count;
			for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num += count;
				count++;
			}
			System.out.println();
		}
	}
}

/*
 A B C D
 B C D E
 C D E F
 D E F G
 */
class P1{
	public static void main(String[] args){
		int rows = 4;
		int cols = 4;
		char ch = 'A';
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print((char)(ch + j)+" ");
			}
			System.out.println();
			ch++;
		}
	}
}

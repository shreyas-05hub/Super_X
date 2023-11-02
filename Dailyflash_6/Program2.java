//1
//7 26
//63 124 215
//342 511 726 999
class P2{
	public static void main(String[] args){
		int n = 1;
		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print(n+ " ");
				n += 25;	
			}
			System.out.println();
		}
	}
}

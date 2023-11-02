/* A B C D
   1 3 5 7
   A B C D
   9 11 13 15
*/
class P1{
	public static void main(String[] args){
		int n = 1;
		for(int i=0;i<5;i++){
			char ch = 'A';
			for(int j=0;j<4;j++){
				if(i%2==0){
					System.out.print(ch++ +" ");
				}
				if(i%2==1){
					System.out.print(n+" ");
					n=n+2;
				}
			}
			System.out.println();
		}
	}
}

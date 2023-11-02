class ArrayDemo{
	public static void main(String[] args){
		String str = "Welcome to Core2Web";
		int length=0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			length++;
		}
		System.out.println(length);
	}
}
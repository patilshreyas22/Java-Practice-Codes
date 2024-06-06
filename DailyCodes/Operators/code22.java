class code22{

	public static void main(String args []){
	
	int x = 5;
	int y = 3;

	System.out.println((x--<=++y)&&(++x<y--)); // false
	System.out.println(x); // 4
	System.out.println(y); // 4
	
	}


}

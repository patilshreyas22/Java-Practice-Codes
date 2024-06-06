class IntegerDemo{
	public static void main(String [] args){

		Byte num = -128;
	//	Byte number = 128; int cannot be converted to byte
		int no = 'k';
		char c = 5324;
		char m = 97;
		//char x = 23.42f; lossy conversion from float to char
		short s = 128;
		float f = 341;

	//	float g = 3.41; lossy conversion from double to float
	
	       double d = 1232d;	
 	 	
		double dd = 123.134d;

		double t = 341.12f;

		int l = 124.324f;
		System.out.println(num);
	
		System.out.println(no);

		System.out.println(c);

		System.out.println(m);

		System.out.println(s);

		System.out.println(f);

		System.out.println(d);

		System.out.println(dd);

		System.out.println(t);

		System.out.println(l);


	
	}

}

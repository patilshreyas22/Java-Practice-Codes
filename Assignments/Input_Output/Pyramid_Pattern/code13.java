
/*

 16	@	14	@
 24	@	20	@
 24	@	18	@
 16	@	8	@

 */

import java.util.*;
class y {

	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();

		int num1 = rows*rows;

		int num2 = (rows-2+rows)*rows;

		int min ;
		for(int i=1;i<=rows;i++) {

			num1 = rows*rows;
			num2 = (rows-2+rows)*rows;
			min = 2*i;
			if(i==1||i==rows) {

				for(int j=1;j<=rows; j++) {

					if(j%2==1){
						System.out.print((num1)+"\t");
						num1-=min;

					} else {

						System.out.print("@\t");
					}
				}
			} else {

				for(int j=1;j<=rows; j++) {

					if(j%2==1) {

						System.out.print(num2+"\t");
						num2-=min;

					} else {


						System.out.print("@\t");
					}
				}


			}



			System.out.println();
		}

	}
}


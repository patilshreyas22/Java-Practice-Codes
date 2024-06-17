import java.util.*;
class code8{

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array :");
                int size=sc.nextInt();

                char arr[]=new char[size];
                System.out.println("Enter the element :");
                for(int i=0;i<size;i++){

                        arr[i]=sc.next().charAt(0);
                }
                System.out.println("Enter the character  to cheak :");
                char ch=sc.next().charAt(0);
                int cnt=0;
                for(int i=0;i<size;i++){
                        if(arr[i]==ch)
                                cnt++;

                }

                System.out.println(ch+" occure "+cnt+" times of an array ");
                }
}
~      

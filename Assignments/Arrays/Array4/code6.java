import java.util.*;
class code6{

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array :");
                int size=sc.nextInt();

                char arr[]=new char[size];
                System.out.println("Enter the element :");
                for(int i=0;i<size;i++){

                        arr[i]=sc.next().charAt(0);
                }
                int cnt=0;
                int cnt1=0;
                for(int i=0;i<size;i++){
                        if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                                cnt++;
                        }
                        else{
                                cnt1++;
                        }
                }
                System.out.println("count of vowel "+cnt);
                System.out.println("count of consolent "+cnt1);
        }
}


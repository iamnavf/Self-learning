import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("eneter the num to be reversed");
     int n=scan.nextInt();
     int reverse=0;
        while(n>0){
            int last=n%10;
            reverse=(reverse*10)+last;
            n=n/10;
        }
        System.out.println(reverse);
        scan.close();
    }
    
}

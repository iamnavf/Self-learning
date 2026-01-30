import java.util.Scanner;
class Check_prime{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        boolean isprime =true;
       if(num<=1){
        System.out.println("it is not prime");
       }
       for(int i=2;i<num;i++){
        if(num%i==0){
            isprime=false;
            break;
        }
       }
       if(isprime){
        System.out.println("prime");
       }
       else{
        System.out.println(" not prime");
       }
       scan.close();
    }
}

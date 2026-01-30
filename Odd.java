import java.util.Scanner;
class Odd{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
System.out.println("enter the number");
int number1=scan.nextInt();
if(number1%2==0){
System.out.println("this is even number"+number1);
}
else{
    System.out.println("It is Odd number");
}
scan.close();
}
}

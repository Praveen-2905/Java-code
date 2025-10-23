import java.util.Scanner;
 public class test{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num :");
        int num = scan.nextInt();
        if(num % 3== 0 && num %5 == 0){
            System.out.println("num is divisible by 3 and 5");
        } else {
            System.out.println("the num is not divisible by 3 and 5");
        }
    }


}
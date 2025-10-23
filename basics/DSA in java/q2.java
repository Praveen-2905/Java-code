 import java.util.Scanner;
 public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the status of Meghana (alive/dead): ");
        String Meghana = scan.nextLine();
        
        
        
        
        if(Meghana.equals("dead")){
            System.out.println("Surya meets Ramya");
        } else {
            System.out.println("Surya Weds Meghana");
        }
        
    }
}
        
    

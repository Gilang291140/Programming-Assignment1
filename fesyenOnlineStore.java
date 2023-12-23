package Assignmnet1;
import java.util.Scanner;

public class fesyenOnlineStore {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   
      // Get customer information
      System.out.print("Enter total purchase amount (RM): ");
      double totalPurchase = scan.nextDouble();
      
      int regionChoose = 0;

      // Dia milih dari sini ( Dia masuk circuit )
      System.out.println("Choose your region\n1.East Malaysia 2.West Malaysia 3.International");
      // While itu loopnya / circuitnya
      while (regionChoose != 1 || regionChoose != 2 || regionChoose != 3) {
         // Dia milih
         regionChoose = scan.nextInt();
         if(regionChoose == 1 || regionChoose == 2 || regionChoose == 3) {
            // Dia keluar circuit
            break;
         } else {
            // Dia nge print terus keluar circuit
            System.out.println("Please insert the correct region");
         }
      }

      // Calculate discountpgp
      double discountRate = getDiscountRate(totalPurchase);
      double discount = totalPurchase * (discountRate / 100);
   
      // Calculate shipping rate
      double shippingRate = getShippingRate(regionChoose);
      double shippingCost = totalPurchase * (shippingRate / 100);
   
      // Calculate total cost for the customer
      double totalCost = totalPurchase - discount + shippingCost;
   
      // Display the relevant information
      System.out.println("\nReceipt:");
      System.out.println("Total Purchase: RM " + totalPurchase);
      System.out.println("Discount: RM " + discount);
      System.out.println("Shipping Cost: RM " + shippingCost);
      System.out.println("Total Cost: RM " + totalCost);
   }

   private static double getDiscountRate(double totalPurchase) {
      if (totalPurchase < 150) 
         return 0;
       else if (totalPurchase < 250) 
         return 5;
      else if (totalPurchase < 500) 
         return 10;
       else 
         return 0;
   }

   private static double getShippingRate(int regionChoose) {
      switch (regionChoose) {
         case 1:
            return 5;
         case 2:
            return 2.5;
         case 3:
            return 10;
         default:
            return 0;
      }
   }
}
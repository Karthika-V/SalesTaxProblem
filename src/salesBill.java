import java.util.Scanner;

/**
 * Created by karthika on 24/08/15.
 */
public class salesBill {
    public static void main(String args[])
    {
        taxExempted(true, 12.49,findSalesTax(false));


        //Input
        Scanner scan = new Scanner(System.in);
        String[] inp = new String[10];
        System.out.println("Enter the no. of products:");
        int num=scan.nextInt();
        for(int i=0;i<num;i++)
            inp[i]=scan.nextLine();


        //gettingItemsPrice
        String noOfItems;
        String itemName;
        String price;
        System.out.println(inp[0]);
        for(int i=0;i<num;i++) {
            System.out.println(i);
            String[] parts = inp[i].split("at");

            noOfItems = parts[0];

            System.out.println(noOfItems+" ");

                    //+" "+parts[1]+":"+parts[2]);
            /*noOfItems = parts[0]; // 1
            itemName = parts[1]; // book
            String[] parts2= inp[i].split("at");
            price=parts2[1];
            System.out.println(noOfItems+" "+itemName+":"+price);*/

        }
        /*//billFormat
        int noOfItems;
        String itemName;
        double price;
        System.out.println(noOfItems+" "+itemName+":"+price);



        int taxExempted;
        if(taxExempted==1)
        {

        }*/
        /*
        //Input
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85
        */
    }

    private static double findSalesTax(boolean imported) {
        double price=0.0;
        double salesTax;
        double totalPrice=0.0;
        if(imported==true)
            salesTax=0.15* price;
        else
            salesTax = 0.1 * price;
        return salesTax;
    }

    private static void taxExempted(boolean taxExempted, double price, double salesTax) {
        double totalPrice;
        if(taxExempted==true)
            totalPrice=price;
        else
            totalPrice=salesTax+price;
    }
}

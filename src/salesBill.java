import java.util.Scanner;

/**
 * Created by karthika on 24/08/15.
 */
public class salesBill {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        //Input
        String inp[] = new String[10];
        System.out.println("Enter the no. of products:");
        int num=scan.nextInt();
        for(int i=0;i<num;i++) {

            inp[i]=scan.nextLine();
        }

        //gettingItemsPrice
        int noOfItems;
        String itemName;
        double price;
        for(int i=0;i<num;i++) {
            System.out.println(inp[i]);
            noOfItems[i]=
        }
        /*//billFormat
        int noOfItems;
        String itemName;
        double price;
        System.out.println(noOfItems+" "+itemName+":"+price);


        //findSalesTax

        //goodsCategories
        //taxExempted
        int taxExempted;
        if(taxExempted==1)
        {

        }*/
        //Input
        //1 book at 12.49
        //1 music CD at 14.99
        //1 chocolate bar at 0.85
    }
}

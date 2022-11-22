import java.util.ArrayList;

public class restaurant1
{
    private int id;
    private String customerName;

    private int mobileno;
    private int qty;
    private double price;
    private double totalPrice;


    restaurant1(String customerName,int id, int qty, double price, double totalPrice)
    {
        this.id=id;
        this.customerName = customerName;
        this.mobileno = mobileno;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }


    static void display(ArrayList<restaurant1> p) {
        System.out.println("\n--------------Transaction History---------------\n");
        for (restaurant1 e : p) {
            System.out.println(("Name:" + e.customerName));
            System.out.println("mobileno: " + e.mobileno);
            System.out.println(("ID:" + e.id));
            System.out.println(("Company:" + e.qty));
            System.out.println(("Contact:" + e.totalPrice));
            System.out.println("   ");
        }
    }

    public void display()
    {
        System.out.println("restaurant pdt: " +id +"\n"+"Customer Name "+ customerName +"\n"+"mobileno" +"\n" + "Quantity "+ qty +"\n" +
                "Single Piece Price:" +price +"\n" + "Total price"+ totalPrice);
    }
}




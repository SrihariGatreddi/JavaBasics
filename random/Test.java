 class Invoice {
    private String partNumber;
    private String partDescription;
    private int Quantity;
    private double price;
    Invoice(String partNumber , String partDescription , int Quantity , double
            price)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.Quantity = Quantity;
        this.price = price;
    }
    void readData()
    {
        System.out.println("Enter the PartNumber of that product: "+partNumber);
                System.out.println("Enter the PartDescription of that product: "+partDescription);
                        System.out.println("Enter the Quantity: "+Quantity);
        System.out.println("Enter the price of the Product: "+price);
    }
    void calData() {
        double am = 0;
        if (Quantity > 0) {
            am = price * Quantity;
        } else {
            am = 0;
            System.out.printf("The Quantity Set to Zero: "+am);
        }
        System.out.println("The Total amount is: " + am);
    }
 }

public class Test {

    public static void main(String[] args) {
        Invoice i1 = new Invoice("2342","Tools",-1,2300);
        i1.readData();
        i1.calData();
    }
}

import java.util.Scanner;
class Weights
{
    Scanner sc = new Scanner(System.in);
    private  double weights;
    private  String Location;

    Weights(double weights,String Location)
    {
        this.weights = weights;
        this.Location = Location;
    }
    public double checkLocation()
    {
        double cost = weights*2;
        if(Location.equalsIgnoreCase("city"))
        {
            cost+=20;
        }
        else if(Location.equalsIgnoreCase("country"))
        {
            cost+=40;
        }
        else
        {
            System.out.println("Invalid Location");
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Weights[] Weight = new Weights[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Weight of Parcel " + (i + 1)+" in kg");
            double weight = sc.nextDouble();
            System.out.println("Enter the City/Country of Parcel" + (i + 1));
            String Location = sc.next();
            Weight[i] = new Weights(weight, Location);
        }
        System.out.println("Total cost of these is: ");
        for (int i = 0; i < 5; i++) {
            {
                double rate = Weight[i].checkLocation();
                System.out.println("The Total cost of parcel "+(i+1)+": "+rate+"$");
            }
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        // Simulated inputs for each seasons cost of maintenance
        double springCost = 125.0;
        double summerCost = 175.0;
        double fallCost = 150.0;
        double winterCost = 225.0;

        double yearlyCost = 0;

        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The cost of spring maintenance is $" + springCost);
        System.out.println("The cost of summer maintenance is $" + summerCost);
        System.out.println("The cost of fall maintenance is $" + fallCost);
        System.out.println("The cost of winter maintenance is $" + winterCost);
        System.out.println("Which means the yearly cost of maintenance is $" + yearlyCost);
    }
}
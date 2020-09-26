/*
 * Francis Bui
 * CMIS 242
 * Dr. Schmeelk
 * Project 2 - Automobile Taxes
 * The purpose of this program is to compute the sales tax for a collection of automobiles of different types. It
 * will implement four classes including a GUI that will allow the user to input the specified data of the automobile,
 * then based on the that information, compute the corresponding sales tax based on the appropriate vehicle type (electric,
 * hybrid, other). The program will produce a report on the automobiles, that is stored in an array, to the console
 * displaying the attributes of the vehicle and the calculations made.
 *
 */

public class Electric extends Automobile {
    // Additional instance variable that contains its weight in pounds store as an integer
    // It should have the same three methods
    private int weight;

    public Electric(String makeModel, int salePrice, int weight) {
        // A constructor that allows the automobile's make and model, purchase price and weight to be initialized
        super(makeModel, salePrice);
        this.weight = weight;

    }

    protected double salesTax() {
        // Overridden salesTax that returns the total sales tax
        // Has a base sales tax of 5% minus a discount
        // if the weight of the car is less than 3000 lbs the discount is $200.
        // if else the discount is $150
        double baseTax = .05;
        double salesTax = this.salesPrice * baseTax;
        if (this.weight <= 3000) {
            salesTax = salesTax - 200;
        }
        else {
            salesTax = salesTax - 150;
        }
        return salesTax;
    }

    public String toString() {
        // Overridden toString method that returns a string containing the make and model of the automobile,
        // sales price, sales tax and the weight, appropriately labeled.
        return super.toString() + "\nWeight: " + this.weight;
    }

}

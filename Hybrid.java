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

public class Hybrid extends Automobile {
    // An additional instance variable that contains the number of miles per gallon stored as an integer
    // Should have the same three methods
    private int mpg;

    public Hybrid(String makeModel, int salePrice, int mpg) {
        // A constructor that allows the automobile's make and model, purchase price and miles per gallon to be initialized
        super(makeModel, salePrice);
        this.mpg = mpg;
    }

    protected double salesTax() {
        // Overridden method salesTax that returns the total sales tax
        // Sales tax for hybrid is base 5% minus a discount
        // if the number of miles per gallon is less than 40, discount is $100
        // if else $2 for every mile per gallon in excess of 40
        double hybridDiscount;
        double salesTaxFinal;
        double baseTax = .05;
        double salesTax = this.salesPrice * baseTax;
        if (this.mpg <= 40) {
            salesTaxFinal = salesTax - 100;
        }
        else {
            double difference;
            difference = this.mpg - 40;
            hybridDiscount = difference * 2;
            salesTaxFinal = salesTax + hybridDiscount;
        }
        return salesTaxFinal;
    }

    public String toString() {
        // Overridden toString method that return a string containing the make, model, sales price, sales tax and miles per gallon
        // appropriately labeled.
        return super.toString() + "\nMPG: " + this.mpg;
    }
}

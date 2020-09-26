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

public class Automobile {
    protected String makeModel;
    protected int salesPrice;

    public Automobile() {

    }
    public Automobile(String makeModel, int salesPrice){
        this.makeModel = makeModel;
        this.salesPrice = salesPrice;
    }

    protected double salesTax() {
        // method named salesTax that return the base sales tax computed as 5% of the sales price

        // this.salesPrice = salesPrice;
        double baseTax = .05;
        double salesTax = this.salesPrice * baseTax;
        return salesTax;
    }

    public String toString() {
        // a toString method that returns a string containing the make and model of the automobile, sale price, and
        // sales tax appropriately labeled
        return "\nMake and Model: " + this.makeModel + "\nSales Price: " + this.salesPrice + "\nSales Tax: " + this.salesTax();
    }

}

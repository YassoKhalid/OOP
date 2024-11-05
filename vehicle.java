
package test;

/**
 *
 * @author yasso
 */
public class vehicle {

    protected int IDNumber;
    protected String Brand;
    protected double price;

    public vehicle(int IDNumber, String Brand, double price) {
        this.IDNumber = IDNumber;
        this.Brand = Brand;
        this.price = price;

    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

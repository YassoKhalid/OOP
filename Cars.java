
package test;

/**
 *
 * @author yasso
 */
public class Cars extends vehicle {

    protected int numberOfSeats;
    protected boolean IsAutomatic;

    public Cars(int numberOfSeats, boolean IsAutomatic, int IDNumber, String Brand, double price) {
        super(IDNumber, Brand, price);
        this.numberOfSeats = numberOfSeats;
        this.IsAutomatic = IsAutomatic;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isIsAutomatic() {
        return IsAutomatic;
    }

    public void setIsAutomatic(boolean IsAutomatic) {
        this.IsAutomatic = IsAutomatic;
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

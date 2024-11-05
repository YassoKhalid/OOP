
package test;

/**
 *
 * @author yasso
 */
public class Bicycle extends vehicle{
    protected double frameSize;
    protected boolean ForChildren;

    public Bicycle(double frameSize, boolean ForChildren, int IDNumber, String Brand, double price) {
        super(IDNumber, Brand, price);
        this.frameSize = frameSize;
        this.ForChildren = ForChildren;
    }

    public double getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(double frameSize) {
        this.frameSize = frameSize;
    }

    public boolean isForChildren() {
        return ForChildren;
    }

    public void setForChildren(boolean ForChildren) {
        this.ForChildren = ForChildren;
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

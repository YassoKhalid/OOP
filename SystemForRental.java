
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasso
 */
public class SystemForRental {

    protected List<vehicle> vehicles;

    public SystemForRental() {
        vehicles = new ArrayList<>();
    }

    public vehicle getAccount(int IDnum) {
        for (vehicle v : vehicles) {
            if (v.IDNumber == IDnum) {
                return v;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void display() {
        if (vehicles.isEmpty()) {
            System.out.println("THERE IS NO CURRENT VEHICLES");
        } else {
            for (vehicle v : vehicles) {
                System.out.println("Vehicle Brand is: " + v.Brand + "\n vehicl ID Number is: " + v.IDNumber + "\n vehicle price is: " + v.price);
            }
        }
    }

    public void add(vehicle tar) {
        vehicles.add(tar);
        System.out.println("Add Done");
    }

    public void remove(vehicle tar) {
        vehicle tmp = null;
        for (vehicle v : vehicles) {
            if (v == tar) {
                tmp = v;
                break;
            }
        }
        if (tmp == null) {
            System.out.println("vehicle not found");
        } else {
            vehicles.remove(tar);
            System.out.println("Remove Done");
        }
    }

    public void view(vehicle v) {
        boolean ok = false;
        for (vehicle i : vehicles) {
            if (i == v) {
                System.out.println("Vehicle Brand is: " + v.Brand + "\n vehicl ID Number is: " + v.IDNumber + "\n vehicle price is: " + v.price);
                ok = true;
                break;
            }
        }
        if (ok == false) {
            System.out.println("This vehicle Is not Available");
        }
    }

}

package exercises.chapter6;

/*
 * Enhance the phone bill exercise by redoing it in an object-oriented style.
 * A phone bill should have an id, base cost, number of allotted minutes, and
 * number of minutes used. One should also be able to calculate the overage,
 * tax, and total on a phone bill, and also be able to print an itemized bill.
 * Include the following constructors: default, id-only, and all fields. No matter
 * which constructor is used, all fields should be set eventually.
 * Create a class that instantiates a phone bill and prints the itemized bill.
 */
public class PhoneBill {
    // Declare private fields in class
    private int id;
    private double baseCost;
    private int minutesAllowed;
    private int minutesUsed;

    // Declare constructors (default, id-only, all fields)
    public PhoneBill() {
        // I can optionally set default values as shown below.  When instantiating PhoneBill using
        // this constructor with defaulted values, no additional information needs to be entered by the user.
        // If no defaults are set, user will have to enter data for each field in the class.
            // this.id = 0;
            // this.baseCost = 50;
            // this.minutesAllowed = 50;
            // this.minutesUsed = 60;
    }

    public PhoneBill(int id) {
        setId(id);
        baseCost = 0;
        minutesAllowed = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id, double baseCost, int minutesAllowed, int minutesUsed) {
        setId(id);
        setBaseCost(baseCost);
        setMinutesAllowed(minutesAllowed);
        setMinutesUsed(minutesUsed);
    }

    // Declare getter/setter for all fields on class
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getMinutesAllowed() {
        return minutesAllowed;
    }

    public void setMinutesAllowed(int minutesAllowed) {
        this.minutesAllowed = minutesAllowed;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    // Declare methods: calc overage, calc tax, calc total, print itemized bill
    public double calculateOverageFees() {
        double overagePricePerMin = 0.25;
        int overageMinutes = minutesUsed - minutesAllowed;
        if (overageMinutes > 0) {
            return overageMinutes * overagePricePerMin;
        }
        else {
            return 0;
        }
    }

    public double calculateTax() {
        double taxRate = 0.15;
        return (baseCost + calculateOverageFees()) * taxRate;
    }

    public double calculateTotal() {
        return baseCost + calculateOverageFees() + calculateTax();
    }

    public void printItemizedBill() {
        System.out.printf("Phone Bill Statement: %d\n", id);
        System.out.printf("Plan: $%.2f\n", baseCost);
        System.out.printf("Overage: $%.2f\n", calculateOverageFees());
        System.out.printf("Tax: $%.2f\n", calculateTax());
        System.out.printf("Total: $%.2f\n", calculateTotal());
    }

}

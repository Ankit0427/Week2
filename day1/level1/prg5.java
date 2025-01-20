class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}

// Main class
public class prg5 {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S22", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.99);

        // Display details of each phone
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();
        System.out.println();

        System.out.println("Phone 2 Details:");
        phone2.displayDetails();
    }
}
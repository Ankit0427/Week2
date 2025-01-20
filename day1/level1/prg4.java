class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: $" + String.format("%.2f", price));
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class prg4 {
    public static void main(String[] args) {
        // Create item objects
        Item item1 = new Item(101, "Laptop", 750.00);
        Item item2 = new Item(102, "Mouse", 25.50);

        // Display details of each item
        System.out.println("Item 1 Details:");
        item1.displayDetails();
        int quantity1 = 2;
        System.out.println("Total Cost for " + quantity1 + " units: $" 
                           + String.format("%.2f", item1.calculateTotalCost(quantity1)));

        System.out.println();

        System.out.println("Item 2 Details:");
        item2.displayDetails();
        int quantity2 = 5;
        System.out.println("Total Cost for " + quantity2 + " units: $" 
                           + String.format("%.2f", item2.calculateTotalCost(quantity2)));
    }
}
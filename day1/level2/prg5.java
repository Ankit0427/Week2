import java.util.*;

// CartItem class definition
class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the attributes
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to update the quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}

// ShoppingCart class definition
class ShoppingCart {
    // List to store cart items
    private List<CartItem> cartItems;

    // Constructor to initialize the cart
    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.updateQuantity(item.getQuantity() + quantity);
                System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
                return;
            }
        }
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (CartItem item : cartItems) {
            System.out.println(item.getItemName() + " - $" + item.getPrice() + " x " + item.getQuantity() + 
                               " = $" + item.getTotalCost());
        }
    }
}

// Main class
public class prg5 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Apple", 0.99, 3);
        cart.addItem("Banana", 0.59, 5);
        cart.addItem("Orange", 1.29, 2);

        // Displaying cart items and total cost
        cart.displayCartItems();
        cart.displayTotalCost();

        // Adding more of an existing item
        cart.addItem("Apple", 0.99, 2);

        // Removing an item
        cart.removeItem("Banana");

        // Displaying cart items and total cost after modifications
        cart.displayCartItems();
        cart.displayTotalCost();
    }
}

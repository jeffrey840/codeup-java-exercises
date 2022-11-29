package GroceryList;

/*
* 1. Create a command line grocery list maker
    - before prompting the user to enter each item, ask how many items will be
      entered
    - for each item, the user should be prompted to enter in the name, quantity,
      and category of each grocery item
    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
      objects to store in an array
    - once the user has entered all items, print out all items grouped by
      category and alphabetized in each group
* */

public class GroceryItem {
    private String name;
    private int quantity;
    private String category;

//    CONSTRUCTOR
    public GroceryItem(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

//     METHOD/SETTER
    public void setName(String name) {
        this.name = name;
    }
//     METHOD/GETTER
    public String getName() {
        return name;
    }

//     METHOD/SETTER
    public void setCategory(String category) {
        this.category = category;
    }

//     METHOD/GETTER
    public String getCategory() {
        return category;
    }

//     METHOD/SETTER
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


//         METHOD/GETTER
    public void getItemInfo() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
    }

}



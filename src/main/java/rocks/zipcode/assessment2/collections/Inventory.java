package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String,Integer> storeInventory;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        storeInventory = new HashMap<>();
        for (String product : strings){
            addItemToInventory(product);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    storeInventory = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer currentAmt = getItemQuantity(item);
        currentAmt++;
        storeInventory.put(item, currentAmt);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer currentAmt = getItemQuantity(item);
        currentAmt--;
        storeInventory.put(item, currentAmt);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer quantity = 0;
        if (storeInventory.get(item) != null){
            quantity = storeInventory.get(item);
        }
        return quantity;
    }
}

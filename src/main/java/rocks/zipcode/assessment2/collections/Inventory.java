package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, List<String>> myInventory = new HashMap<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.myInventory = new HashMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        List<String> itemsToAdd = new ArrayList<>(Arrays.asList((item.split(","))));
        for (int i = 0; i < itemsToAdd.size() ; i++) {
            myInventory.put(item, itemsToAdd);
        }
        return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}

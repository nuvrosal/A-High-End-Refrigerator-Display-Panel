package com.example.servingwebcontent;

import java.util.ArrayList;
import java.util.List;

public class FoodManager {

    private List<String> inventory = new ArrayList<>();

    public void addItem(String item) {
        inventory.add(item);
    }

    public List<String> getInventory() {
        return inventory;
    }
}

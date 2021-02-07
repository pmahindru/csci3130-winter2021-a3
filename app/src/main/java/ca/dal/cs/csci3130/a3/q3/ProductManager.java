package ca.dal.cs.csci3130.a3.q3;

import java.util.ArrayList;

public class ProductManager {

    ArrayList<Product> onlineStore;

    public ProductManager() {
        onlineStore = new ArrayList<>();
        Product baseProduct = new Product();
        onlineStore.add(baseProduct);
        Vegetable vegetable = new Vegetable();
        onlineStore.add(vegetable);
        Clothes clothes = new Clothes();
        onlineStore.add(clothes);
    }

    public Product deliverAProduct() {
        if (onlineStore.isEmpty()) {
            return null;
        } else {
            Product topProduct = onlineStore.get(0);
            onlineStore.remove(topProduct);
            return topProduct;
        }
    }
}

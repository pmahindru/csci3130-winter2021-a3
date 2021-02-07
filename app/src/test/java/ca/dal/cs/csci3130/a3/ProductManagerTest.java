package ca.dal.cs.csci3130.a3;

import org.junit.Before;
import org.junit.Test;
import ca.dal.cs.csci3130.a3.q3.Clothes;
import ca.dal.cs.csci3130.a3.q3.Product;
import ca.dal.cs.csci3130.a3.q3.ProductManager;
import ca.dal.cs.csci3130.a3.q3.Vegetable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductManagerTest {

    ProductManager manager;

    @Before
    public void setup() {
        manager = new ProductManager();
    }

    @Test
    public void testPerishableProducts() {
        manager.deliverAProduct();
        Vegetable vegetable = (Vegetable) manager.deliverAProduct();
        assertTrue(vegetable.isPerishable());
        Clothes clothes = (Clothes) manager.deliverAProduct();
        assertFalse(clothes.isPerishable());
    }

    @Test
    public void testProductPrice() {
        Product product = manager.deliverAProduct();
        assertEquals(20, product.getPrice());

        Vegetable vegetable = (Vegetable) manager.deliverAProduct();
        assertEquals(20, vegetable.getPrice());

        Clothes clothes = (Clothes) manager.deliverAProduct();
        assertEquals(20, clothes.getPrice());
    }

    @Test
    public void testProductWeight() {
        manager.deliverAProduct();
        Vegetable vegetable = (Vegetable) manager.deliverAProduct();
        assertEquals(1, vegetable.getWeight());

        Clothes clothes = (Clothes) manager.deliverAProduct();
        assertEquals(0, clothes.getWeight());
    }

    @Test
    public void testFarmProduct() {
        manager.deliverAProduct();
        Vegetable vegetable = (Vegetable) manager.deliverAProduct();
        assertTrue(vegetable.isFarmProduct());

        Clothes clothes = (Clothes) manager.deliverAProduct();
        assertFalse(clothes.isFarmProduct());
    }


}

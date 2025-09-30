package complex_tasks.task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    @Test
    public void userCanAddProduct() {
        //ER: t-shirt
        //key: clothes, value (=list of products): (t-shirt, skort, dress)
        //key: food, value: (chips, fruits, meat)
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);
        Product tShirt = new Product("T shirt", 500.00, "Clothes");
        service.addProduct("Clothes", tShirt);
        assertEquals("T shirt", service.getInventoryListCopy().get("Clothes").getFirst().getName());
    }

    @Test
    public void userCanNotAddProductIfInventoryIsClosed() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);
        Product tShirt = new Product("T shirt", 500.00, "Clothes");
        assertThrows(InventoryIsClosedException.class, () -> {
            service.addProduct("Clothes", tShirt);
                    }, "Inventory is closed!");
    }

    @Test
    public void userCanGetProductByCategory() {
        //ER: value (=list of products): (t-shirt, skort)
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);
        Product tShirt = new Product("T shirt", 500.00, "Clothes");
        Product skort = new Product("Mini skort", 1000.00, "Clothes");
        Product dress = new Product("Dress", 1500.00, "Clothes");
        service.addProduct("Clothes", tShirt);
        service.addProduct("Clothes", skort);
        service.addProduct("Clothes", dress);
        service.getProductByCategory("Clothes", "Dress");
        List<Product> expectedResult = List.of(tShirt, skort);
        List<Product> actualResult = service.getInventoryListCopy().get("Clothes");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotGetOutOfStockProductByCategory() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);
        Product tShirt = new Product("T shirt", 500.00, "Clothes");
        service.addProduct("Clothes", tShirt);
        service.getProductByCategory("Clothes", "T shirt");
        assertThrows(OutOfStockException.class, () -> {
            service.getProductByCategory("Clothes", "T shirt");
        }, "Out of stock!");
    }
}
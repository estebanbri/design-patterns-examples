package creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl.ejemplo_teorico;

import creacionales.Factory_Method.ejemplo_teorico.patron.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl.ProductAFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl.ProductBFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl.RandomProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.IProduct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FactoryMethodTest {

    @Test
    public void testCreateProductA(){
        IProductFactory productFactory = new ProductAFactory();
        IProduct product = productFactory.createProduct();
        assertEquals("Product - A",product.getDescription());
    }

    @Test
    public void testCreateProductB(){
        IProductFactory productFactory = new ProductBFactory();
        IProduct product = productFactory.createProduct();
        assertEquals("Product - B",product.getDescription());
    }

    @Test
    public void testCreateRandomProduct(){
        IProductFactory productFactory = new RandomProductFactory();
        IProduct product = productFactory.createProduct();
        assertNotNull(product.getDescription());
    }

}
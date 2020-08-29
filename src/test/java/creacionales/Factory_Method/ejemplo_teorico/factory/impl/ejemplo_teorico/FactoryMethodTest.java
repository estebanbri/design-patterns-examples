package creacionales.Factory_Method.ejemplo_teorico.factory.impl.ejemplo_teorico;

import creacionales.Factory_Method.ejemplo_practico.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.EnemyAFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.EnemyBFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.RandomEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.product.IEnemy;
import creacionales.Factory_Method.ejemplo_teorico.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.factory.impl.ProductAFactory;
import creacionales.Factory_Method.ejemplo_teorico.factory.impl.ProductBFactory;
import creacionales.Factory_Method.ejemplo_teorico.factory.impl.RandomProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.product.IProduct;
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
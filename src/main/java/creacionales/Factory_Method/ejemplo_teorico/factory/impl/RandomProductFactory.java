package creacionales.Factory_Method.ejemplo_teorico.factory.impl;

import creacionales.Factory_Method.ejemplo_teorico.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.product.IProduct;
import creacionales.Factory_Method.ejemplo_teorico.product.impl.ProductA;
import creacionales.Factory_Method.ejemplo_teorico.product.impl.ProductB;

import java.util.Random;

public class RandomProductFactory implements IProductFactory {

    private Random r = new Random();

    @Override
    public IProduct createProduct() {
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        return result == 1 ? new ProductA() : new ProductB();
    }
}

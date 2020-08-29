package creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl;

import creacionales.Factory_Method.ejemplo_teorico.patron.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.IProduct;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.impl.ProductA;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.impl.ProductB;

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

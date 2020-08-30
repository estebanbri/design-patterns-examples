package creacionales.Factory_Method;

import creacionales.Factory_Method.ejemplo_teorico.patron.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.IProduct;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.impl.ProductA;

public class ProductAFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}

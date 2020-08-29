package creacionales.Factory_Method.ejemplo_teorico.factory.impl;

import creacionales.Factory_Method.ejemplo_teorico.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.product.IProduct;
import creacionales.Factory_Method.ejemplo_teorico.product.impl.ProductA;

public class ProductAFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}

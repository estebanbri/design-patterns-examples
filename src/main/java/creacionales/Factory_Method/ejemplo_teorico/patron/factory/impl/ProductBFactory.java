package creacionales.Factory_Method.ejemplo_teorico.patron.factory.impl;

import creacionales.Factory_Method.ejemplo_teorico.patron.factory.IProductFactory;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.IProduct;
import creacionales.Factory_Method.ejemplo_teorico.patron.product.impl.ProductB;

public class ProductBFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}

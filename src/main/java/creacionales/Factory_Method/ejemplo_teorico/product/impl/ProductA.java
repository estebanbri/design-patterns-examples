package creacionales.Factory_Method.ejemplo_teorico.product.impl;

import creacionales.Factory_Method.ejemplo_teorico.product.IProduct;

public class ProductA implements IProduct {
    @Override
    public String getDescription() {
        return "Product - A";
    }
}

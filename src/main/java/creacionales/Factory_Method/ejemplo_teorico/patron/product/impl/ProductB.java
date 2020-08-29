package creacionales.Factory_Method.ejemplo_teorico.patron.product.impl;

import creacionales.Factory_Method.ejemplo_teorico.patron.product.IProduct;

public class ProductB implements IProduct {
    @Override
    public String getDescription() {
        return "Product - B";
    }
}

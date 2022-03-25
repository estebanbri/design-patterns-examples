package estructural.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends ProductBase {

    private List<ProductBase> products = new ArrayList<>();

    public void addProduct(ProductBase product) {
        products.add(product);
    }


}

package estructural.Composite;

import estructural.Composite.model.CompositeProduct;
import estructural.Composite.model.Product;
import estructural.Composite.model.ProductBase;

public class Client {
    public static void main(String[] args) {


        ProductBase productSimpleA = new Product();
        ProductBase productSimpleB = new Product();


        CompositeProduct compositeProductA = new CompositeProduct();
        CompositeProduct compositeProductB = new CompositeProduct();

        compositeProductB.addProduct(productSimpleA);
        compositeProductB.addProduct(productSimpleB);

        compositeProductA.addProduct(compositeProductB);




    }
}

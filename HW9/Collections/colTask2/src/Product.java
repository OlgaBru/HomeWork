import java.util.Collection;
import java.util.Collections;

public class Product {
    private String nameProduct;

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public Product(){}
    public Product (String nameProduct) {
        this.nameProduct = nameProduct;
    }
}

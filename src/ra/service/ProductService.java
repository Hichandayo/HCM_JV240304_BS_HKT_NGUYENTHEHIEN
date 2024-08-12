package ra.service;

import ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IGenericService<Product,String> {
    private final List<Product> products = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(String id) {
        return products.stream()
                .filter(product -> product.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(String id) {
        products.removeIf(product -> product.getProductId().equals(id));
    }
}

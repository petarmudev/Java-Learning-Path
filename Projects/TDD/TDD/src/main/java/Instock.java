
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Instock implements ProductStock {
    private List<Product> products;


    public Instock() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public int getCount() {
        return this.products.size();
    }

    @Override
    public boolean contains(Product product) {
        return this.products.contains(product);
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void changeQuantity(String product, int quantity) {
        //find product with that label(product)
        Product foundProduct = this.products
                .stream()
                .filter(pr -> pr.getLabel().equals(product))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        //changeQuantity -> quantity
        foundProduct.setQuantity(quantity);
    }

    @Override
    public Product find(int index) {
        return this.products.get(index);
    }

    @Override
    public Product findByLabel(String label) {
        return this.products.stream()
                .filter(p -> p.getLabel().equals(label))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
        //0 invalid count -> return empty collection
        if (count < 0 || count > this.products.size()) {
            return new ArrayList<>();
        }
        //1 return first count elements
        //2 sort by label /ascending order/
        return this.products
                .stream()
                .limit(count)
                .sorted(Comparator.comparing(Product::getLabel))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findAllInRange(double lo, double hi) {
        return this.products
                .stream()
                .filter(p -> p.getPrice() > lo && p.getPrice() <= hi)
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findAllByPrice(double price) {
        return this.products
                .stream()
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findFirstMostExpensiveProducts(int count) {
        //todo
        return null;
    }

    @Override
    public Iterable<Product> findAllByQuantity(int quantity) {
        return this.products
                .stream()
                .filter(p -> p.getQuantity() == quantity)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Product> iterator() {
        return this.products.iterator();
    }
}

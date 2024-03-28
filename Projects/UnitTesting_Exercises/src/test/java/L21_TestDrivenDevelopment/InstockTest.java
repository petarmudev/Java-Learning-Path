package L21_TestDrivenDevelopment;

import L21_TestDrivenDevelopment.Instock;
import L21_TestDrivenDevelopment.Product;
import L21_TestDrivenDevelopment.ProductStock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class InstockTest {

    private ProductStock stock;


    @Before
    public void setUp() {
        this.stock = new Instock();
        //празен склад
    }

    //contains + add
    @Test
    public void testContainsAndAdd() {
        // празен склад: {} ->
        Product product = new Product("water", 1.2, 2);
        Assert.assertFalse(this.stock.contains(product));
        this.stock.add(product);
        // -> {water}
        Assert.assertTrue(this.stock.contains(product));
    }

    //count
    @Test
    public void testGetCount() {
        //{} -> 0 продукта
        Assert.assertEquals(0, this.stock.getCount());
        fillStockWithThreeItems();
        Assert.assertEquals(3, this.stock.getCount());
    }

    //Find
    //1. correctly found
    @Test
    public void testFindReturnCorrectProduct() {
        //{}
        fillStockWithThreeItems();
        //{water, bread, cheese}
        Product productFound = this.stock.find(2);
        Assert.assertEquals("cheese", productFound.getLabel());
        Assert.assertEquals(5, productFound.getQuantity());

    }

    //2. index > size  -> IndexOutOfBounds
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindThrowExceptionIndexGreater() {
        //{}
        fillStockWithThreeItems();
        //{water, bread, cheese}
        this.stock.find(4);
    }

    //3. index < 0  -> IndexOutOfBounds
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindThrowExceptionIndexNegative() {
        //{}
        fillStockWithThreeItems();
        //{water, bread, cheese}
        this.stock.find(-1);
    }

    // changeQuantity(String, int)
    //1. successfully change quantity
    @Test
    public void testChangeQuantitySuccessfulUpdate() {
        //{}
        fillStockWithThreeItems();
        //{water, bread, cheese}
        Product productBread = this.stock.find(1);

        this.stock.changeQuantity("bread", 9);
        //{bread, 1.9, 9}
        Assert.assertEquals(productBread.getQuantity(), 9);

    }

    //2. change on non-existing product
    @Test(expected = IllegalArgumentException.class)
    public void testChangeQuantityThrowsInvalidProduct() {
        //{}
        fillStockWithThreeItems();
        //{water, bread, cheese}
        this.stock.changeQuantity("wine", 8);

    }

    //findByLabel
    //1.successful return
    @Test
    public void testFindByLabelReturnsCorrectProduct() {
        fillStockWithThreeItems();
        Product foundProduct = this.stock.findByLabel("bread");
        Assert.assertEquals("bread", foundProduct.getLabel());
    }
    //2. invalid product

    @Test(expected = IllegalArgumentException.class)
    public void testFindByLabelThrowsInvalidProduct() {
        fillStockWithThreeItems();
        this.stock.findByLabel("hello");
    }

    //findFirstByAlphabeticalOrder
    //1. Връща първите count на брой елементи
    @Test
    public void testFindFirstByAlphabeticalOrderCorrectCountProducts() {
        fillStockWithThreeItems(); //-> {water, bread, cheese}
        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(2);
        //{water, bread} (count 2)
        int countGetProducts = 0;
        for (Product product : iterable) {
            countGetProducts++;
        }
        Assert.assertEquals(2, countGetProducts);
    }

    //2 Връща правилно сортиране
    @Test
    public void testFindFirstByAlphabeticalOrderCorrectSorted() {
        fillStockWithThreeItems();
        List<String> expectedProductLabels = new ArrayList<>();
        String productLabel;
        for (int i = 0; i < this.stock.getCount(); i++) {
            productLabel = this.stock.find(i).getLabel();
            expectedProductLabels.add(productLabel);
        }

        expectedProductLabels = expectedProductLabels
                .stream()
                .sorted()
                .collect(Collectors.toList());

        //returned items
        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(3);
        List<String> returnedProductLabels = new ArrayList<>();

        for (Product product : iterable) {
            returnedProductLabels.add(product.getLabel());
        }

        Assert.assertEquals(expectedProductLabels, returnedProductLabels);
    }

    //3 невалиден брой
    @Test
    public void testFindFirstByAlphabeticalOrderThrowInvalidCount() {
        fillStockWithThreeItems();

        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(5);

        Assert.assertFalse(iterable.iterator().hasNext());
    }

    //findAllInPriceRange
    //1. correct range
    @Test
    public void testFindAllInPriceRange() {
        fillStockWithThreeItems();
        // {water 1.2, bread 2.9, cheese 12.4}
        Iterable<Product> returnedProducts = this.stock.findAllInRange(1.1, 3.5);
        int countReturned = 0;
        for (Product product : returnedProducts) {
            countReturned++;
        }
        Assert.assertEquals(2, countReturned);
    }

    //2. sorts correctly
    @Test
    public void testFindAllInPriceRangeCorrectSort() {
        fillStockWithThreeItems();
        // {water 1.2, bread 2.9, cheese 12.4}
        Iterable<Product> iterable = this.stock.findAllInRange(1.1, 3.5);
        // -> {bread 2.9, water 1.2}
        List<Product> returnedProducts = getProductsFromIterable(iterable);

        Assert.assertEquals("bread", returnedProducts.get(0).getLabel());
        Assert.assertEquals("water", returnedProducts.get(1).getLabel());
    }

    //3. no elements in the collection
    @Test
    public void testFindAllInPriceRangeNoMatch() {
        fillStockWithThreeItems();
        Iterable<Product> iterable = this.stock.findAllInRange(31, 50);
        Assert.assertFalse(iterable.iterator().hasNext());
    }

    //findAllByPrice
    //1.return all products with the given price
    @Test
    public void testFindAllByPriceCorrectProducts() {
        fillStockWithThreeItems();
        // {water 1.2, bread 2.9, cheese 12.4}
        Iterable<Product> productIterable = this.stock.findAllByPrice(2.9);
        List<Product> returnedProducts = getProductsFromIterable(productIterable);
        Assert.assertEquals(1, returnedProducts.size());
        Assert.assertEquals("bread", returnedProducts.get(0).getLabel());
    }

    //2.return empty list if no such product/s
    @Test
    public void testFindAllByPriceByInvalidPrice() {
        Iterable<Product> productIterable = this.stock.findAllByPrice(50);
        Assert.assertFalse(productIterable.iterator().hasNext());
    }

    //findAllByQuantity
    //1.return all products with the given quantity
    @Test
    public void testFindAllByQuantityCorrectProducts() {
        fillStockWithThreeItems();
        // {water 2, bread 3, cheese 5}
        Iterable<Product> productIterable = this.stock.findAllByQuantity(3);
        List<Product> returnedProducts = getProductsFromIterable(productIterable);
        Assert.assertEquals(1, returnedProducts.size());
        Assert.assertEquals("bread", returnedProducts.get(0).getLabel());
    }


    //2.return empty list if no such product/s
    @Test
    public void testFindAllByQuantityByInvalidPrice() {
        Iterable<Product> productIterable = this.stock.findAllByQuantity(50);
        Assert.assertFalse(productIterable.iterator().hasNext());
    }

    //findFirstMostExpensiveProducts
    @Test
    public void findFirstMostExpensiveProducts() {
        // Test when count is less than the number of products
        fillStockWithThreeItems();
        Iterable<Product> result1 = this.stock.findFirstMostExpensiveProducts(2);
        List<Product> resultList1 = new ArrayList<>();
        result1.forEach(resultList1::add);
        Assert.assertEquals(2, resultList1.size());
        Assert.assertEquals("cheese", resultList1.get(0).getLabel());
        Assert.assertEquals("bread", resultList1.get(1).getLabel());

        // Test when count is equal to the number of products
        Iterable<Product> result2 = this.stock.findFirstMostExpensiveProducts(3);
        List<Product> resultList2 = new ArrayList<>();
        result2.forEach(resultList2::add);
        Assert.assertEquals(3, resultList2.size());
        Assert.assertEquals("cheese", resultList2.get(0).getLabel());
        Assert.assertEquals("bread", resultList2.get(1).getLabel());
        Assert.assertEquals("water", resultList2.get(2).getLabel());

    }

    @Test(expected = IllegalArgumentException.class)
    public void findFirstMostExpensiveProductsThrows() {
        // Test when count is greater than the number of products
        //try{
        this.stock.findFirstMostExpensiveProducts(5);

    }


    //getIterable
    @Test
    public void testIterator() {
        fillStockWithThreeItems();
        List<Product> expectedProducts = new ArrayList<>();
        for (int i = 0; i < this.stock.getCount(); i++) {
            expectedProducts.add(this.stock.find(i));
        }

        Iterator<Product> productIterator = this.stock.iterator();
        List<Product> returnedProducts = new ArrayList<>();
        while (productIterator.hasNext()) {
            returnedProducts.add(productIterator.next());
        }
        Assert.assertEquals(expectedProducts, returnedProducts);

    }


    //Methods
    private static List<Product> getProductsFromIterable(Iterable<Product> productIterable) {
        List<Product> returnedProducts = new ArrayList<>();

        for (Product product : productIterable) {
            returnedProducts.add(product);
        }
        return returnedProducts;
    }


    private void fillStockWithThreeItems() {
        Product product1 = new Product("water", 1.2, 2);
        Product product2 = new Product("bread", 2.9, 3);
        Product product3 = new Product("cheese", 12.4, 5);
        this.stock.add(product1);
        this.stock.add(product2);
        this.stock.add(product3);
    }
}
public class main {

    public static Product findMostExpensive(Product[] products) {
        Product mostExpensive = products[0];
        for (Product p : products) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }
}


    void main() {
        Product p1 = new Product("Laptop", 5999, new String[]{"electronics", "new"});
        Product p2 = new Product("Mouse", 199, new String[]{"electronics", "sale"});
        Product p3 = new Product("Keyboard", 499, new String[]{"electronics", "sale"});
        Product p4 = new Product("Monitor", 2499, new String[]{"electronics"});

        Product[] products = {p1, p2, p3, p4};

        System.out.println("Produkter på tilbud:");
        for (Product p : products) {
            if (p.hasTag("sale")) {
                p.printInfo();
            }
        }
    }

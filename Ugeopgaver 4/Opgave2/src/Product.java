public class Product {
    String name;
    double price;
    String[] tags;

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo() {
        System.out.println(name + " - " + price + " kr");
        System.out.print("  Tags: ");
        for (int i = 0; i < tags.length; i++) {
            System.out.print(tags[i]);
            if (i < tags.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }
        return false;
    }
}
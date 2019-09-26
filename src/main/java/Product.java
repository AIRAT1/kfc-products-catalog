public class Product {
    private int id;
    private String productPictureUrl;
    private int price;
    private String name;
    private int weight;
    private String description;
    private int caloriesQuantity;
    private double proteinQuantity;
    private double fatQuantity;
    private double carbohydratesQuantity;

    Product(int id, String productPictureUrl, int price, String name, int weight, String description, int caloriesQuantity, double proteinQuantity, double fatQuantity, double carbohydratesQuantity) {
        this.id = id;
        this.productPictureUrl = productPictureUrl;
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.caloriesQuantity = caloriesQuantity;
        this.proteinQuantity = proteinQuantity;
        this.fatQuantity = fatQuantity;
        this.carbohydratesQuantity = carbohydratesQuantity;
    }

    @Override
    public String toString() {
        return name +
                " " +
                "{id= " + id +
                ", productPictureUrl='" + productPictureUrl + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                ", caloriesQuantity=" + caloriesQuantity +
                ", proteinQuantity=" + proteinQuantity +
                ", fatQuantity=" + fatQuantity +
                ", carbohydratesQuantity=" + carbohydratesQuantity +
                '}';
    }
}

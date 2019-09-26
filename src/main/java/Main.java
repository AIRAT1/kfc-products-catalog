import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static List<Product> products;
    public static void main(String[] args) {
        initList();
        initProducts();
        showProducts(products);
    }

    private static void initList() {
        products = new ArrayList<>();
    }

    private static void initProducts() {
        Product longer = new Product(0,
                "https://s82079.cdn.ngenix.net/sRrSzWpf86c4hMMwCJ7aHBph.png?dw=230",
                50,
                "Лонгер BBQ",
                107,
                "Сочная курочка, маринованные огурчики, лук и аппетитный соус барбекю! Спешите попробовать!",
                236,
                9.7,
                7.1,
                33.3);
        Product cheeseburger = new Product(1,
                "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230",
                69,
                "Чизбургер",
                167,
                "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.",
                237,
                13.2,
                8.6,
                26.6);
        addProductsToTheList(longer, cheeseburger);
    }

    private static void addProductsToTheList(Product ... product) {
        Collections.addAll(products, product);
    }

    private static void showProducts(List products) {
        if (!products.isEmpty()) {
            for (Object product : products) {
                System.out.println(product);
            }
        }else {
            System.out.println("Add products to the list");
        }
    }
}

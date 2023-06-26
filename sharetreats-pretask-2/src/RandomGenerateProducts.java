import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerateProducts {
    private List<Product> products = new ArrayList<>();
    private Random random = new Random();

    public List<Product> generateProducts() {
        for (int i = 0; i < 100; i++) {
            String name = generateRandomName();
            LocalDateTime dateTime = generateRandomDateTime();
            Product product = new Product(name, dateTime);
            products.add(product);
        }
        return products;
    }

    private String generateRandomName() {
        String[] names = {"CHICKEN", "PIZZA", "CIDER", "COLA", "CHEETOS", "COOKIE", "COFFEE", "SOJU", "BEER", "WINE"};
        int num = random.nextInt(10);
        return names[num];
    }

    private LocalDateTime generateRandomDateTime() {
        LocalDateTime[] dateTimes = {LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1)};
        int num = random.nextInt(2);
        return dateTimes[num];
    }
}

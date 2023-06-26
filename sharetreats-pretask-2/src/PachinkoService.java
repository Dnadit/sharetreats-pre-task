import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PachinkoService {
    private Random random = new Random();

    public List<Object> draw(Integer cnt, List<Product> productList, User user) {
        int prizeBCnt = 0;
        boolean isBSoldOut = false;
        user.draw(cnt);
        List<Object> prizeList = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            if (prizeBCnt >= 3) {
                isBSoldOut = true;
            }
            Product prizeProduct = getProduct(productList, isBSoldOut);
            if (prizeProduct != null && prizeProduct.getGrade().equals("B")) {
                prizeBCnt++;
            }
            prizeList.add(prizeProduct);
        }
        return prizeList;
    }

    private Product getProduct(List<Product> productList, Boolean isBSoldOut) {
        if (random.nextInt(10) < 9) {
            while (true) {
                Integer randomNum = random.nextInt(100);
                Product product = productList.get(randomNum);
                if (product.getGrade().equals("A") && !product.isExpired()) {
                    return product;
                }
            }
        } else {
            if (isBSoldOut) {
                return null;
            }
            while (true) {
                Integer randomNum = random.nextInt(100);
                Product product = productList.get(randomNum);
                if (product.getGrade().equals("B") && !product.isExpired()) {
                    return product;
                }
            }
        }
    }

}

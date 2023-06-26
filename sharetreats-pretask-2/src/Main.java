import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        RandomGenerateProducts randomGenerateProducts = new RandomGenerateProducts();
        PachinkoService pachinkoService = new PachinkoService();

        List<Product> productList = randomGenerateProducts.generateProducts();
        while (user.getWallet() > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("뽑기 몇번 하시나요? 현재 잔액: " + user.getWallet() + "원");
            Integer cnt = sc.nextInt();

            if (user.getWallet() - cnt*100 < 0) {
                System.out.println("잔액이 부족합니다.");
                continue;
            }

            List<Object> prizeList = pachinkoService.draw(cnt, productList, user);

            for (int i = 0; i < prizeList.size(); i++) {
                if (prizeList.get(i) == null) {
                    System.out.println("꽝");
                } else {
                    System.out.println(prizeList.get(i).toString());
                }
            }
            System.out.println("남은 잔액: " + user.getWallet() + "원");
        }
        System.out.println("잔액을 다 소진하셨습니다.");
    }
}

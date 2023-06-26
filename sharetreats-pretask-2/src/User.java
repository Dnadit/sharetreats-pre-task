public class User {
    private Integer wallet;

    public User() {
        wallet = 10000;
    }

    public Integer getWallet() {
        return wallet;
    }

    public void draw(Integer cnt) {
        wallet -= cnt * 100;
    }
}

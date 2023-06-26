import java.time.LocalDateTime;
import java.util.Map;

public class Product {
    private String name;
    private String grade;
    private LocalDateTime expireDate;

    public Product(String name, LocalDateTime expireDate) {
        this.name = name;
        this.expireDate = expireDate;
        if (name.equals("CHICKEN") || name.equals("PIZZA")) {
            this.grade = "B";
        } else {
            this.grade = "A";
        }
    }

    public String getGrade() {
        return grade;
    }

    public Boolean isExpired() {
        return expireDate.isBefore(LocalDateTime.now());
    }

    public String toString() {
        return name;
    }
}

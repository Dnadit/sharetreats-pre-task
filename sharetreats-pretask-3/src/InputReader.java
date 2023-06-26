import java.util.Scanner;

public class InputReader {
    private Scanner sc;
    private StringBuilder sb;

    public InputReader() {
        sc = new Scanner(System.in);
    }

    private void sbAppend(Scanner sc, StringBuilder sb) {
        while (sc.hasNext()) {
            String input = sc.nextLine();
            input = input.toUpperCase();
            if (input.equals("END")) {
                break;
            }
            sb.append(input);
            sb.append("/");
        }
    }

    public StringBuilder readDeptPeopleNum() {
        sb = new StringBuilder();
        System.out.println("부서인원 정보를 입력해주세요. [부서명],[인원] (입력 완료 후 'END'를 입력해주세요.)");
        sbAppend(sc, sb);
        return sb;
    }

    public StringBuilder readDeptRelations() {
        sb = new StringBuilder();
        System.out.println("부서구성도를 입력해주세요. [부서명]>[부서명] (입력 완료 후 'END'를 입력해주세요.)");
        sbAppend(sc, sb);
        return sb;
    }

    public void close() {
        sc.close();
    }
}

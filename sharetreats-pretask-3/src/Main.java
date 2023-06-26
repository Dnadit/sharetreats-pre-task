public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        DeptService deptService = new DeptService();

        String deptPeopleNum = inputReader.readDeptPeopleNum().toString();
        String deptRelations = inputReader.readDeptRelations().toString();
        inputReader.close();

        String result = deptService.solveRequest(deptPeopleNum, deptRelations);
        System.out.println(result);
    }
}

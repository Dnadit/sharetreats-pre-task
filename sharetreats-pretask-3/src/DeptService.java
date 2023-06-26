public class DeptService {
    private String highestDept;
    private Integer peopleTotal;

    private String[] divideString(String str) {
        String[] arr = str.split("/");
        for (int i = 0; i < arr.length; i++) {
            arr[i].replaceAll(" ", "");
        }
        return arr;
    }

    public String solveRequest(String deptPeopleNum, String deptRelations) {
        String[] deptRelationsArr = divideString(deptRelations);
        for (int i = 0; i < deptRelationsArr.length; i++) {
            if (deptRelationsArr[i].equals("")) {
                continue;
            }
            String[] highDept = deptRelationsArr[i].split(">");
            if (highDept[0].replaceAll(" ", "").equals("*")) {
                highestDept = highDept[1].replaceAll(" ", "");
            }
        }

        String[] deptPeopleNumArr = divideString(deptPeopleNum);
        peopleTotal = 0;
        for (int i = 0; i < deptPeopleNumArr.length; i++) {
            if (deptPeopleNumArr[i].equals("")) {
                continue;
            }
            String[] peopleNum = deptPeopleNumArr[i].split(",");
            String eachPeopleNum = peopleNum[1].replaceAll(" ", "");
            peopleTotal += Integer.parseInt(eachPeopleNum);
        }

        return this.toString();
    }

    public String toString() {
        return highestDept + ", " + peopleTotal;
    }

}

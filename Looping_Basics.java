public class Looping_Basics {
    public static void main(String[] args) {
        Looping_Basics lp = new Looping_Basics();
        //lp.firstrow();  // 1   1   1   1   1
        //lp.secondrow();  // 1   2   3   4   5 
        //lp.thirdrow();  // 1   3   5   7   9
        lp.fourthrow();// 3   6   9   12  15
    }

    private void fourthrow() {
        int no = 3;
        while (no<=15) {
            System.out.print(no+" ");
            no = no+3;
        }
        System.out.println();
    }

    private void thirdrow() {
        int no = 1;
        while (no<=10) {
            System.out.print(no+" ");
            no = no+2;
        }
        System.out.println();
    }

    private void secondrow() {
        int no = 1;
        while(no<=5){
        System.out.print(no+" ");
        no++;
        }
    }

    private void firstrow() {
        int no = 1;
        System.out.print(no+" "+no+" "+no+" "+no+" "+no);

    }
}

public class LoopingPrograms {
    public static void main(String[] args) {
        LoopingPrograms lp = new LoopingPrograms();
        lp.onerow();  // 1   1   1   1   1
        // lp.number();  // 1   2   3   4   5 
        // lp.oddnum();  // 1   3   5   7   9
        // lp.thirdnum();// 3   6   9   12  15
    }

    private void thirdnum() {
        int no = 3;
        while (no<=15) {
            System.out.print(no+" ");
            no = no+3;
        }
        System.out.println();
    }

    private void oddnum() {
        int no = 1;
        while (no<=10) {
            System.out.print(no+" ");
            no = no+2;
        }
        System.out.println();
    }

    private void number() {
        int no = 1;
        while(no<=5){
        System.out.print(no+" ");
        no++;
        }
    }

    private void onerow() {
        int no = 1;
        System.out.print(no+" "+no+" "+no+" "+no+" "+no);

    }
}

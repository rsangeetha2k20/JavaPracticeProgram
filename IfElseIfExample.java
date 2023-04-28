public class IfElseIfExample{
    public static void main(String[] args) {
        int marks =  75;
        if (marks > 90){
            System.out.println("Excellent");
        }
        else if (marks > 80){
            System.out.println("Very Good");
        }
        else if (marks > 70){
            System.out.println("Good");
        }
        else if (marks > 60){
            System.out.println("Average");
        }
        else if (marks > 50){
            System.out.println("poor");
        }
        // default statement
        else {
            System.out.println("Fail");
        }
    }
}


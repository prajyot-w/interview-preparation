package prep.interview.InterviewPreparation;

public class TryCatchFinally {

    public int run() {
        try {
            return 5;
        } catch (Exception e) {
            System.out.println("ERROR OCCURED !");
        } finally {
            return 10;
        }
    }
}

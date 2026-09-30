public class TestCad {

    public static void main(String[] args) {

        if (Cad.message().equals("Hello CI/CD!")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}

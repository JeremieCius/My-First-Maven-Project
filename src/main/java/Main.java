import java.io.*;
public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static String testText;
    public static int loopLimit = 11;

    public static String getTestText() {
        return testText;
    }

    public static void setTestText(String testText) {
        Main.testText = testText;
    }

    public static int getLoopLimit() {
        return loopLimit;
    }

    public static void setLoopLimit(int loopLimit) {
        Main.loopLimit = loopLimit;
    }

    public static void main (String[] args) throws IOException {
        for (int i = 0; i <= loopLimit; i++) {
            int tries = getLoopLimit() - i;
            System.out.println("Enter a phrase (You have " + tries + " attempt(s) left)");
            setTestText(in.readLine());
            System.err.println(getTestText() + "\n");
        }
    }
}

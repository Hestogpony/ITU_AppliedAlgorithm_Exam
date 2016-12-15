
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            int n = Integer.valueOf(input);

            for (int i = 0; i < n; i++) {
                input = reader.readLine();
                String[] numbers = input.split(" ");
            }
        }
        catch (IOException exception) {
            System.out.print(exception.getMessage());
        }
    }
}

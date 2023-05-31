import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) {
        String csvFile = "C:/Users/45027278810/Documents/Vini - Python//Integrador_Scrap//output.csv";
        String line = "";
        String csvSeparator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                for (String value : data) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
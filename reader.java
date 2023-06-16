import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    private String csvFile;
    private String csvSeparator;

    public reader(String csvFile, String csvSeparator) {
        this.csvFile = csvFile;
        this.csvSeparator = csvSeparator;
    }

    public void readCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
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

    public static void main(String[] args) {
        String csvFile = "C:/Users/45027278810/Documents/Vini - Python//Integrador_Scrap//output.csv";
        String csvSeparator = ",";

        reader reader = new reader(csvFile, csvSeparator);
        reader.readCSV();
    }
}

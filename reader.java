import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader { // Cria a classe Reader
    private String csvFile;
    private String csvSeparator;

    public reader(String csvFile, String csvSeparator) { // Construtor da classe Reader
        this.csvFile = csvFile;
        this.csvSeparator = csvSeparator;
    }

    public void readCSV() { // Lê o CSV e printa no terminal
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
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader { // Cria as variaveis privadas
    private String csvFile;
    private String csvSeparator;

    public reader(String csvFile, String csvSeparator) { // Construtor da classe Reader
        this.csvFile = csvFile;
        this.csvSeparator = csvSeparator;
    }

    public void readCSV() { // Faz a leitura do CSV
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) { // Lê cada linha do CSV
                String[] data = line.split(csvSeparator); // Divide a linha em partes separadas
                for (String value : data) {
                    System.out.print(value + " "); // Imprime os valores do CSV
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { // Localiza o CSV no diretório
        String csvFile = "C:/Users/45027278810/Documents/Vini - Python//Integrador_Scrap//output.csv";
        String csvSeparator = ",";

        reader reader = new reader(csvFile, csvSeparator); // Cria uma instância do objeto Reader
        reader.readCSV(); // Chama o método para ler o CSV
    }
}

public class main {
    public static void main(String[] args) { // Busca o CSV no diretório
        String csvFile = "C:/Users/45027278810/Documents/Vini - Python/Integrador_Scrap/output.csv";
        String csvSeparator = ",";

        reader reader = new reader(csvFile, csvSeparator);
        reader.readCSV(); //Chama a função no inicio
    }
}
package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException {

        // Current usage
        BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        // Expected usage
        BookMetadataExporter exporter = new XMLBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        exporter = new CSVBookMetadataExporter();
        exporter.add(TestData.cleanArchBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.dinosaurBook);
        exporter.export(System.out);
    }
}

package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createBookMetadataFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}

package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createBookMetadataFormatter() throws ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }
}

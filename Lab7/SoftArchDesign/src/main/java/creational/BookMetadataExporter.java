package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {


    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        BookMetadataFormatter exporter = createBookMetadataFormatter();
        exporter.reset();
        for(Book book : books){
            exporter.append(book);
        }
        stream.println(exporter.getMetadataString());
    }

    public abstract BookMetadataFormatter createBookMetadataFormatter() throws IOException, ParserConfigurationException;
}

package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createBookMetadataFormatter() {
        return new JSONBookMetadataFormatter();
    }
}

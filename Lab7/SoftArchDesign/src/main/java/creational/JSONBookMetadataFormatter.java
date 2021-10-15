package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.xml.parsers.ParserConfigurationException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject jsonBookObj;
    private JSONArray jsonBookArray;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        jsonBookObj = new JSONObject();
        jsonBookArray = new JSONArray();
        jsonBookObj.put(Book.class.getSimpleName()+"s",jsonBookArray);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject jsonMetadataObj = new JSONObject();
        JSONArray jsonAuthorsArray = new JSONArray();
        for(int i=0;i<b.getAuthors().length;i++){
            jsonAuthorsArray.add(b.getAuthors()[i]);
        }
        jsonMetadataObj.put(Book.Metadata.ISBN.value,b.getISBN());
        jsonMetadataObj.put(Book.Metadata.AUTHORS.value,jsonAuthorsArray);
        jsonMetadataObj.put(Book.Metadata.TITLE.value,b.getTitle());
        jsonMetadataObj.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        jsonBookArray.add(jsonMetadataObj);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonBookObj.toString();
    }
}

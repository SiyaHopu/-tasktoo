import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.File;
import java.io.IOException;

public class XMLToJSONConverter {
    public static void main(String[] args) {
        String xmlFilePath = "C:\Users\E&T Comp's Lap\-tasktoo\Records.xml";

        try {
            // Convert XML to Java Object
            Records records = XMLToJava.convertXMLToJava(xmlFilePath);

            // Convert Java Object to JSON
            String json = JavaToJSON.convertJavaToJSON(records);

            // Print JSON
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Records convertXMLToJava(String filePath) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(new File(filePath), Records.class);
    }
    public static String convertJavaToJSON(Records records) throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(records);
    }
}

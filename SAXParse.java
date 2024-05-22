import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

class MyHandler extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element: " + qName);

        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute: " + attributes.getQName(i) + " = " + attributes.getValue(i));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element: " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters: " + new String(ch, start, length));
    }
}

public class SAXParse {
    public static void main(String[] args) {
        try {
            // Create a SAXParserFactory instance
            SAXParserFactory factory = SAXParserFactory.newInstance();
            
            // Create a SAXParser instance
            SAXParser saxParser = factory.newSAXParser();
            
            // Define the XML file to be parsed
            String xmlFilePath = "C:\\Users\\E&T Comp's Lap\\-tasktoo\\Records.xml";
            
            // Parse the XML file
            saxParser.parse(xmlFilePath, new MyHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

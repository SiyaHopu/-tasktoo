import javax.xml.bind.*;
import java.io.File;

public class XMLToJava {
    public static void main(String[] args) {
        try {
            File file = new File("C:\Users\E&T Comp's Lap\-tasktoo\Records.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Records.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Records records = (Records) jaxbUnmarshaller.unmarshal(file);

            for (Users user :records.getUsers) {
                System.out.println("User Name: " + user.getName);
                System.out.println("PostalZip: " + user.getPostalZip);
                System.out.println("Region: " + user.getRegion);
                System.out.println("Country: " + user.getCountry);
                System.out.println("Address: " + user.getAddress);
                System.out.println("List: " + user.getList);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

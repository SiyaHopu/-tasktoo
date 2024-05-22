import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.bind.*;
import java.io.File;

public class XMLToJava {

    public static String handleStringInput(Scanner scanner) { //Validation of the user input
        System.out.print("What field do you require: ");
        try {
            String text = scanner.nextLine();
            return text;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. i.e Name, Zip, Region, Country, Address and List.");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            String input = handleStringInput(Scanner scanner);;
            try {
                File file = new File("C:\Users\E&T Comp's Lap\-tasktoo\Users.java");
                JAXBContext jaxbContext = JAXBContext.newInstance(Records.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Records records = (Records) jaxbUnmarshaller.unmarshal(file);
                for (Users user :records.getUsers) {
                    if (input.toLowerCase() == "name") {
                        System.out.print("Name: " + user.getName());
                    }
                    if (input.toLowerCase() == "zip") {
                        System.out.print("PostalZip: " + user.getPostalZip());
                    }
                    if (input.toLowerCase() == "region") {
                        System.out.print("Region: " + user.getRegion());
                    }
                    if (input.toLowerCase() == "country") {
                        System.out.print("Country: " + user.getCountry());
                    }
                    if (input.toLowerCase() == "address") {
                        System.out.print("Address: " + user.getAddress());
                    }        elif (input.toLowerCase() == "list") {
                        System.out.print("List: " + user.getList());
                    }
                }
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        } finally {
            scanner.close();
        }
    }
}

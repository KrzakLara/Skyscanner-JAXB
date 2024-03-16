package Validator;

import Models.Carriers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBValidation {
    public static void main(String[] args) {
        try {
            // Stvaranje JAXB konteksta za vaše generirane JAXB klase
            JAXBContext context = JAXBContext.newInstance(Carriers.class);

            // Stvaranje unmarshaller-a za provjeru datoteke
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Učitavanje generirane datoteke
            File file = new File("Air_carriers.xml");

            // Provjera datoteke u skladu sa XSD-om
            Carriers carriers = (Carriers) unmarshaller.unmarshal(file);

            // Ako se kod izvede bez iznimke, datoteka je u skladu sa XSD-om
            System.out.println("Datoteka je u skladu sa XSD-om.");
        } catch (JAXBException e) {
            // Iznimka će se baciti ako datoteka nije u skladu sa XSD-om
            System.out.println("Datoteka nije u skladu sa XSD-om: " + e.getMessage());
        }
    }
}

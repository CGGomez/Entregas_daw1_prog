package XML;

import java.io.EOFException;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import java.io.FileNotFoundException;

public class Tarea2 {
	 public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException {
		Persona p = new Persona("Sara", 21);
		String edad = String.valueOf(p.getEdad());
		 
		 try {
			 DocumentBuilderFactory archive = DocumentBuilderFactory.newInstance();
			 DocumentBuilder builder = archive.newDocumentBuilder();
			 DOMImplementation implementation = builder.getDOMImplementation();
			 
			 Document documento = implementation.createDocument(null, "personas", null);
			 Text textNombre = documento.createTextNode(p.getNombre());
			 Text textedad = documento.createTextNode(edad); 
			 
		 }catch(ParserConfigurationException ex) {
			 System.out.println(ex.getMessage());
		 }
	 }
}

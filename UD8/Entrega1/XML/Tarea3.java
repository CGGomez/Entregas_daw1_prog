package XML;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Tarea3 {
	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		PersonaEtiqueta pe = new PersonaEtiqueta("Persona");
		String archivo = pe.getDoctumento()+".xml";
		ObjectInputStream in = null;
		
		try {
			 in = new ObjectInputStream(new FileInputStream(archivo+".xml"));
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		     Document doc = dBuilder.parse(in);
		     doc.getDocumentElement().normalize();
		     NodeList nList = doc.getElementsByTagName("personas");
			 for (int temp = 0; temp < nList.getLength(); temp++) {
				   Node nNode = nList.item(temp);
		            System.out.println("\nCurrent Element :" + nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		               Element eElement = (Element) nNode;
		               System.out.println("Personas : " 
		                  + eElement.getAttribute("Persona"));
		               System.out.println("Nombre : " 
		                  + eElement
		                  .getElementsByTagName("nombre")
		                  .item(0)
		                  .getTextContent());
		               System.out.println("Edad : " 
		                  + eElement
		                  .getElementsByTagName("edad")
		                  .item(0)
		                  .getTextContent());
		            }
		         }
		}catch(FileNotFoundException e){
			System.out.println( "Archivo no encontrado" );
		}
		
	}
}

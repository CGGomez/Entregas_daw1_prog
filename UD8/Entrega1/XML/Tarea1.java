package XML;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Tarea1 {

   public static void main(String[] args) {
	   pasearDOMPersonas p = new pasearDOMPersonas("personas");
	   Etiquetas et = new Etiquetas( "persona", "12" );
	   String nombre;

      try {
         File inputFile = new File(p.archivo+".xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Elemento Clave :" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("personas");
         System.out.println("----------------------------");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Personas : " 
                  + eElement.getAttribute("Persona"));
               System.out.println("Nombre : " 
                  + eElement
                  .getElementsByTagName(et.nombre)
                  .item(0)
                  .getTextContent());
               System.out.println("Edad : " 
                  + eElement
                  .getElementsByTagName(et.edad)
                  .item(0)
                  .getTextContent());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
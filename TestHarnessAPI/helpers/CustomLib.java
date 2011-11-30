/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jaco
 */
public class CustomLib {

    public Integer getMySum(int val1, int val2) {
        return val1 + val2;
    }
    
      public String getMyString() {
        return "my test return...";
    }

 	 public int getTheCount() {
	        int totalPersons = 0;
	        try {
	          //  System.out.println("start 1...");
	            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	            Document doc = null;
	           // System.out.println("start 2...");
	            try {
	                doc = docBuilder.parse("test.txt");
	            //    System.out.println("location:" + doc.getBaseURI());
	            } catch (SAXException ex) {
	                System.out.println(ex.getMessage());
	            } catch (IOException ex) {
	                System.out.println(ex.getMessage());
	            }
	            doc.getDocumentElement().normalize();
	         //   System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());

	            NodeList listOfPersons = doc.getElementsByTagName("item");
	            totalPersons = listOfPersons.getLength();
	          //  System.out.println("Total no of items : " + totalPersons);

	        } catch (ParserConfigurationException ex) {
	            System.out.println(ex.getMessage());
	        }
	        return totalPersons;
	    }
}

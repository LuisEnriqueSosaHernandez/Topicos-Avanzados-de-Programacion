/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JONATHAN
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import sun.rmi.runtime.Log;

public class XMLGenerator {

    public static String obtenerNodoValor(String strTag, Element eUser) {
        Node nValor = (Node) eUser.getElementsByTagName(strTag).item(0).getFirstChild();
        return nValor.getNodeValue();
    }

    public void agregarUsuario(String nombre, String contraseña) throws SAXException, IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File("src\\BD.xml"));

            doc.getDocumentElement().normalize();
            Node nodoRaiz = doc.getDocumentElement();

            Element nuevoUsuario = doc.createElement("user");

            Element nuevoNombre = doc.createElement("nombre");
            nuevoNombre.setTextContent(nombre);

            Element nuevaContraseña = doc.createElement("contraseña");
            nuevaContraseña.setTextContent(contraseña);

            nuevoUsuario.appendChild(nuevoNombre);
            nuevoUsuario.appendChild(nuevaContraseña);

            nodoRaiz.appendChild(nuevoUsuario);
            
            TransformerFactory transFactory = TransformerFactory.newInstance();
            Transformer transformer = transFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src\\BD.xml"));
            transformer.transform(source,result);

        } catch (ParserConfigurationException | SAXException | IOException parseE) {
            System.out.println(parseE.getMessage());
        }
    }
    
    public  ArrayList<Usuarios> obtenerUsuarios(){
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File("src\\BD.xml"));
            doc.getDocumentElement().normalize();
            NodeList nodosUsuarios = doc.getElementsByTagName("user");
            
            for(int i=0;i<nodosUsuarios.getLength();i++){
                Node user = nodosUsuarios.item(i);
                if(user.getNodeType()==Node.ELEMENT_NODE){
                    Element unElemento = (Element) user;
                    
                    Usuarios objuser = new Usuarios();
                    XMLGenerator xml = new XMLGenerator();
                    objuser.setNombre(XMLGenerator.obtenerNodoValor("nombre",unElemento));
                    objuser.setContraseña(XMLGenerator.obtenerNodoValor("contraseña",unElemento));
                    listaUsuarios.add(objuser);
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }
    
    
    }
    
    


package com.jeffersmv;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jeff on 01.06.2016.
 */
public class Staff {


    public static Document document() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); //возвращает объект DBF
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder(); // возвращает объект DB
        File file = new File("src/com/jeffersmv/CompanyStaff.xml");
        Document document = documentBuilder.parse(file); //DOM выстроил все теги
        System.out.println("Staff");
//        Element element = document.getDocumentElement(); //получение корневого тега
//        String stringElement = element.getNodeName(); //Возвращает имя элемента (тега)
//        System.out.println("Корневой тег = " + stringElement);
        return document;
    }

    public static void childRoot(Document document) {
        String childRoot = "";
        int eL = document.getChildNodes().item(0).getChildNodes().getLength();
        for (int i = 1; i < eL; i++) {
            if (!((i % 2) == 0)) {
                childRoot = document.getChildNodes().item(0).getChildNodes().item(i).getNodeName();
                String id = String.valueOf(document.getChildNodes().item(0).getChildNodes().item(i).getAttributes().getNamedItem("id").getNodeValue());
                System.out.println("- # " + id + " - " + childRoot);
                childChildRoot(childRoot, document);
            }
        }
    }

    public static void childChildRoot(String childRoot, Document document) {
        NodeList nodeList = document.getElementsByTagName(childRoot).item(0).getChildNodes();
        String fullName = "";
        String date_of_Birth = "";
        String date_Recruited = "";
        String idChild = "";

        for (int i = 1; i < nodeList.getLength(); i++) {
            if (!((i % 2) == 0)) {
                Element element1 = (Element) nodeList.item(i);
                fullName = element1.getElementsByTagName("fullName").item(0).getChildNodes().item(0).getNodeValue();
                date_of_Birth = element1.getElementsByTagName("date_of_Birth").item(0).getChildNodes().item(0).getNodeValue();
                date_Recruited = element1.getElementsByTagName("date_Recruited").item(0).getChildNodes().item(0).getNodeValue();
                idChild = element1.getAttributes().getNamedItem("id").getNodeValue();

                System.out.println("# " + idChild + "     " + fullName + "     " + date_of_Birth + "      " + date_Recruited + "       " + element1.getNodeName());
            }
        }
    }
}

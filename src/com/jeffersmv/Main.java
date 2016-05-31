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

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

	// write your code here
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); //возвращает объект DBF
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder(); // возвращает объект DB
        File file = new File("src/com/jeffersmv/CompanyStaff.xml");
        Document document = documentBuilder.parse(file); //DOM выстроил все теги

        Element element = document.getDocumentElement(); //получение корневого тега
        String stringElement = element.getNodeName(); //Возвращает имя элемента (тега)
        System.out.println("stringElement = " + stringElement);


        NodeList nodeList = document.getElementsByTagName("worker");
        String fullName = "";
        String date_of_Birth = "";
        String date_Recruited = "";
        String worker = "";

        System.out.println("workers");
        System.out.println("managers");
        System.out.println("otherEmployees");
        System.out.println();
        System.out.println("Worker id = |" + "    FullName   |" + " Date Of Birth |" + " Date Recruited |");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element1 = (Element) nodeList.item(i);
            fullName = element1.getElementsByTagName("fullName").item(0).getChildNodes().item(0).getNodeValue();
            date_of_Birth = element1.getElementsByTagName("date_of_Birth").item(0).getChildNodes().item(0).getNodeValue();
            date_Recruited = element1.getElementsByTagName("date_Recruited").item(0).getChildNodes().item(0).getNodeValue();
            worker = element1.getAttributes().getNamedItem("id").getNodeValue();


            System.out.println(worker + "             "  + fullName + "     " + date_of_Birth + "      "+ date_Recruited + "       "+ element1.getNodeName());
        }






























    }
}

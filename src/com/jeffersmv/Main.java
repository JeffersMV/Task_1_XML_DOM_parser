package com.jeffersmv;

import org.w3c.dom.Document;
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
        Document document = documentBuilder.parse(new File("src/com.jeffersmv/CompanyStaff.xml")); //DOM выстроил все теги



















    }
}

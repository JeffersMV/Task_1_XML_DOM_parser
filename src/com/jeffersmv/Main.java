package com.jeffersmv;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Document document;
    public static String sortfn = "sortfn";
    public static String sortdr = "sortdr";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        document = Staff.document();
        System.out.println("  id  | " + "    FullName   |" + " Date Of Birth |" + " Date Recruited |");
        Staff.childRoot(document);
        System.out.println();
        System.out.println("------------- HELP -------------");
        System.out.println("'sortfn' - Сортировать список по ФИО");
        System.out.println("'sortdr' - Cортирвать список по Дате принятия на работу");


        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();//считываем целое число
//        byte b = in.nextByte();//считываем байтовое число
//        String c = in.nextLine();//считываем одну строку целиком
//        double d = in.nextDouble();//считываем вещественное число
//        long  e = in.nextLong();//считываем длинное целое число
//        short f = in.nextShort();//считываем короткое целое число
        String s = in.next();//считываем строку до первого пробела
        if ((sortfn == s) || (sortdr == s)) {
            Sorting sorting = new Sorting(s);
        }

    }
}





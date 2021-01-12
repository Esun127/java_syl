import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.*;



public class SAXParseXML extends DefaultHandler {
    private String tagName;


    // 开始解析XML文件(只执行一次)
    @Override
    public void startDocument() throws SAXException {
        System.out.println("SAX解析开始...");
    }

    // 解析XML文件结束(执行性一次)
    @Override
    public void endDocument() throws SAXException {
        System.out.println("SAX解析结束...");
    }

    // 开始解析XML元素(执行多此)
    // 开始标签
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("car")) {
            int id = Integer.parseInt(attributes.getValue(0));
            System.out.println(id);
        }
        this.tagName = qName;
    }

    // 结束 解析XML元素(执多次)
    // 结束标签
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("car")) {
            System.out.println("一个car标签解析完毕");
        }
        this.tagName = null;
    }

    // 在startElement, endElement之间调用多次
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(this.tagName != null) {
            String data = new String(ch, start, length); //ch[length] --> String
            if (this.tagName.equals("name")) {
                System.out.print(data + "\t");
            }
            if (this.tagName.equals("oil")) {
                System.out.print(Integer.parseInt(data) + "\t");
            }
            if (this.tagName.equals("loss")) {
                System.out.print(Integer.parseInt(data) + "\t");
            }
            if (this.tagName.equals("brand")) {
                System.out.println(data);
            }

        }
    }
    public static void main(String[] args) throws Exception {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        File inputFile = new File("/home/project/vehicles2.xml");
        SAXParseXML saxParseXML = new SAXParseXML();
        parser.parse(inputFile, saxParseXML);
    }
}

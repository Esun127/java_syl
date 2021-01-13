import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.util.ArrayList;

public class Solve {

    public static void main(String[] args) throws Exception {
        try {
            InputStream in = new FileInputStream("/home/project/University.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(in);
            Element rootElement= doc.getDocumentElement();
            NodeList nodes = rootElement.getChildNodes();
            ArrayList<Node> typeArray = new ArrayList<Node>();

            for (int i=0; i< nodes.getLength();i++) {
                if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                   typeArray.add(nodes.item(i));
                }
            }
            System.out.println("大学管理系统中共有" + typeArray.size() + "种人员类型");
            System.out.println("分别为:");
            for(Node n:typeArray){
                System.out.println("  " + n.getNodeName());
            }
            // 学生查找
            NodeList studentsNodeList = rootElement.getElementsByTagName("student");
            System.out.println("大学管理系统中共有" + studentsNodeList.getLength() + "位学生");
            printStudentInfo(studentsNodeList, "3");
            printStudentInfo(studentsNodeList, "4");


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 

    }

    public static void printStudentInfo(NodeList studentsNodeList, String ID){
            for(int i=0; i< studentsNodeList.getLength(); i++) {
                Node studentNode = studentsNodeList.item(i);
                Element studentElement = (Element) studentNode;
                if (studentElement.getAttribute("id").equals(ID)) {
                    if (studentElement.hasChildNodes()) {
                        System.out.println("id为" + ID + "的学生信息为: ");
                        NodeList nList = studentElement.getChildNodes();
                        for (int j=0; j<nList.getLength(); j++) {
                            if (nList.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element e =(Element) nList.item(j);
                                System.out.println("  " + e.getNodeName() +" : " +  e.getTextContent() + ";");
                            }

                        }
                    }
                
                }
                
            }
        }
}
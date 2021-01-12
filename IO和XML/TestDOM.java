import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;



public class TestDOM {
    public static void main(String[] args){
        try {
            // 创建解析器工厂
            DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
            // 通过解析器工厂实例获取DOM解析器
            DocumentBuilder db = dbF.newDocumentBuilder();
            // 解析指定XML文档, 得到DOM节点数
            // 本例中的vehicles.xml文件与src目录处于同一级目录
            Document doc = db.parse("vehicles.xml");
            // 获取根节点
            NodeList vehicles = doc.getChildNodes();
            System.out.println("`租车系统` 中共有" + vehicles.getLength() + "种类型的车! ");
            // 获取所有<truck>节点列表信息
            NodeList truckList = doc.getElementsByTagName("truck");
            System.out.println("`租车系统` 中共有" + truckList.getLength() + "辆卡车! ");
            // 遍历所有卡车
            for (int i=0; i<truckList.getLength(); i++){
                // 获取索引为i的卡车
                Node truck = truckList.item(i);
                // 获取卡车属性值并显示
                Element element = (Element) truck;
                String idValue = element.getAttribute("id");
                System.out.println("id为" + idValue + "的卡车信息为: ");
                // 获取索引为i的卡车详情信息并输出
                for(Node node = truck.getFirstChild(); node != null; node=node.getNextSibling()) {
                    // 根据节点类型进行判断, 显示元素节点信息, 如<oil>20<oil>
                    if (node.getNodeType() == Node.ELEMENT_NODE){
                        // 获取元素节点的节点名称(即标签名)
                        String name = node.getNodeName();
                        // 获取元素节点下第一个子节点(即文本节点)的节点值
                        String value = node.getFirstChild().getNodeValue();
                        System.out.println("  " + name + ": " + value + ";");
                    }

                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
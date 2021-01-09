import java.util.*;



public class TestHashMap{

    public static void main(String[] args){

        // 使用HashMap存储域名和含义键值对的集合
        Map domains = new HashMap();

        domains.put("com", "工商企业");
        domains.put("net", "网络服务商");
        domains.put("org", "非营利性组织");
        domains.put("edu", "教研机构");
        domains.put("gov", "政府部门");

        // 通过键值获值
        String op = (String) domains.get("edu");
        System.out.println("edu国际域名对应的含义为: " + op);

        // 判断是否包含某个键
        System.out.println("domains键值对集合中是否包含gov: " + domains.containsKey("gov"));

        //删除键值对
        domains.remove("gov");
        System.out.println("删除后集合中是否包含gov: " + domains.containsKey("gov"));

        // 输出全部键值对
        System.out.println(domains);

        // 返回键集合
        System.out.println(domains.keySet());

        // 返回值集合
        System.out.println(domains.values());

        

    }
}
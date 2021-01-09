import java.util.*;

public class TestMap2 {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        // 获取Map的全部entry对象
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 遍历entry集合
        for (Map.Entry<String,String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }
}
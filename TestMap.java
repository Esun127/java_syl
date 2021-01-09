import java.util.*;

public class TestMap {

    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        // 将Map中的key全部提取出来
        Set<String> keys = map.keySet();
        System.out.println("使用迭代器遍历: ");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            // 获取map的每个key
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + ", " + value);
        }

        System.out.println("使用增强for遍历: ");
        for (String key : keys) {
            // 根据key获取对应的value
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
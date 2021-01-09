import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestCollections {
    public static void main(String[] args){

        List list = new ArrayList();

        list.add("w");
        list.add("o");
        list.add("r");
        list.add("l");
        list.add("d");

        System.out.println("排序前:  " + list);
        System.out.println("该集合中的最大值:  " + Collections.max(list));
        System.out.println("该集合中的最小值:  " + Collections.min(list));
        Collections.sort(list);
        System.out.println("该集合中的最小值:  " + Collections.min(list));
        System.out.println("sort排序后:  " + list);

        // 使用二分查找法, 查找前必须保证被查找的集合是自然有序排列的
        System.out.println("r在集合中的索引为: " + Collections.binarySearch(list, "r"));

        Collections.shuffle(list);
        System.out.println("在shuffle排序后:   " + list );
        Collections.reverse(list);
        System.out.println("在reverse排序后:   " + list );
        Collections.swap(list, 1, 4);
        System.out.println("索引为1, 4的元素交换后:   " + list);
        Collections.replaceAll(list, "w", "d");
        System.out.println("在把w都换成d后的结果为:   " + list);
        Collections.fill(list, "s");
        System.out.println("全部填充为s后的结果为:   " + list);

        
    }
}
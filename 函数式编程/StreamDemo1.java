import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {


    public static void main(String[] args){

        // 使用集合接口Collection中的方法生成流
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("hello");
        list.add("stream");
        // stream()会以单线程的方式, 将集合中的数据转为stream类型
        Stream<String> stream1 = list.stream();
        // parallelStream() 会以多线程的并发方式, 将集合中的数据转换为Stream类型
        Stream<String> stream2 = list.parallelStream();

        // 使用数组类Arrays中的方法生成流
        String[] arr = new String[]{"hello", "stream"};
        Stream<String> stream3 = Arrays.stream(arr);

        //使用Stream接口中的方法生成流
        Stream<String> stream4 = Stream.of(arr);

        System.out.println(stream1);
        System.out.println(stream2);
        System.out.println(stream3);
        System.out.println(stream4);


        //　转换流
        // 使用filter()和limit()方法进行转换流操作

        // 先使用filter()过滤stream1中字符串长度大于2的元素
        // 然后再通过limit()方法从截取并保留两个元素
        Stream<String> stream = stream1.filter((x) -> x.length() > 2).limit(2);
        System.out.println(stream);



        //使用map方法进行转换流操作
        stream =  stream2.map(str -> str.toUpperCase());
        System.out.println(stream);
        

        // 终止流
        //reduce() 方法可以进行聚合流中的所有元素, 也就是对Stream中所有元素一次按表达式计算, 最终得出一个值
        String reduce = stream.reduce("", (a, b) -> a + b);
        System.out.println("reduce: " + reduce);

        // 统计stream2中的元素个数
        long count = stream3.count();
        System.out.println("stream3中的元素个数是: "+count);

        // 使用forEach()遍历并输出stream4中的元素
        stream4.forEach(x -> System.out.print(x + "\t"));

    }
}
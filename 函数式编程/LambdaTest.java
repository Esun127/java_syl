import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;



public class LambdaTest {
    public static void main(String[] args){
        //实例化一个对象并调用 Test() 方法

        // ### 补充代码 ###
        LambdaTest t = new LambdaTest();
        t.Test();

    }
    public void Test(){
        List<String> languages = Arrays.asList("Java","Python","C++","JavaScript","TypeScript");

        
        

        //调用Filter()方法 打印输出统计信息
        System.out.print("J开头的语言有: ");
        this.filter(languages, (x) ->  x.startsWith("J"));
        System.out.print("t结束的语言有: ");
        this.filter(languages, (x) -> x.endsWith("t"));
        System.out.print("所有语言: ");
        this.filter(languages, (x) -> x != null);
        System.out.print("名字长度大于4的语言: ");
        this.filter(languages, (x) -> x.length() > 4);

        // ### 补充代码 ###
    }
    public void filter(List<String> names ,Predicate<String> predicate){
      //遍历字符串，调用 Predicate接口的test()方法判断符合条件的语言并打印

        //    ### 补充代码 ### 
        Stream stream = names.stream();
        stream.filter(predicate).forEach((x) -> { System.out.print(x+" ");});
        System.out.println();


    }

}
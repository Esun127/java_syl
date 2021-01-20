import java.util.function.*;

public class LambdaDemo5{
    public static void main(String[] args){
        //Lambda表达式
        Function<String, Integer> func = (String arg) -> { return Integer.parseInt(arg); };

        //省略了输入参数的类型
        Function<String, Integer> func1 = (arg) -> { return Integer.parseInt(arg); };

        //省略了输入参数类型, return关键字和大括号
        Function<String, Integer> func2 = (arg) -> Integer.parseInt(arg); 

        System.out.println(func.apply("123"));
        System.out.println(func1.apply("123"));
        System.out.println(func2.apply("123"));
    }

    
}
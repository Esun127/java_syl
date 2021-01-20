import java.util.function.*;

public class LambdaDemo4 {

    public static void main(String[] args){
        Supplier<Double> rand = ()->{ return Math.random(); };
        System.out.println(rand.get());
    }
}
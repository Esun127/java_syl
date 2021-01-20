import java.util.function.*;


interface MyInterface3 {
    void method(Supplier<Double> s);
}


public class MethodRefDemo3 {
    void methodSup(MyInterface3 myi){
        myi.method(()->Math.random());
    }

    void methodSupRef(MyInterface3 myi){
        myi.method(Math::random);
    }


    public static void main(String[] args){
       
        MethodRefDemo3 md1 = new MethodRefDemo3();
        md1.methodSupRef((Supplier<Double> s) -> { System.out.println(s.get()); });

    }
}
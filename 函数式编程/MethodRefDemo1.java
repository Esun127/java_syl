import java.util.function.*;

interface MyInterface3{
    void method(Supplier<Double> s);
}


class MYI implements MyInterface3 {
    public void method(Supplier<Double> s){
         System.out.println(s.get());
    }
}
public class MethodRefDemo1 {

    // void methodSup(MyInterface3 myi) {
    //     myi.method(() -> Math.random());
    // }
    void methodSupRef(MyInterface3 myi) {
        myi.method(Math::random);
    }

    public static void main(String[] args){

        MYI myi = new MYI();
        MethodRefDemo1 mf1 = new MethodRefDemo1();
        mf1.methodSupRef(myi);
      
    }
}
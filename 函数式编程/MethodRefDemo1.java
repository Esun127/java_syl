import java.util.function.*;


interface MyInterface3 {
    void method(Supplier<Double> s);
}


public class MethodRefDemo1 {
    void methodSup(MyInterface3 myi){
        myi.method(()->Math.random());
    }

    void methodSupRef(MyInterface3 myi){
        myi.method(Math::random);
    }


    public static void main(String[] args){
        MyInterface3 myi= new MyInterface3(){
            @Override
            public void method(Supplier<Double> s)  {
                 System.out.println(s.get()); 
            }
        };

        MethodRefDemo1 md1 = new MethodRefDemo1();
        md1.methodSup(myi);
        md1.methodSupRef(myi);
        md1.methodSupRef((Supplier<Double> s) -> { System.out.println(s.get()); });

    }
}
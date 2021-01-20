import java.util.ArrayList;

interface MyInterface4 {
    boolean method(String str);
}

interface MyInterface5 {
    boolean method(String str1, String str2);
}


class School{

}

interface MyInterface6 {
    School method();
}

interface MyInterface7 {
    String[] method(Integer length);
}

public class MethodRefDemo2 {
    // 引用某个对象的实例方法
    void methodSubRef(){
        ArrayList<String> list = new ArrayList<>();
        // 对象名:: 非静态方法
        MyInterface4 myi4 = list::add;
        myi4.method("a");
        myi4.method("b");
        System.out.println(list);

    }

    // 引用类中的实例方法
    void methodSupRef2(){
        // 类名 :: 非静态方法
        MyInterface5 myi5 = String::equals;
        boolean r = myi5.method("123", "123");
        System.out.println(r);
    }

    // 引用构造器
    void methodSubRef3() {
        // 类名::new
        MyInterface6 myi6 = School::new;
    }

    // 引用数组
    void methodSupRef4() {
        // 元素类型[] :: new
        MyInterface7 myi7 = String[]::new;
        String[] arr = myi7.method(10);
        System.out.println("数组的长度是: " + arr.length);
    }

    public static void main(String[] args){
        MethodRefDemo2 mf2 = new MethodRefDemo2();
        mf2.methodSupRef4();
        mf2.methodSupRef2();
        mf2.methodSubRef();
    }

}
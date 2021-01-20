import java.util.ArrayList;


interface MyInterface4 {
    boolean method(String str);
}

interface MyInterface5 {
    boolean method(String str1, String str2);
}

class School {
    School(){
        System.out.println("构造School活像");
    }
}


interface MyInterface6 {
    School method();
}

interface MyInterface7 {
    String[] method(Integer length);
}

public class MethodRefDemo2 {

    // 引用某个对象的实例方法
    void methodSupRef() {
        ArrayList<String> list = new ArrayList<>();
        // 对象名::实例方法
        MyInterface4 myi = list::add;
        System.out.print(myi.method("a"));
        System.out.print(myi.method("b"));
        System.out.print(myi.method("c"));
        System.out.print(myi.method("d"));
        System.out.println(list);
    }

    // 应用类中实例方法啊
    void methodSupRef2(){
        // 类名::实例方法
        MyInterface5 myi = String::equals;
        boolean r = myi.method("23", "234");
        System.out.println(r);
    }

    // 应用构造方法
    void methodSupRef3(){
        // 类名::new
        MyInterface6 myi = School::new;
        myi.method();

    }

    // 应用数组构造方法
    void methodSupRef4(){
        //元素类型[]::new
        MyInterface7 myi = String[]::new;
        String[] a = myi.method(7);
        System.out.println(a.length);

    }

    public static void main(String[] args){
        MethodRefDemo2 md2 = new MethodRefDemo2();
        md2.methodSupRef();
        md2.methodSupRef2();
        md2.methodSupRef3();
        md2.methodSupRef4();
    }
}
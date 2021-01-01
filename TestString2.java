public class TestString2 {
    public static void main(String[] args) {
        String stuName1 = new String("王云");
        System.out.println(stuName1);

        //字符串的只读特性是指 在堆内存的值是只读的
        // 原变量重新赋值后, 会在堆内存中重新分配内存存放新值, 原变量修改了它的指向(引用)
        stuName1 = "刘静涛";
        System.out.println(stuName1);
    }
}
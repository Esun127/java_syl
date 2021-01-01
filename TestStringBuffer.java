public class TestStringBuffer {
    public static void main(String[] args) {


        System.out.println("创建StringBuffer对象");
        StringBuffer strB1 = new StringBuffer();

        System.out.println("new StringBuffer()创建对象的长度为: " + strB1.length());

        StringBuffer strB2 = new StringBuffer("柳海龙");
        System.out.println("new StringBuffer(\"柳海龙\")创建对象的长度为: " + strB2.length());

        System.out.println("strB2里的内容为: " + strB2);

        System.out.println("使用append方法追加字符串");
        strB2.append(", 您好! ");
        System.out.println(strB2);
        strB2.insert(3, "工程师");
        System.out.println(strB2);
    }
}
public class TestStringConcat {


    public static void main(String[] args) {

        // 使用`+`进行字符串连接
        System.out.println("使用`+`进行字符串连接");
        String s1 = "您好";
        s1 = s1 + ", 蒋老师";
        System.out.println(s1);
        System.out.println("使用public String concat(String str)方法连接");
        String s2 = "您好";
        s2.concat(", 田老师!");
        String s3 = s2.concat(", 田老师!");
        System.out.println(s2);
        System.out.println(s3);

    }
}
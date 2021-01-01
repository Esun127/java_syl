public class TestStringEquals {


    public static void main(String[] args) {

        String s1 = "Java基础";

        // s2 将从`常量池` 中 找打s1, 并且 s2 = s1
        String s2 = "Java基础";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String s3 = new String("前端技术");
        // s4开辟了新的内存空间,
        String s4 = new String("前端技术");
        System.out.println(s3 == s4);  // 因为内存空间 不同

        System.out.println(s3.equals(s4)); // 不同内存空间存放的值相等

    }
}
public class TestArrayMethod{

    public static void main(String[] args) {
        String s1 = "blue bridge";
        String s2 = "Blue Bridge";

        System.out.println(s1.charAt(1));
        System.out.println(s1.length());

        System.out.println(s1.indexOf("bridge"));
        System.out.println(s1.indexOf("Bridge"));  // 找不到返回-1

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s = "我是学生, 我在学Java!";
        String str = s.replace('我', '你');
        System.out.println(str);
    }
}
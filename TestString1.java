public class TestString1 {
    public static void main(String[] args) {
        String stuName1 = new String("王云");
        stuName1.concat("同学"); // 此处会返回新的字符串值, stuName1 指向的 字符串 仍不变.
        System.out.println(stuName1);
    }
}
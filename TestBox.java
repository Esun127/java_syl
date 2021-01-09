public class TestBox {
    public static void main(String[] args){

        Integer stuAgeI1 = 23;
        System.out.println("过年了, 年龄增长了一岁, 现在年龄是: " + (stuAgeI1 + 1));
        Integer stuAgeI2 = 23;
        System.out.println("stuAge1 == stuAgeI2(值均为23)的结果是: " + (stuAgeI1 == stuAgeI2));
        stuAgeI1 = 323;
        stuAgeI2 = 323;
        System.out.println("stuAgeI1 == stuAgeI2(值均为323)的结果是: " + (stuAgeI1 == stuAgeI2));
        System.out.println("stuAgeI1.equals(stuAgeI2)(值均为23)的结果是: " + (stuAgeI1.equals(stuAgeI2)));
    }
}
class AgeException extends Exception {
    private String message;

    public AgeException(int age){
        message = "年龄设置为: " + age + "不合理" ;
    }

    public String toString(){
        return message;
    }
}


class Person {
    private int age;

    public void setAge(int age) throws AgeException {
        if (age <= 0 || age >= 120) {
            throw new AgeException(age);
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}


public class TestEx18 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        try {
            p1.setAge(150);
            System.out.println("正在输出年龄为: " + p1.getAge());
        } catch (AgeException e) {
            // System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        try {
            p2.setAge(60);
            System.out.println("正在输出年龄为: " + p2.getAge());
        } catch(AgeException e) {
            System.out.println(e.toString());
        }
    }
}
class Student implements Comparable {

    int stuNum  = -1;
    String stuName = "";

    Student(String name, int num){
        this.stuName = name;
        this.stuNum = num;

    }

    // 返回该对象的字符串表示, 利于输出
    public String toString(){
        return "学号为: " + stuNum + "的学生, 姓名为: " + stuName; 
    }

    // 实现Comparable的compare方法
    public int compareTo(Object o){
        Student input;
        if (o instanceof Student){
            input = (Student) o;
        } else {
            // throw new NotStudentException();
            return 2;
        }
        int res = stuNum > input.stuNum ? 1 : (stuNum == input.stuNum ? 0 : -1);

        if (res == 0) {
            res = stuName.compareTo(input.stuName);
        }
        return res;
        

    }

}


class NotStudentException extends Exception {
    private String message;
    public NotStudentException(){
        message  = "不是Studnet类型,不能比较.";
    }
    
    public void printMsg(){
        System.out.println(message);
    }
}
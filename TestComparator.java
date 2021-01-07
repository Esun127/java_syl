import java.util.*;

class NameComparator implements Comparator {
    public int compare(Object op1, Object op2){
        Student eOp1 = (Student)op1;
        Student eOp2 = (Student)op2;
        return eOp1.stuName.compareTo(eOp2.stuName);

    }
}


class NumComparator implements Comparator {
    public int compare(Object op1, Object op2) {
        Student stu1 = (Student)op1;
        Student stu2 = (Student)op2;
        return stu1.stuNum - stu2.stuNum;
    }
}


public class TestComparator {
    public static void main (String[] args){
        LinkedList stuLink = new LinkedList();
        stuLink.add(new Student("王云", 1));
        stuLink.add(new Student("南天华", 2));
        stuLink.add(new Student("刘静涛", 2));
        stuLink.add(new Student("雷泽", 3));

        Collections.sort(stuLink, new NameComparator());
        System.out.println("** 按学生姓名顺序输出学生信息 **");
        Iterator it = stuLink.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(stuLink, new NumComparator());
        System.out.println("** 按学生学号顺序输出学生信息 **");
        it = stuLink.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
import java.util.Set;
import java.util.TreeSet;


class TestTreeSet2 {
    public static void main(String[] args){

        Set stuSet = new TreeSet();
        stuSet.add(new Student("王云", 1));
        stuSet.add(new Student("南天华", 3));
        stuSet.add(new Student("刘静涛", 2));
        stuSet.add(new Student("张平", 3));


        for (Object stu:stuSet) {
            System.out.println(stu);
        }
    }
}
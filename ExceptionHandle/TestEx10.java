public class TestEx10 {

    public static void main(String[] args){
        try {
        String teachers[] = {"柳海龙", "孙传杰", "孙悦"};
        for (int i=0; i<4; i++) {


            System.out.println(teachers[i]);
        }
        } catch(Exception e) {
            System.out.println("数组下标越界, 请修改程序!");
            // return; // return 不会阻断 finally语句块的执行
            System.exit(1); // 该语句会阻断finally语句块的执行
        } finally {
            System.out.println("显示完毕!");
        }

    }
}
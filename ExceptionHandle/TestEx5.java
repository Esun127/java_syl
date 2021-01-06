public class TestEx5 {

    public static void main(String[] args){

        try {
            String teachers[] = {
                "柳海龙", "孙传杰", "孙悦"
            };
            for (int i=0; i<teachers.length; i++){

                System.out.println(teachers[i]);
            }
        } catch (Exception e) {
                System.out.println("数组下标越界, 请修改程序!");
            }
            
        
        System.out.println("显示完毕!");
    }
}
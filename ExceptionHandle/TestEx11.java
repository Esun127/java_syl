public class TestEx11 {

    public static void main(String[] args){
        try {
            String teachers[] = {"柳海龙", "孙传杰", "孙悦"};
            for (int i=0; i<4; i++) {
                System.out.println(teachers[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("发生数组下标越界异常, 成功捕获!");

        } catch (RuntimeException e) {
            System.out.println("捕获到运行时异常.");
            // return; // return 不会阻断 finally语句块的执行
            System.exit(1); // 该语句会阻断finally语句块的执行
        } catch (Exception e){
            System.out.println("捕获到异常!");
        } finally {
            System.out.println("显示完毕!");
        }

    }
}
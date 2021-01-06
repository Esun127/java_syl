public class TestEx12 {

    public static void main(String[] args){

        try{
            String teachers[] = {"柳海龙", "孙传杰", "孙悦"};
            for (int i=0; i<4; i++){
                System.out.println(teachers[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("调用异常对象的 getMessage()方法: ");
            System.out.println(e.getMessage());
            System.out.println("调用异常对象的 printStackTrace()方法: ");
            e.printStackTrace();
            
        } finally {
            System.out.println("显示完毕!");
        }
    }
}
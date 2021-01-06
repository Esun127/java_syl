public class TestEx13 {
    public static void main(String[] args){
        System.out.print("now ");
        try {
            System.out.print("is ");
            throw new NullPointerException("the");
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("time. \n");
    }
}
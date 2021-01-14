public class TestNewInstance {

    public static void main(String[] args){
        try {
            Class c = Class.forName("Super2");
            Super2 sup = (Super2) c.newInstance();
            System.out.println(sup.supPublic());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
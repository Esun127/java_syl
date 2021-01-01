public class TestStringMethod2 {


    public static void main(String[] args) {

        String fileName = "20200801柳海龙Resume.docx";
        System.out.println(fileName.startsWith("2014"));
        System.out.println(fileName.endsWith("docx"));
        System.out.println(fileName.endsWith("doc"));
        System.out.println(fileName.toLowerCase());
        System.out.println(fileName.toUpperCase());
        System.out.println(fileName.substring(8));  //注意substring 是全小写的方法名
        System.out.println(fileName.substring(8, 11));
        
        String fileName2 = "20200801柳海龙Resume  .docx ";
        System.out.println(fileName2.trim());

    }
 }
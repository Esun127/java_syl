import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestListFile {

    public static void main(String[] args) throws IOException {
        File f = new File("/home/project");
        System.out.println("***使用list()方法获取String数组***");
        //返回一个String数组, 由文件名组成
        String[] fileNameList = f.list();
        for(String fileName:fileNameList){
            System.out.println(fileName);
        }
        System.out.println("***使用listFiles()方法获取File数组***");
        //返回一个File数组, 由文件对象组成
        File[] flist = f.listFiles();
        for(File ff : flist){
            System.out.println(ff.getName());
        }
        // 使用匿名内部类创建过滤器, 过滤出.java后缀的文件
        System.out.println("***使用listFiles(filter)方法进行过滤.java文件***");
        File[] partFileList = f.listFiles(new FileFilter(){
            public boolean accept(File pathName) {
                if(pathName.getName().endsWith(".java"))
                    return true;
                return false;
            }
        });
        for(File partFile:partFileList){
            System.out.println(partFile.getName());
        }
    }
}
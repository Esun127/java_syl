import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class TestCrawler {

    // 获取蓝桥网首页的html源码
    public static String getResource(){

        BufferedReader reader = null;
        StringBuffer html = new StringBuffer();
        try {
            URL url = new URL("https://www.lanqiao.cn/");
            URLConnection urlConn = url.openConnection();
            urlConn.connect();
            reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = null;
            while((line = reader.readLine()) !=null){
                html.append(line);
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(reader !=null) {
                    reader.close();
                } 
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return html.toString();
    }


    public static void main(String[] args){
        String html = getResource();
        // System.out.println("蓝桥网首页的源码如下所示: \n" + html);
        String result = parseResource(html);
        result = result == null? "爬取失败" : result;
        System.out.println("description的content值是:" + result);
    }



    public static String parseResource(String html) {
        Pattern pattern = Pattern.compile("<meta data-n-head=\"ssr\" data-hid=\"description\" name=\"description\" content=\"([^>]+?)\">");
        Matcher matcher = pattern.matcher(html);
        String result = null;

        if(matcher.find()) {
            result = matcher.group(1);
            // System.out.println(result);
            // result = result.substring(result.indexOf("content=") + "content=".length());

        }
        return result;
    }

    



}







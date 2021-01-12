import java.io.*;


public class TestData{

    static final String dataFile = "/home/project/data"; //数据存储文件
    static final int[] types = {1, 1, 2, 2};
    static final String[] names = {"战神", "跑得快", "大力士", "大力士二代"};
    static final int[] oils = {20, 40, 20, 30};
    static final int[] losss = {0, 20, 0, 30};
    static final String[] others = {"长城","红旗", "5吨", "10吨"};
    static DataOutputStream out = null;
    static DataInputStream in = null;

    public static void main(String[] args) throws IOException {
        try {
            //输出数据流, 向dataFile输出数据
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            for(int i=0; i<types.length;i++){
                out.writeInt(types[i]);
                out.writeUTF(names[i]);
                out.writeInt(oils[i]);
                out.writeInt(losss[i]);
                out.writeUTF(others[i]);
            }
        } /* catch (IOException e){
                System.out.println(e.getMessage());
        } */finally {
                if ( out != null ) {
                    out.close();
                }
        }

        try {
                int type, oil, loss;
                String name, other;
                // 输出数据流, 从dataFile读出数据
                in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
                while(true){
                    type = in.readInt();
                    name = in.readUTF();
                    oil = in.readInt();
                    loss = in.readInt();
                    other = in.readUTF();

                    if(type == 1) {
                        System.out.println("显示车辆信息: \n车型: 轿车 车辆名称为: " + name + " 品牌是: "+ other + " 油量是: " + oil + " 车损度为: " + loss);
                    } else {
                        System.out.println("显示车辆信息: \n车型: 卡车 车辆名称为: " + name + " 吨位是: "+ other + " 油量是: " + oil + " 车损度为: " + loss);
                    }
                }
        } catch(IOException e ){
                //IOException作为读取数据结束的标志
                // System.out.println(e.getMessage());
        } finally {
                if (in != null) {
                    in.close();
                }
        }
    }
 
}
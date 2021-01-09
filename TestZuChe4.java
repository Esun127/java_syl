import java.util.*;


class TestZuChe4 {

    public static void main(String[] args){

        // 使用泛型保证集合里的数据元素都是Vehicle类及其子类
        List<Vehicle> vehList = new ArrayList<Vehicle>();

        Vehicle c1 = new Car("战神", "长城");
        Vehicle c2 = new Car("跑得快", "红旗");
        Vehicle t1 = new Truck("大力士", "5吨");
        Vehicle t2 = new Truck("大力士2代", "10吨");

        vehList.add(c1);
        vehList.add(c2);
        vehList.add(t1);
        vehList.add(1, t2); // 在集合索引为1处添加元素

        System.out.println("***显示<租车系统>中全部车辆信息***");
        // 使用增强for循环遍历时, 获取的已经是Vehicle对象
        for (Vehicle obj:vehList) {
            // 从Vehicle中定义oil的默认值为20
            System.out.println(obj.getName() + "," + obj.getOil());
        }

    }
}
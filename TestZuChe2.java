import java.util.*;


class TestZuChe2 {

    public static void main(String[] args){
        // 创建HashSet集合, 用于存放车辆
        Set vehSet = new HashSet();
        Vehicle c1 = new Car("战神", "长城");
        Vehicle c2 = new Car("跑得块", "红旗");
        Vehicle t1 = new Trunk("大力士", "5吨");
        Vehicle t2 = new Trunk("大力士2代", "10吨");

        vehSet.add(c1);
        vehSet.add(c2);
        vehSet.add(t1);
        vehSet.add(t2);

        Iterator it = vehSet.iterator();
        while (it.hasNext()) {
            System.out.println("*** 显示集合中元素信息 ***");
            Object obj = it.next();
            if (obj instanceof Car){
                Car car = (Car) obj;
                System.out.println("该车是轿车, 其品牌是: " + car.getBrand());
            } else {
                Truck truck = (Truck) obj;
                System.out.println("该车是卡车, 其吨位为: " + truck.getLoad());
            }
            String name= ((Vehicle) obj).getName();
            System.out.println(name);
        }
    }
}
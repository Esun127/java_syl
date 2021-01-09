import java.util.*;

class TestZuChe2 {

    public static void main(String[] args){
        // 创建HashSet集合, 用于存放车辆
        Set vehSet = new HashSet();

        Vehicle c1 = new Car("战神", "长城");
        Vehicle c2 = new Car("跑得快", "红旗");
        Vehicle t1 = new Truck("大力士", "5吨");
        Vehicle t2 = new Truck("大力士二代", "10吨");

        vehSet.add(c1);
        vehSet.add(c2);
        vehSet.add(t1);
        vehSet.add(t2);
        //使用迭代器循环输出
        Iterator it = vehSet.iterator();
        while (it.hasNext()){
            System.out.println("****显示集合中元素信息****");
            Object obj = it.next();
            if (obj instanceof Car) {
                Car car = (Car)obj;
                // 调用Car类的特有方法getBrand()
                System.out.println("该车是轿车, 其品牌为: " + car.getBrand());

            } else {
                Truck truck = (Truck)obj;
                System.out.println("该车是卡车, 其吨位为: " + truck.getLoad());

            }
            String name = ((Vehicle)obj).getName();
            System.out.println(name);
        }
    }
}


class Vehicle {
    private String name;
    private int oil = 20;

    public Vehicle(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getOil(){
        return oil;
    }
}


class Car extends Vehicle {
    private String brand;

    public Car(String name, String brand) {
        super(name);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
}



class Truck extends Vehicle {
    private String load = "10吨";

    public Truck(String name, String load){
        super(name);
        this.load = load;
    }
    public String getLoad(){
        return load;
    }
}
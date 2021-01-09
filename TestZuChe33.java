import java.util.*;


class TestZuChe4 {

    public static void main(String[] args){
        int index = -1;
        Scanner input = new Scanner(System.in);
        // 创建ArrayList集合, 用于存放车辆
        // List vehList = new ArrayList();
        LinkedList vehList = new LinkedList();
        Vehicle c1 = new Car("战神","长城");
        Vehicle c2 = new Car("跑得快", "红旗");
        Vehicle t1 = new Truck("大力士", "5吨");
        Vehicle t2 = new Truck("大力士二代", "10吨");
        
        vehList.addLast(c1);
        vehList.addLast(c2);
        vehList.addLast(t1);
        vehList.addLast(t2);

        System.out.println("***显示(租车系统)中全部车辆***");
        index  = 1;
        for (Object obj:vehList) {
            if (obj instanceof Car) {
                Car car = (Car)obj;
                System.out.println(index + " 该车是轿车, 其车名为: " + car.getName());

           } else {
               Truck truck = (Truck)obj;
               System.out.println(index + " 该车是卡车, 其车名为: " + truck.getName());
           }
           index++;
        }
        System.out.print("请输入要显示车名的车辆编号: ");
        String name = ((Vehicle)vehList.get(input.nextInt()-1)).getName();
        System.out.println("车辆名称为: "+name);

    }
}
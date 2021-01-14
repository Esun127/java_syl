class Driver {
    String name = "驾驶员";

    public Driver(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Car car = new Car("战神", "长城");
        Driver d1 = new Driver("柳海龙");
        d1.drive(car);
    }

    // 编译时知道需要传入的参数是Vehicle类型
    public void drive(Vehicle v) {
        // 调用Vehicle类的相关方法
        v.drive();
    }
}


class Vehicle {
    String name = "车名";

    public Vehicle(String name){
        this.name = name;
    }
    public void drive(){
        System.out.print("行驶中, 车名是 " + this.name); 
    }
}

class Car extends Vehicle{
    String brand = "品牌";
    public Car(String name, String brand) {
        super(name);
        this.brand = brand;
    }
    public void drive(){
        super.drive();
        System.out.print("品牌是" + this.brand);
    }
}
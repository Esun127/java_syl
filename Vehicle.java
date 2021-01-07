import java.util.HashSet;
import java.util.Set;

public class Vehicle{

    private String name;
    private int oil;

    public Vehicle(String name, int oil){
        this.name = name;
        this.oil = oil;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getOil(){
        return oil;
    }

    public void setOil(int oil){
        this.oil = oil;
    }

    @Override
    public boolean equals(Object obj){
        // 如果当前对象和obj的内存地址相同, 则二者必然指向同一个对象, 因此返回true
        if (this == obj){
            return true;
        }
        // 如果当前对象和obj的所有属性都相同, 也认为二者的比较结果为true
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            // 用传入的obj, 和当前对象this比较
            if(this.name.equals(vehicle.getName()) && this.oil == vehicle.getOil()) {
                return true;
            }
        }
        return false;
    }

    // 用对象的所有属性值作为hashcode的计算因子
    @Override
    public int hashCode(){

        int result = 0;
        result = result * 31 + name.hashCode();
        result = result * 31 + oil;
        return result;
    }


}



class TestVehicle {
    public static void main(String[] args){
        Set set = new HashSet();
        System.out.println(set.add(new Vehicle("a", 70)));
        System.out.println(set.add(new Vehicle("b", 80)));
        System.out.println(set.add(new Vehicle("a", 70)));
    }
}
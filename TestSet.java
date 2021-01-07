import java.util.*;


public class TestSet {

	public static void main(String[] args){

		// 创建一个HashSet对象, 存放学生姓名信息
		Set nameSet = new HashSet();
		nameSet.add("王云");
		nameSet.add("刘静涛");
		nameSet.add("南天华");
		nameSet.add("雷静");
		nameSet.add("王云");

		System.out.println("再次添加哎王云是否成功: " + nameSet.add("王云"));
		System.out.println("显示集合内容: " + nameSet);
		System.out.println("集合里是否包含南天华: " + nameSet.contains("南天华"));
		System.out.println("从集合里删除\"南天华\"...");
		nameSet.remove("南天华");
		System.out.println("集合里是否包含南天华: " + nameSet.contains("南天华"));
		System.out.println("集合中的元素个数为: " + nameSet.size());
	}
}
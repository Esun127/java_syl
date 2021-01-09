import java.util.Arrays;


public class TestArrays {

    public static void output(int[] a){
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = new int[5];
        // 填充数组
        Arrays.fill(array, 8);
        System.out.println("填充数组Arrays.fill(array, 8): ");
        TestArrays.output(array);

        // 数组索引为1到4的元素赋值为6
        Arrays.fill(array, 1, 4, 6);
        System.out.println("将数组索引为1到4的元素赋值为6  Arrays.fill(array, 1, 4, 6): ");
        TestArrays.output(array);

        int[] array1 = {12, 9, 21, 43, 15, 6, 19, 77, 18};

        // 对数组索引为3到7的元素进行排序
        System.out.println("排序前, 数组的序列为: ");
        TestArrays.output(array1);
        Arrays.sort(array1, 3, 7);

        System.out.println("对数组索引为3到7的元素进行排序: Arrays.sort(array, 3, 7): ");
        TestArrays.output(array1);

        // 对数组进行自然排序
        Arrays.sort(array1);
        System.out.println("对数组进行自然排序:  Arrays.sort(array1): ");
        TestArrays.output(array1);

        // 比较数组元素是否相等
        int[] array2 = array1.clone();

        System.out.println("数组克隆后是否相等: Arrays.equals(array1, array2): " + Arrays.equals(array1, array2));

        // 使用二分查法查找元素下标, (数组必须是排好序的)
        System.out.println("77在数组中的索引: " + Arrays.binarySearch(array1, 77));


    }
}
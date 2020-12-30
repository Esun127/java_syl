class TestArray2 {
    public static void main(String[] args) {

        int engNo1 = 1001;
        int engNo2 = 1002;
        System.out.println("传递值交换数值: ");

        System.out.println("调用前工程师1, 工程师2编号为: " + engNo1 +"\t" + engNo2);

        // 值传递
        exchange1(engNo2, engNo2);

        //调用后
        System.out.println("调用后工程师1, 工程师2编号为: " + engNo1 +"\t" + engNo2);
        

        int[] engNo = new int[2];
        engNo[0] = 1001;
        engNo[1] = 1002;
        System.out.println("传递引用交换值: ");
        System.out.println("调用前工程师1, 工程师2编号为: " + engNo[0] +"\t" + engNo[1]);
        exchange2(engNo);
        System.out.println("调用后工程师1, 工程师2编号为: " + engNo[0] +"\t" + engNo[1]);

    }


    public static void exchange1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void exchange2(int[] x) {
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }
}
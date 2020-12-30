imort java.util.Scanner;

class TestArray3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int basSalary = 0;
        int hignNum = 0;
        int sumSalaries = 0;
        int[] basSalaries = new int[10];

        for (int i=1; i<=10; i++) {
            System.out.print("请输入第" + i + "个Java工程师的底薪: ");
            basSalary = input.nextInt();
            if (basSalary >= 6000) {
                hignNum++;
                sumSalaries += basSalary;

            }
            basSalaries[i-1] = basSalary;
            
        }
        System.out.println("高薪Java工程师所占比例为: " + hignNum/10.0 * 100 + "%");
        System.out.println("高薪Java工程师的平均薪资为: " + sumSalaries/hignNum);
    }


    public void addSalary(intp[] x) {
        System.out.print("请输入加薪的Jav")
    }    

    
}
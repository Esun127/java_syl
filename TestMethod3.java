import java.util.Scanner;


class TestMethod3 {
    public static void main(String[] args) {

        while(true) {
           int userSel = showMenu();
           switch(userSel) {
               case 1:
                    inputData();
                    break;
                case 2:
                    outputData();
                    break;
                case 3:
                    System.out.println("退出程序");
                    break;
                default:
                    System.out.println("输入不正确!");
                    break;
           }
           if (userSel == 3) {
               break;
           }

        }
    }

    // 该方法显示程序的主界面, 返回用户输入的功能 选择序号
    public static int showMenu() {
        System.out.println("1, 输入数据");
        System.out.println("2, 输出数据");
        System.out.println("3, 退出程序");
        System.out.print("请选择你的输入(只能输入1,2,3): ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
     
    }

    // 该方法执行 模块1, 完成输入数据 的功能
    public static void inputData() {
        System.out.println("执行1, 输入数据模块");
        System.out.println("**************************");
        System.out.println("**************************");
    }
    // 该方法执行模块2, 完成输出数据 的功能
    public static void outputData() {
        System.out.println("执行2, 输出数据模块");
        System.out.println("**************************");
        System.out.println("**************************");
    }

}
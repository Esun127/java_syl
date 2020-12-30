class TestMethod2 {
    public static void main(String[] args) {
    //输出第一个图形, 5行星
    // for (int i=0; i<6; i++) {
    //     for (int j=1; j<=i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();

        drawStar(5);
    // }       
    // 输出第二个图形, 8行星
    // for (int i=0; i<9; i++) {
    //     for (int j=1; j<=i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    drawStar(8);

    // 输出第三个图形, 12行星
    // for (int i=0; i<=12; i++) {
    //     for (int j=0; j<=i;j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
   
    drawStar(12);

    }



    public static void drawStar(int x) {
        for (int i = 1; i<=x; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
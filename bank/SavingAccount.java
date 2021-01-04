public class SavingAccount extends Account {  //子类 储蓄账户
    private  static  double interest;  //年利率，私有静态

    // ### 补充年利率的get()、set()方法以及有参构造方法 ###

    public void countInterest(){  

        // ###  计算利息并调用父类的存款方法deposit()存入账户 ###

         //利息=余额*利率
         super.deposit(this.balance * this.interest);
        //  System.out.println("您本次存款可获得利息: " + (this.balance * this.interest));



    }



    public double getInterest(){
        return this.interest;
    }

    public void setInterest(double rate) {
        interest = rate;
    }

    public SavingAccount(long id, String name, String password, double balance, double rate){
        super(id, name, password, balance);
        this.interest = rate;
    }


    public SavingAccount(long id, String name, String password, double balance){
        super(id, name, password, balance);
        this.interest = 0.0;
    }


    public SavingAccount(long id, String name, String password){
        this(id, name, password, 0.0);
    }

    public SavingAccount(long id, String name){
        this(id, name, "000000");

    }


}
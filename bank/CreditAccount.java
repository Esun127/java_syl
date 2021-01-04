public class CreditAccount extends Account {  //子类 信用账户类
    private double ceiling;  //透支额度
    private double money; //取现额度


    // ### 补充ceiling的get()、set()方法以及有参构造方法 ###



    public void purchase(double payment){    //刷卡消费
        System.out.println("您的卡号为："+this.id);
        System.out.println("刷卡消费："+payment);
        if((this.balance+this.ceiling-payment)>0){  //可以透支
            this.balance=this.balance-payment; //计算余额
            System.out.println("最终余额为："+this.balance+"\n");

        }else {
            System.out.println("超过透支额度！此次刷卡无效! \n");
        }

    }

    public void withdraw(double cash){   //重写父类的取款方法

        // ### 补充代码 ###
        //判断可以提现的条件 如果可以则调用父类的 withdraw() 方法进行取款操作，不能则提示超过透支额度或取现额度。
        if (cash >= money) {
            System.out.println("超过取现额度! 本次取现失败! \n");
            return;
        }
        if ((ceiling + balance) <= cash) {
            System.out.println("超过透支额度和余额总和,本次取现失败! \n");
            return;
        }
        super.withdraw(cash);

    }

    public double getCeiling(){
        return ceiling;
    }

    public void setCeiling(double ceiling) {
        this.ceiling = ceiling;
    }

    public double getMoney(){
        return money;
    }
    public void setMoney(double money){
        this.money = money;
    }

    public CreditAccount(long id, String name, String password){
        super(id, name, password);
        this.money = 3000.0;
        this.ceiling = 5000.0;
    }
    public CreditAccount(long id, String name, String password, double money, double ceiling){
        super(id, name, password);
        this.money = money;
        this.ceiling = ceiling;
    }
}
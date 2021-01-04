public class Account {
    long id;  //账户id
    String name;  //客户姓名
    String password="000000";  //账户密码：初始密码为“000000”
    double balance;  //账户余额

//    #### 补充属性的get()、set()方法以及有参无参的构造方法 ####

    public void deposit(double cash){  //存款
        System.out.println("======存款操作======");
        System.out.println("现存入："+cash);
        balance=this.balance+cash;    //余额自动计算
        System.out.println("现余额："+ this.balance+"\n");

    }

    public void withdraw(double cash){  //取款
        System.out.println("======取款操作======");
        System.out.println("现支出："+cash);
        balance=this.balance-cash;    //余额自动计算
        System.out.println("现余额："+ this.balance+"\n");

    }

    public void query(){  //查询
        System.out.println("======查询操作======");
        System.out.println("账号："+this.id);
        System.out.println("姓名："+ this.name);
        System.out.println("余额："+ this.balance+"\n");

    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setPassword(String password) {
        this.password  = password;
    }


    public Account(long id, String name, String password, double money){
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = money;
    }
    public Account(long id, String name, String password) {
        this(id, name, password, 0.0);
    }
    public Account(long id, String name){
        this(id, name, "000000");
        

    }
}
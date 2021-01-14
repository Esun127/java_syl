public class Sub extends Super {
    private int subPri = 11;
    int subPac = 12;
    protected double subPro = 13;
    public String subPub = "14";

    public Sub(){

    }

    public Sub(int pri, int pac, double pro, String pub){
        subPri = pri;
        subPac = pac;
        subPro = pro;
        subPub = pub;
    }

    protected Sub(int pri, int pac, double pro) {
        this(pri, pac, pro, "14");
    }

    Sub(int pri, int pac) throws Exception {
        this(pri, pac, 13.0, "14");
    }

    private Sub(int pri){
        this(pri, 12, 13.0, "14");
    }

    private void subPrivate() {
        
    }
    int subPackage() {
        return subPac;
    }

    protected double subProtected(){
        return subPro;
    
    }
    public String subPublic() {
        return subPub;
    }
}



class Super {
    private int supPri = 1;
    int supPac = 2;
    protected double supPro = 3;
    public String supPub = "4";

    public Super(){
        
    }

    public Super(int pri, int pac, double pro, String pub){
        this.supPri = pri;
        this.supPac = pac;
        this.supPro = pro;
        this.supPub = pub;
    }

    protected Super(int pri, int pac, double pro){
        this(pri, pac, pro, "4");
    }

    Super(int pri, int pac) throws Exception {
        this(pri, pac, 3.0, "4");
    }

    private Super(int pri){
        this(pri, 2, 3.0, "4");
    }

    private void supPrivate(){

    }
    int supPackage(){
        return supPac;
    }
    protected double supProtected() {
        return supPro;
    }
    public String supPublic(){
        return supPub;
    }
}
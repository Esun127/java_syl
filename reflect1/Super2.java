class Super2 {
    private int supPri = 1;
    int supPac = 2;
    protected double supPro = 3;
    public String supPub = "4";

    public Super2() {

    }

    public Super2(int pri, int pac, double pro, String pub) {
        supPri = pri;
        supPac = pac;
        supPro = pro;
        supPub = pub;
    }

    protected Super2(int pri, int pac, double pro) {
        this(pri, pac, pro, "4");
    }

    Super2(int pri, int pac) throws Exception{
        this(pri, pac, 3.0, "4");
    }

    private Super2(int pri){
        this(pri, 2, 3.0, "4");
    }

    private void supPrivate(){

    }

    int supPackage(){
        return supPac;
    }

    protected double supProtected(){
        return supPro;
    }

    public String supPublic(){
        return supPub;
    }

}
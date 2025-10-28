class Car2{
    //メンバ変数
    String auto; //メーカー名
    String name;  //車種
    double nenpi;  //燃費

    //オブジェクトの初期化
    Car2(String a,String s, double d){
        auto = a;
        name = s;
        nenpi = d;
    }
    void display(){
        System.out.println("メーカー名:" + auto);
        System.out.println("車種:" + name);
        System.out.println("燃費:" + nenpi + "km/L");
    }
}
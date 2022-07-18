package Class1;

// private , protected , public , default

    // private :- with-in the same class
    // default :- with-in the same package
    // protected :- same package , dusre package me bhi but sub class
    // public :- anywhere

public class AcessAndTypeOfInheritance {

    private int x;
    int y;
    public int z;
    protected  int w;

    public void aniket(){
        x = 10; // accessible
        y = 20 ; //accessible
        z = 20 ; // accessible
        w = 100; // accessible
    }

}

class D{
    public void aniket(){
        AcessAndTypeOfInheritance obj = new AcessAndTypeOfInheritance();
      //   obj.x =10; Not accessible
        obj.y = 20; // accessible
        obj.w = 30; // accessible
        obj.z = 40; // accessible
     }
}
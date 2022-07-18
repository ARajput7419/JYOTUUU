package Class2;

import Class1.AcessAndTypeOfInheritance;

class AccessModifierDemo {
    public void hello(){
        AcessAndTypeOfInheritance obj = new AcessAndTypeOfInheritance();
       // obj.x = 10; Error
       // obj.y=20; Error
       //  obj.w= 20; Error
        obj.z =200;


    }
}

class Temp extends  AcessAndTypeOfInheritance{

}
class Anni extends Temp{

    public void hello(){
        w = 20;
        z = 200;
         // x = 10; Error
        // y = 100; Error
    }

}

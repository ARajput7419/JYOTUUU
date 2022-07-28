package Class1;

class Parent1{
    String str = "parent";
    void display(){
        System.out.println(" Parent ");
    }
    static void hello(){
        System.out.println("Parent static function ");
    }
}
class Child1 extends  Parent1{
    String str = "child";
    void display(){
        System.out.println(" Child ");

    }

    static void hello(){
        System.out.println("Child static function ");
    }
}


public class ParentReferenceChildObject {
     public static void main(String aniket[]) {
         Parent1 parent1 = new Parent1();
         parent1.display();
         parent1.hello();
         System.out.println(parent1.str);



         Parent1 childObj = new Child1();
         childObj.display();
         childObj.hello();
         System.out.println(childObj.str);

    }
}
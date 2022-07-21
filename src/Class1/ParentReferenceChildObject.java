package Class1;

class Parent1{
    String str = "parent";
    void display(){
        System.out.println(" Parent ");
    }
}
class Child1 extends  Parent1{
    String str = "child";
    void display(){
        System.out.println(" Child ");
    }
}




public class ParentReferenceChildObject {
     public static void main(String aniket[]) {
         Parent1 obj = new Child1();
         obj.display();
         System.out.println(obj.str);

         obj = new Parent1();
         obj.display();
         System.out.println(obj.str);



    }
}

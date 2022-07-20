package Class1;

class Parent
{

    int x = 10;
    int y = 20;

    private  int aniket = 349389839;


    void print(){
        System.out.println("x : "+x+" , "+" y : "+y+" aniket : "+aniket);
    }

}

class Child extends Parent
{
    int z = 20930;
    void display(){
        System.out.println(z);
       // aniket = 7358; error
        print();
    }
}

class Inheritance {

    public static void main(String[] args) {

//        Parent parent = new Parent();
//        System.out.println(parent.x+" "+parent.y);
//        parent.print();

//        Child child = new Child();
//        System.out.println(child.z +" "+child.x+" "+child.y);
//        child.print();
//        child.display();



        Child child = new Child();
        child.display();

    }

}

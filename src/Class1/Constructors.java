package Class1;

public class Constructors {

    String name;
    String college;

    // Default Constructor
    Constructors(){
        name = "NA";
        college ="NA";
        System.out.println("Default constructor is called ");
    }

    // Parameterized Constructor
    Constructors(String n, String coll){
        System.out.println("Parameterized constructor is called ");
        name = n;
        college = coll;
    }


    public static void main(String[] args) {
        Constructors obj = new Constructors(); // default constructor call hoga
        new Constructors(); // reference is not stored but object create that we can not access aur default constructor call hoga


        System.out.println(obj.name);
        System.out.println(obj.college);

        Constructors para_cons = new Constructors("Aniket","DU");
        System.out.println(para_cons.name);
        System.out.println(para_cons.college);

    }

}

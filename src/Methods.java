public class Methods {





    static void display(int [] array){
        for (int ele:array) System.out.println(ele);
    }


    public static void main(String[] args) {


        int a [] = {1,2,3,4,5};

        System.out.println("Before Updation ....");
        // print array

        Methods obj = new Methods() ;

        obj.display(a);



        a[0]=20;
        a[4]=100;

        System.out.println("After updation ...");
        // Print array

        obj.display(a);





        System.out.println("Without mentioning the object ... ");

        // printing again

        display(a);
    }
}

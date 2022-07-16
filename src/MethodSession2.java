public class MethodSession2 {

    static void jyotuu() {
        System.out.println("Beginning of jyotuu ");
        daddyG();
        System.out.println("Ending of jyotuu ");
    }

    static void aniket() {
        System.out.println("Beginning of aniket ");
        jyotuu();
        System.out.println("Ending of aniket ");
    }

    static void daddyG() {
        System.out.println("Beginning of daddy G ");
        System.out.println("Ending of daddy G ");
    }


    static int hello(int ... aniket) {
        // int [] data = aniket;
        System.out.println("value at index 0 "+aniket[0]);

        int sum = 0;
        for (int ele : aniket)
            sum += ele;
        return sum;
    }


    public static void main(String[] args) {
//        System.out.println("Main Function starts");
//        aniket();
//        System.out.println("Main function ends");
        System.out.println(hello());
    }
}
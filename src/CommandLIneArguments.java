public class CommandLIneArguments {

    public static void main(String[] args) {
       //System.out.println(args.length);
       // int i;
        //for (i=0;i<10;System.out.println(i),i++,System.out.println("aniket hates jyotuu"));



    //for (int i = 0;i<20;i++)
      //  System.out.println(i);
        int []aniket = {10,20,30,40};


        System.out.println("Using simple for loop");

        jyotuu_aniket:
        for (int j =0;j<10;j++) {
            for (int i = 0; i < aniket.length; i++) {
                if (i == 1)
                    break jyotuu_aniket;
                else
                    System.out.println(aniket[i]);

            }
        }


        System.out.println("Using for-each  loop ");

        for (int value:aniket){
            System.out.println(value);
            value = 190;
            System.out.println(value);
        }

    }


}

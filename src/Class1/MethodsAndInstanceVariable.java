


import java.util.Scanner;



class AB{
    int x;  // instance variable
    int y;  // instance variable

    AB(int a,int b){
        x = a;
        y = b;
    }
    AB(){
        x = 10;
        y= 10;
    }


    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    void incrementX(){
        x++;

        int x = 0; // isne declare hoke instance variable ko hide kr diya kyuki naam same h
        x++; // change in local variable, not in instance variable
    }

    void decrementX(){
        x--;
    }

    void incrementY(){
        y++;
    }
    void decrementY(){
        y--;
    }


}

public class MethodsAndInstanceVariable {
    public static void main(String[] args) {

         AB ob1 = new AB();
         ob1.display();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        AB obj = new AB(x,y);
        while(true){
            System.out.println("****MENU****");
            System.out.println("1. Increment X ");
            System.out.println("2. Decrement X ");
            System.out.println("3. Increment Y ");
            System.out.println("4. Decrement Y");
            System.out.println("5. Display ");
            System.out.println("Enter your choice ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    obj.incrementX();
                    break;
                }
                case 2:{
                    obj.decrementX();
                    break;
                }
                case 3: {
                    obj.incrementY();
                    break;

                }
                case 4:{
                    obj.decrementY();
                    break;
                }
                case 5:{
                    obj.display();
                break;
                }
            }
        }
    }
}

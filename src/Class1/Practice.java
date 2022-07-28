package Class1;
class Coordinate{
    int x;
    int y;
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x =x;
    }
    void setY(int aniket){
        y = aniket;
    }
    void display(){
        System.out.println(x+" : "+y);
    }
}

class Rectangle extends Coordinate{

    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }

    Rectangle(){
        x=20;
        y=10;
    }
    int area(){
        return x*y;
    }
    int perimeter(){
        return 2*(x+y);
    }
}

class Square extends Coordinate{
    Square(int l){
        x=l;
    }
    Square(){
        x = 10;
    }

    int area(){
        return x*x;
    }
    int perimeter(){
        return 4*x;
    }
}



public class Practice {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        while(true){
            System.out.println("***MENU****");
            System.out.println("1. [Square] Set X ");
            System.out.println("2. [Square] Set Y ");
            System.out.println("3. [Square] Area ");
            System.out.println("4. [Rect/..........");

        }
    }

}

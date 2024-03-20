class Shape {
    double area(double side) {
        return side * side;
    }
}

class Rectangle extends Shape {
    double area(double length, double width) {
        return length * width;
    }

    double area(double side) {
        return side * side;
    }
}

class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        Rectangle myRectangle = new Rectangle();

        System.out.println(myShape.area(10)); 
        System.out.println(myRectangle.area(10));  
        System.out.println(myRectangle.area(10, 20));
    }
}

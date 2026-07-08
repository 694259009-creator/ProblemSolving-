void main() {
    IO.print(" Enter the base of the triangle ");
    double base = Double.parseDouble(IO.readln());

    IO.print(" Enter the height of the triangle ");
    double high = Double.parseDouble(IO.readln());

    double triangleArea = (1.0/2.0)*base *high;

    IO.println(" Area of the triangle %.2f ".formatted(triangleArea) + " square units ");

    IO.print(" Enter the length of the rectangle ");
    double side = Double.parseDouble(IO.readln());

    IO.print(" Enter the width of the rectangle ");
    double side1 = Double.parseDouble(IO.readln());

    double Squarearea = side *side1;

    IO.println(" Area of the rectangle %.2f ".formatted(Squarearea) + " square units ");
}
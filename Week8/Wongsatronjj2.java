void main() {
    IO.print(" Enter number1 : ");
    int num1 = Integer.parseInt(IO.readln());

    IO.print(" Enter number2 : ");
    int num2 = Integer.parseInt(IO.readln());

    int num3 = 0;

    IO.println(" Current -> number1 = " + num1 + " and number2 = " + num2);
    IO.println(" Swapping ................");

    num3 = num1;
    num1 = num2;
    num2 = num3;

    IO.println(" Now -> number1 = " + num1 + " and number2 = " + num2);

}
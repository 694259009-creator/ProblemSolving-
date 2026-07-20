void main() {

    IO.print(" Enter number1 : ");
    int num1 = Integer.parseInt(IO.readln());

     IO.print(" Enter number2 : ");
    int num2 = Integer.parseInt(IO.readln());

    if (num1 > num2) {
        IO.println(" total negative value = "+ (num1 - num2));
    }else {
        IO.println(" total positive value = "+ (num1 + num2));
    }
}
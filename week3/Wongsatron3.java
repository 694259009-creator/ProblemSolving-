void main() {
    IO.println(" EnterInputNumber1 ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println(" EnterInputNumber2 ");
    int num2 = Integer.parseInt(IO.readln());
    IO.println(" EnterInputNumber3 ");
    int num3 = Integer.parseInt(IO.readln());
    IO.println(" EnterInputNumber4 ");
    int num4 = Integer.parseInt(IO.readln());
    IO.println(" EnterInputNumber5 ");
    int num5 = Integer.parseInt(IO.readln());

    int sum = num1 + num2 + num3 + num4 + num5;
    float avg = sum/5;
    IO.println(sum + avg);
}
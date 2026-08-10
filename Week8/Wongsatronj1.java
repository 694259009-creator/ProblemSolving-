void main() {
    IO.print("Enter amont to price : ");
    int Productprice = Integer.parseInt(IO.readln());

    IO.print(" Enter Number of items ");
    int item = Integer.parseInt(IO.readln());

    int money = 1000;

    int Total = Productprice * item;

    if (Total <= 1000) {

        int change = money - Total;
        IO.println(" Yor  change : " + change);

        int j500b = change / 500;
        change = change % 500;

        int j100b = change / 100;
        change = change % 100;

        int j50b = change / 50;
        change = change % 50;

        int j20b = change / 20;
        change = change % 20;

        int j10b = change / 10;
        change = change % 10;

        int j5b = change / 5;
        change = change % 5;

        int j2b = change / 2;
        change = change % 2;

        int j1b = change;

        IO.println("Five-hundred note: " + j500b + " note(s)");
        IO.println("Hundred note: " + j100b + " note(s)");
        IO.println("Fifty note: " + j50b + " note(s)");
        IO.println("Twenty note: " + j20b + " note(s)");
        IO.println("Ten coin: " + j10b + " coin(s)");
        IO.println("Five coin: " + j5b + " coin(s)");
        IO.println("Two coin: " + j2b + " coin(s)");
        IO.println("One coin: " + j1b + " coin(s)");

    } else {
        IO.println(" Not enough money!! ");
    }
}

void main() {
    IO.print(" Enter the price of the product (per unit): ");
    double price = Double.parseDouble(IO.readln());

    IO.print(" Enter the quantity of the product:");
    double items = Double.parseDouble(IO.readln());

    if (items > 10) {
        IO.println(" You get a 10% discount! ");
        double discount = price * items;

        double totaldiscount = discount * 0.9;

        IO.println(" Total price : " + totaldiscount + " Baht ");

    } else {

        double total = price * items;
        IO.println(" Totalmax price " + total);

    }
}
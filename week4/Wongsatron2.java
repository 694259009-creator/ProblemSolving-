void main() {
    IO.print(" Enter Wide ");
    double wide = Double.parseDouble(IO.readln());

    IO.print(" Enter Long ");
    double longs = Double.parseDouble(IO.readln());

    double total = (wide * longs / 360);

    IO.println("BSA = %.2f".formatted(wide, longs, total));
}
void main() {
    IO.print(" Enter Fahrenhei ");
    double frh = Double.parseDouble(IO.readln());
    double celsius = (5.0 / 9.0) * (frh - 32);
    IO.println(" celsius = %.2f ".formatted(celsius));
}

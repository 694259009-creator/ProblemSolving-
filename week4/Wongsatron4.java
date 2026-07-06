void main() {
    IO.print(" Enter Salary ");
    double salary = Double.parseDouble(IO.readln());
    double tax = salary * 0.10;
    IO.println(" Tax = %.2f".formatted(tax));
}
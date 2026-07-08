void main() {
    IO.print(" Enter score 1 ");
    double num1 = Double.parseDouble(IO.readln());

    IO.print(" Enter score 2 ");
    double num2 = Double.parseDouble(IO.readln());

    IO.print(" Enter score 3 ");
    double num3 = Double.parseDouble(IO.readln());

    IO.print(" Enter Bonus points ");
    double num4 = Double.parseDouble(IO.readln());

    double Totalscore = num1 + num2 + num3;
    double Total1 = Totalscore + num4;
    double Bonuspoints = Total1 / 3;

    IO.println(" Total score = %.0f ".formatted(Totalscore) + " points ");
    IO.println(" Total With bonus = %.0f ".formatted(Total1) + " points ");
    IO.println(" Average of totalWithBonus(230) = %.2f".formatted(Bonuspoints) + " points ");
}
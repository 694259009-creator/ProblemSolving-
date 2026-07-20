void main() {
    IO.print(" Enter Salary ");
    double Salary = Double.parseDouble(IO.readln());

    IO.print(" Enter Percent ");
    double Percent = Double.parseDouble(IO.readln());

    double Deduction = Salary * Percent / 100;
    double Netsalary  = Salary - Deduction;

    IO.println(" Deduction = %.1f ".formatted(Deduction) + " baht ");
    IO.println(" Netsalary = %.1f ".formatted(Netsalary) + " baht ");
} 
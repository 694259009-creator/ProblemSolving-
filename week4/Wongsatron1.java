void main() {
    IO.print(" Enter weight ( kg ) ");
    double weight = Double.parseDouble(IO.readln());

    IO.print(" Enter height ( m ) ");
    double height = Double.parseDouble(IO.readln());

    double BMI = weight / (height * height);

    IO.println("weight = %.2f kg, height = %.2f m, BMI = %.2f".formatted(weight, height, BMI));
}
void main() {
    IO.print(" Enter Gender (M/F) : ");
    String gender = IO.readln();

    IO.print(" Enter height (cm) : ");
    double height = Double.parseDouble(IO.readln());

    IO.print(" Enter weight (kg) : ");
    double weight = Double.parseDouble(IO.readln());

    IO.print(" Enter age : ");
    int age = Integer.parseInt(IO.readln());

    double BMR;

    if (gender.equalsIgnoreCase("M")) {
        BMR = 66 + ( 13.7 * weight ) + ( 5 * height ) - ( 6.8 * age );
    } else {
        BMR = 655 + ( 9.6 * weight ) + ( 1.8 * height ) - ( 4.7 * age );
    }    
    IO.println(" BMR = %.2f ".formatted(BMR)+ " calories/day ");
}
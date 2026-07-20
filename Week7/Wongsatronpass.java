void main() {
    IO.print(" Enter your midterm score: ");
    int midterm = Integer.parseInt(IO.readln());

    IO.print(" Enter your final score: ");
    int finalz = Integer.parseInt(IO.readln());

    int total = midterm + finalz;

    if (total >= 50) {
        IO.println(" Your total score is " + total + " ." + " the result is Pass ");
    } else {
        IO.println("Your total score is " + total + " ." + " the result is Fail ");
    }
}
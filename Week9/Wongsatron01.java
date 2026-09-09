void main() {
    IO.print("Enter Your Age : ");
    int age = Integer.parseInt(IO.readln());

    String genage;

    if (age <= 0 || age > 120) {
        genage = "ไม่อยู่ในช่วงอายุ";
    } else if (age <= 9) {
        genage = "Child";
    } else if (age <= 19) {
        genage = "Teenager";
    } else if (age <= 59) {
        genage = "Adult";
    } else {
        genage = "Senior";
    }

    IO.println("Your age group is : " + genage);
}
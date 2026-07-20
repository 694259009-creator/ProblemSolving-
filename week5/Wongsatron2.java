void main() {
    IO.print(" Enter Distance ");
    double distance = Double.parseDouble(IO.readln());

    IO.print(" Enter Fuel efficiency ");
    double fueleff = Double.parseDouble(IO.readln());

    IO.print(" Enter Fuel price per liter ");
    double fuelprice = Double.parseDouble(IO.readln());

    double Fuelused = distance / fueleff;
    double Totalcost = Fuelused * fuelprice;

    IO.println(" Fuel used = " + Fuelused + " liters ");
    IO.println(" Total cost = " + Totalcost + " baht ");
}
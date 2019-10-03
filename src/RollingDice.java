import java.util.Scanner;

public class RollingDice {
    //-----------------------------------------------------------------
    // Opretter 4 Die (terning) objekter som programmet ruller flere gange
    //-----------------------------------------------------------------
    public static void main(String[] args) {

        Die die1;
        Die die2;
        Die die3;
        Die die4;

        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();

        //Intergers der holder styr på summen af terningerne der bliver slået
        int sum1;
        int sum2;

        //Integer der holder styr og opdaterer spiller 1's og 2's sum løbende i programmet
        int p1Sum = 0;
        int p2Sum = 0;



        //While loop der kører indtil spiller 1 og 2's sum er større eller lig med 40
        while (p1Sum <= 40 && p2Sum <= 40) {

            //Scanner der skal tage imod input, i dette tilfælde 'r'.
            Scanner input = new Scanner(System.in);
            System.out.println("Tryk 'r' + enter for at rulle terningerne");

            //Fortæller programmet at der nu skal skrives et input
            String roll = input.nextLine();

            //Hvis man trykker r, skal programmet forsætte
            if (roll.equals("r")) {

                //Ruller terningerne
                die1.roll();
                die2.roll();
                die3.roll();
                die4.roll();

                //Sum 1 og Sum 2 fortæller summer af henholdsvis spiller 1's og spiller 2's terninger
                sum1 = die1.getFaceValue() + die2.getFaceValue();
                sum2 = die3.getFaceValue() + die4.getFaceValue();

                // Opretter 4 intergers der skal indholde det tal der er blevet slået
                int terningTal1 = die1.getFaceValue();
                int terningTal2 = die2.getFaceValue();
                int terningTal3 = die3.getFaceValue();
                int terningTal4 = die4.getFaceValue();

                // Laver en boolean (true/false)
                boolean toEns1 = false;
                boolean toEns2 = false;


                // Tjekker om taller på terningerne er to 1'ere
                if (terningTal1 == 1 && terningTal2 == 1){
                    toEns1 = true;
                }else if (terningTal3 == 1 && terningTal4 == 1){
                    toEns2 = true;
                } else if (terningTal1 == 3 && terningTal2 == 3){
                    toEns1 = true;
                } else if (terningTal3 == 3 && terningTal4 == 3) {
                    toEns2 = true;
                } else if (terningTal1 == 5 && terningTal2 == 5){
                    toEns1 = true;
                } else if (terningTal3 == 5 && terningTal4 == 5) {
                    toEns2 = true;
                } else


                    // Hvis ikke det er to 1'ere, lægger programmet den gamle sum til den nye, som er p1Sum og p2Sum
                    p1Sum = p1Sum + sum1;
                p2Sum = p2Sum + sum2;

                System.out.println("Spiller 1: " + "Die One: " + die1 + ", Die Two: " + die2);
                System.out.println("Spiller 1 total = " + p1Sum);

                System.out.println();

                System.out.println("Spiller 2: " + "Die One: " + die3 + ", Die Two: " + die4);
                System.out.println("Spiller 2 total = " + p2Sum);

                System.out.println();

                //If statement der tjekker om spiller 1's to terninger er to 1'ere
                if (toEns1 == true  && p2Sum <= 40) {

                    //Sætter spiller 1's sum til 0
                    p1Sum = 0;
                    System.out.println("Spiller 1 starter forfra");
                    System.out.println();



                } else



                    //If statement der tjekker om spiller 2's to terninger er to 1'ere
                    if (toEns2 == true && p1Sum <= 40) {

                        //Sætter spiller 2's sum til 0
                        p2Sum = 0;
                        System.out.println("Spiller 2 starter forfra");
                        System.out.println();

                        //Hvis begge spilleres terningen rammer over 40 på samme tid er det uafjort.


                    }  else if (p2Sum >= 40 && p1Sum >= 40) {

                        System.out.println("Uafgjort!");

                    } else if (p1Sum >= 40) {
                        System.out.println("Tillykke Spiller 1 vinder");

                    } else if (p2Sum >= 40) {

                        System.out.println("Tillykke Spiller 2 vinder");
                    }

            }
        }
    }
}



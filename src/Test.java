public class Test {
    public static void main(String[] args) {
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0, face7 = 0;
        for (int i = 0; i < 1000; i++) {
            Die d = new Die();
            d.roll();
            int val = d.getFaceValue();
            switch (val) {
                case 1: face1++; break;
                case 2: face2++; break;
                case 3: face3++; break;
                case 4: face4++; break;
                case 5: face5++; break;
                case 6: face6++; break;
                case 7: face7++; break;
                default:
                    System.out.println("Der er en fejl i programmet"); break;
            }
        }
        System.out.println("Resultat af test:");
        System.out.println("Slog 1 " + face1 + " gange");
        System.out.println("Slog 2 " + face2 + " gange");
        System.out.println("Slog 3 " + face3 + " gange");
        System.out.println("Slog 4 " + face4 + " gange");
        System.out.println("Slog 5 " + face5 + " gange");
        System.out.println("Slog 6 " + face6 + " gange");
        System.out.println("Slog 7 " + face7 + " gange");
    }
}

public class Main {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("P1", 10, 120, 100, 80);
        Fighter f2 = new Fighter("P2", 20, 85, 85, 50);

        Match match = new Match(f1, f2, 80, 110);

        match.run();
    }



}

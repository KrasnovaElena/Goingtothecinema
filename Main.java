public class Main {
    /*My friend John likes to go to the cinema. He can choose between system A and system B.*/
    class Movie {
        static int movie(int card, int ticket, double perc) {
            int n = 0;
            double b = card;
            while (ticket * n <= Math.ceil(b)) {
                b += ticket * Math.pow(perc, ++n);
            }
            return n;
        }
    }
}

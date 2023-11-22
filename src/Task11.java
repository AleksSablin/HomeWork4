public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание 11");
        for (int i = 0; i <= 1000; i++) {
            String n = Integer.toString(i);
            String f = "";
            String b = "";
            String h = "";

                if(i %15 == 0 ) {
                    f = "hiss ";
                } if (i% 3 == 0) {
                   b = "fizz " ;
                } if (i%5 == 0) {
                    h = "pizz ";
                }
            System.out.println(n+f+b+h);
        }
    }
}

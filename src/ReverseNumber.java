public class ReverseNumber {
    public static void main(String[] args) {
        // remd =remander r=reverse
        int no = 2165, rem, r = 0;
        while (no != 0) {
            rem = no % 10;
            r = r * 10 + rem;
            no = no / 10;
        }
        System.out.println(r);
    }
}

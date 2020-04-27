public class OpenLockers {
    public static void main(String[] args) {
        // initialize boolean array of 100
        // loop over to open every ith locker
        // the pattern for open is i ^ 2
        // if the i ^ 2 <= 100, open it, otherwise, close it
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i += 1) {
            int squared = (int) Math.pow(i, 2);
            if ( squared <= 100) {
                lockers[squared - 1] = true;
                System.out.printf("lockers[%d] = open\n", squared);
            }
            lockers[i - 1] = false;
        }
    }
}


public class OpenLockers {
    public static void main(String[] args) {
        // initialize boolean array of 100
        // loop over to open every ith locker
        // the pattern for open is i ^ 2
        // if the i ^ 2 <= 100, open it, otherwise, close it
        boolean[] lockers = new boolean[100];

        // set all lockers to false / closed
        for (int i = 0; i < 100; i += 1) {
            lockers[i] = false;
        }

        // loop over every locker starting at 1
        for (int j = 1; j <= 100; j += 1) {
            // start at 1 before j, increment by j
            for (int k = j - 1; k < 100; k += j) {
                // toggle boolean
                lockers[k] = !lockers[k];
            }
        }

        // print the open lockers
        for (int m = 0; m < 100; m += 1) {
            if (lockers[m]) {
                System.out.printf("lockers[%d] = open\n", m + 1);
            }
        }

        // solution using squares
//        for (int i = 1; i <= 100; i += 1) {
//            int squared = (int) Math.pow(i, 2);
//            if ( squared <= 100) {
//                lockers[squared - 1] = true;
//                System.out.printf("lockers[%d] = open\n", squared);
//            }
//            lockers[i - 1] = false;
//        }
    }
}


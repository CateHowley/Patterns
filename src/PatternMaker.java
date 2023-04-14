public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        System.out.println("HI Pattern Maker");

        pattern1();
        pattern2();
        pattern3();
        pattern5();
        pattern6();
        pattern7();
    }

    public void pattern1() {
        for (int x = 0; x < 6; x++) {
            // for (int y = 0; y < 5; y++) {
            System.out.println(x * 5);

            //  }
        }
    }

    public void pattern2() {
        for (int x = 2; x < 6; x++) {
            System.out.println(x * 5);
        }
    }

    public void pattern3() {
        for (int w = 21; w > 0; w = w - 4) {
            System.out.print(w + "\t");
        }
    }

    public void pattern5() {
        for (int z = 0; z < 4; z++) {
            System.out.println();
            for (int c = 1; c < 5; c++) {
                System.out.print(c + "\t");
            }

        }
    }

    public void pattern6() {
        for (int u = 0; u < 6; u++) {
            System.out.println(1 + u);
            for (int q = 1; q < u; q++) {
                System.out.print(" ");
            }
        }
    }
    public void pattern7() {
            for (int z = 5; z > 0; z = z- 4*4) {
                System.out.print(z + "\t");
            }
}
}








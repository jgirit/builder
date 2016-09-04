

/**
 * My Builder Test Class
 * 
 * @author jgeisel
 *
 */
public class Test1 {

    /**
     * String a
     */
    private String a;
    /**
     * String b
     */
    private String b;
    /**
     * String c
     */
    private String c;
    /**
     * int d
     */
    private int d;
    /**
     * int e
     */
    private int e;
    /**
     * int f
     */
    private int f;

    // /**
    // * Simple constructor :-)
    // *
    // * @param a a
    // * @param b b
    // * @param c c
    // * @param d d
    // * @param e e
    // * @param f f
    // */
    // public Test1(String a, String b, String c, int d, int e, int f) {
    // super();
    // this.a = a;
    // this.b = b;
    // this.c = c;
    // this.d = d;
    // this.e = e;
    // this.f = f;
    // }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return a + b + c + String.valueOf(d) + String.valueOf(e) + String.valueOf(f);
    }

    // CHECKSTYLE:OFF
    public static class Builder {
        private String a;
        private String b;
        private String c;
        private int d;
        private int e;
        private int f;

        public Builder a(String a) {
            this.a = a;
            return this;
        }

        public Builder b(String b) {
            this.b = b;
            return this;
        }

        public Builder c(String c) {
            this.c = c;
            return this;
        }

        public Builder d(int d) {
            this.d = d;
            return this;
        }

        public Builder e(int e) {
            this.e = e;
            return this;
        }

        public Builder f(int f) {
            this.f = f;
            return this;
        }

        public Test1 build() {
            Test1 test1 = new Test1();
            test1.a = a;
            test1.b = b;
            test1.c = c;
            test1.d = d;
            test1.e = e;
            test1.f = f;
            return test1;
        }
    }
    // CHECKSTYLE:ON
}

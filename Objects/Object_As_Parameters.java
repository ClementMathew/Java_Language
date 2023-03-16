
// Object as Parameters

class Sub {
    int a, b;

    Sub(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Sub O) {
        if (O.a == this.a && O.b == this.b) {
            return true;
        } else {
            return false;
        }
    }
}

class Object_As_Parameters {
    public static void main(String args[]) {
        Sub s1 = new Sub(100, 22);
        Sub s2 = new Sub(100, 22);
        Sub s3 = new Sub(-1, -1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}

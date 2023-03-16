
// Static Inner Class

class Outer {
    int outer_x = 100;

    void test() {
        Nested nested = new Nested();
        nested.display();
    }

    static class Nested {
        void display() {
            Outer obj = new Outer();
            System.out.println("Display : Outer_x = " + obj.outer_x);
        }
    }
}

class Static_Nested_Class {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
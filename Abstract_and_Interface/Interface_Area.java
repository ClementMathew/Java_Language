
// Interface Familiarization

interface Area {
    final static float pi = 3.14F;

    abstract float Compute(float x, float y);
}

class Rectangle implements Area {
    public float Compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area {
    public float Compute(float x, float y) {
        return (pi * x * x);
    }
}

class Interface_Area {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of Rectangle = " + area.Compute(10, 20));
        area = cir;
        System.out.println("Area of Circle = " + area.Compute(10, 0));
    }
}

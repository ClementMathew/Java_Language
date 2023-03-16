
// Finding Area Using Class and Methods

class Area {
    int Length, Width;

    void Find(int x, int y) {
        int A;
        A = x * y;
        System.out.println("Area is " + A);
    }
}

class Area_Rectangle {
    public static void main(String args[]) {
        Area A1 = new Area();
        A1.Length = 10;
        A1.Width = 20;
        A1.Find(A1.Length, A1.Width);
    }
}
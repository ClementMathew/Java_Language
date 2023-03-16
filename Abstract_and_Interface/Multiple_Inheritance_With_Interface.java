
// Multiple Inheritance Using Interface

class Student {
    int RollNumber;

    void GetNum(int n) {
        RollNumber = n;
    }

    void PutNum() {
        System.out.println("Roll Number : " + RollNumber);
    }
}

class Test extends Student {
    float Part1, Part2;

    void GetMarks(float M1, float M2) {
        Part1 = M1;
        Part2 = M2;
    }

    void PutMarks() {
        System.out.println("Marks Obtained ");
        System.out.println("Part 1 = " + Part1);
        System.out.println("Part 2 = " + Part2);
    }
}

interface Sports {
    float SportsWt = 6.0F;

    void PutWt();
}

class Results extends Test implements Sports {
    float Total;

    public void PutWt() {
        System.out.println("SportWt = " + SportsWt);
    }

    void Display() {
        Total = Part1 + Part2 + SportsWt;
        PutNum();
        PutMarks();
        PutWt();
        System.out.println("Total score = " + Total);
    }
}

class Multiple_Inheritance_With_Interface {
    public static void main(String args[]) {
        Results Student1 = new Results();
        Student1.GetNum(1234);
        Student1.GetMarks(27.5F, 33.0F);
        Student1.Display();
    }
}

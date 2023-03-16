
/* Write a Java program to create a class for finding the reverse of a number also use
Default and Parameterised Constructors for reading data.*/

class Reverse
{
    int n,i;
    String Original,Reverse ="";

    Reverse(String x)
    {
        Original = x;
        n = Original.length();
    }

    void Reverse_1()
    {
        for(i=n-1;i>=0;i--){
            Reverse+=Original.charAt(i);
        }
        System.out.println("The reversed string is : ");
        for(i=0;i<n;i++){
            System.out.print(Reverse.charAt(i));
        }
    }
}

class Reverse_Number
{
    public static void main(String args[])
    {
        Reverse A1 = new Reverse("567");
        A1.Reverse_1();
    }
}
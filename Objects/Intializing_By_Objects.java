
// Intialization Using Objects

class Sub_Intialization
{
    int width,length,height;

    void Intialization(int w,int l,int h)
    {
        this.width = w;
        this.length = l;
        this.height = h;

        System.out.println("Width : "+ this.width);
        System.out.println("Length : "+ this.length);
        System.out.println("Height : "+ this.height);
    }
    void Intialization()
    {
        System.out.println("Width : "+ this.width);
        System.out.println("Length : "+ this.length);
        System.out.println("Height : "+ this.height);
    }
}
class Intializing_By_Objects
{
    public static void main(String args[])
    {
        System.out.println("First Object : ");
        Sub_Intialization si1 = new Sub_Intialization();
        si1.Intialization(10,20,15);
        
        System.out.println("Second Object : ");
        Sub_Intialization si2 = new Sub_Intialization();
        si2 = si1;
        si2.Intialization();
    }
}
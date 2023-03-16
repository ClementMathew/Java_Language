
// Multiple Catch Clauses Implementation

class Multiple_Catch_Clauses 
{  
    public static void main(String[] args) 
    {  
        try
        {    
            int array[] = new int[5];    
            array[5]=30/0;    
        }    
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception occurs");  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
        catch(Exception e)  
        {  
            System.out.println("Parent Exception occurs");  
        }    
    }  
}  
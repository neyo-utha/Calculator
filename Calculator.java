public class Calculator
{
    
    public Calculator(){
    
    }
    
    public void add(double num1, double num2)
    {
        
        double sum = num1 + num2;
        System.out.println("The sum is " + sum );
    }
    
    
    public void sub(double num1, double num2)
    {
        double diff = num1 - num2;
        System.out.println("The difference is " + diff);
    }
    
    public void multiply(double num1, double num2)
    {
        double prod = num1*num2;
        System.out.println("The product is " + prod);
    }
    
    public void divide(double num1, double num2)
    {
        double quotient = num1/num2;
        System.out.println("The quotient is " + quotient);
    }
    
    public void modulus(double num1, double num2)
    {
        double mod = num1/num2;
        System.out.println("The modulus is " + mod);
    }
    
}

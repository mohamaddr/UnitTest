package MohammadDergham;

import java.util.Scanner;



public class calculator 
{ 
	double solution; 
	double x; 
	double y; 
     char operators; 

    public calculator() 
    { 
        this.solution = 0; 
        Scanner operators = new Scanner(System.in); 
        Scanner operands = new Scanner(System.in); 
        this.x=x;
        this.y=y;
    } 

    
    public double setX ( double x) {
    return this.x;
    }
    public double setY(double y ) {
    	return this.y;
    }
    public double setSolution(double solution ) {
    	return this.solution;
    }
    
    public double addition(double x, double y) 
    { 
       return x + y; 
    } 
    public double subtraction(double x, double y) 
    { 
       return x - y; 
    } 
    public double multiplication(double x,  double y) 
    {     
       return x * y; 
    } 
    public double division(double x, double y) 
    { 
       solution = x / y; 
       return solution; 
    } 
    public double modulus (double x, double y ) {
    solution = x % y;
    return this.solution;
    }
    

    
    public static void main (String[] args) 
    { 
	

       

  } 
} 
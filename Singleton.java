/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/
public class Singleton{

	private static Singleton obj; 
  
    // private constructor to force use of 
    // getInstance() to create Singleton object 
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    } 
}
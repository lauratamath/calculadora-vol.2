/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */

public class Singleton{

	private static PostfixCalculator obj; 
  
    // Constructor privado forza el uso de
    // getInstance() para crear objeto singleton
    private Singleton() {} 
  
    public static PostfixCalculator getInstance(String postfix) 
    { 
        if (obj==null) 
            obj = new PostfixCalculator(postfix); 
        return obj; 
    } 
}
/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Clase que realiza operaciones tipo postfix
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

public class PostfixCalculator{
    //Atributos de clase
    private Pila<Integer> vector;
    private String postfix;

    /**
     * Método constructor
     * Inicializa los atributos
     * @param postfix  Operación postfix a realizar
     */
    public PostfixCalculator(String postfix){
        Factory<Integer> factory = new Factory<Integer>();
        this.vector = factory.getStack("V");
        this.postfix = postfix;
    }

    /**
     * Método constructor sobrecargado
     * sin parámetros
     */
    public PostfixCalculator(){
        
    }

    /**
     * Método que realiza la operación postfix
     */
    public int calcular(){
        Calculadora calculadora = new Calculadora();
        String[] valores = this.getPostfix().split(" ");
        for(int i=0; i<valores.length; i++){
            if(valores[i].equals("+") || valores[i].equals("-") || valores[i].equals("*") || valores[i].equals("/")){
                int a = vector.remove();
                int b = vector.remove();
                int c = 0;
                switch (valores[i]) {
                    case "+":
                        c = calculadora.sumar(a,b);
                        break;
                    case "-":
                        c = calculadora.restar(a,b);
                        break;
                    case "*":
                        c = calculadora.multiplicar(a,b);
                        break;
                    case "/":
                        c = calculadora.dividir(a,b);
                        break;
                    default:
                        break;
                }
                vector.add(c);
            }else{
                vector.add(Integer.parseInt(valores[i]));
            }
        }
        return vector.peek();
    }

    //Setters y getters
    public void setPostfix(String postfix){
        this.postfix = postfix;
    }

    public void setVectorS(Pila<Integer> vector){
        this.vector = vector;
    }

    public String getPostfix(){
        return this.postfix;
    }

    public Pila<Integer> getVectorS(){
        return this.vector;
    }

    //Método toString
    public String toString(){
        return "Postfix: "+this.getPostfix()+", VectorS: "+this.getVectorS().toString();
    }
}

package abstractexample;


public class AbstractExample {

   
    public static void main(String[] args) {
    
        
        //test code
        //create objects of the sub classes
        
        Burgers burg = new Burgers();
        burg.label();
        burg.eat();
        burg.cook();
        
        Pizza pizzas = new Pizza();
         
        pizzas.label();
        pizzas.eat();
        pizzas.cook();
       
        
   
    }
    
}

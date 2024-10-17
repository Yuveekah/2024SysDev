
package abstractexample;

//change the keyword public "abstract"
abstract class Food  {
    
    //implement a abstract method 
    
    abstract void eat();
    abstract void cook();
    
    //concrete method
    public void label(){
        System.out.println("The cooking class");
    }
}

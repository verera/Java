package Basic;

/**
 * DoWhileLoop
 */
public class DoWhileLoop {

    public static void main(String[] args) {
        
        int counter = 0;

        do{
            System.out.println("Counter ->" + counter);
            counter++;
        }while(counter < 10);
    }
}
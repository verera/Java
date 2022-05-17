package Basic;

/**
 * IfStatement
 */
public class IfStatement {

    public static void main(String[] args) {
        
        int time = 12;

        if(time < 10){
            System.out.println("Good Morning");
        }else if(time < 20){
            System.out.println("Good Afternoon");
        }else{
            System.out.println("Good Night");
        }
    }
}

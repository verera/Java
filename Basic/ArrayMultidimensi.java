package Basic;

/**
 * ArrayMultidimensi
 */
public class ArrayMultidimensi {

    public static void main(String[] args) {
        
        String[][] cars = {{"Alphard", "Fortuner"}, {"Pajero", "Ferrari", "Lamborghini"}};
        String toyotaSport = cars[0][1];
        System.out.println(toyotaSport);

        int[][] number = {{1,2,3,4},{5,6,7,8,9,0}};
        int seven = number[1][2];
        System.out.println(seven);
    }
}

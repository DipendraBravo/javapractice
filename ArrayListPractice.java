import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("RollsRoyce");
        cars.add("Mercedez");
        System.out.println(cars);
        //Displaying items of arraylist using for loop
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        //Displaying items of Arraylist using for each loop
        for(String a: cars){
            System.out.println(a);
        }
        
    }
}

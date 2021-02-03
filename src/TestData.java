import java.util.BitSet;
import java.util.Random;

public class TestData {
    public static String[] names = {"Муся", "Пуся", "Хвостик", "Зефирка", "Матильда", "Лапочка", "Ксюша", "Маша"};
    public static Random rand = new Random();


    public static String getRandOfArray(String[] arr) {
        int i = rand.nextInt(arr.length);
        return arr[i];
    }
public static String generateName(){
    return    getRandOfArray(names);
}

public static int generateAppetite(int n){
    return 1+rand.nextInt(n);

}

}

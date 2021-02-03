public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("в тарелке %d еды \n", food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food = food-n;

    }
    public  void addFood(int n){
      food+= n;
    }
}

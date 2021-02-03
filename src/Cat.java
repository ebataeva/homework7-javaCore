public class Cat {

    private String name;
    private int appetite;
    private boolean bellyfool;

    public Cat(){
        this.bellyfool = false;

    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.bellyfool = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            bellyfool= true;

        }
        else {

            System.out.println(name + " говорит: маловато пищи в тарелке ,я не собираюсь даже притрагиваться! при этом");

        }



    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.printf("%s имеет аппетит %d, наелось ли животное ? %b\n", name, appetite, bellyfool);


    }


}

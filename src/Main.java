/*
Расширить задачу про котов и тарелки с едой.
+Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
+Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
+Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class Main {
    public static void main(String[] args) {
        int countsOfCats = 6;
        Cat[] cat = new Cat[countsOfCats];
        Plate plate = new Plate(15);
        plate.info();
        for (int i = 0; i < countsOfCats; i++) {
            cat[i] = new Cat(TestData.generateName(), TestData.generateAppetite(countsOfCats));

        }

        for(Cat c :cat){
            c.eat(plate);
            c.info();
            plate.info();
        }

    }
}
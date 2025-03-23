package rocks.zipcodewilmington;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;

public class CatHouse {
    private static AnimalWarehouse <rocks.zipcodewilmington.animals.Cat> catHouse = new AnimalWarehouse<>();
public static void add(Cat cat) {
    catHouse.add(cat);
}
    public static void remove (Integer id) {
    catHouse.removeAnimalById(id);
}

    public static void remove(Cat cat) {
    catHouse.removeAnimal((Animal) cat);
}
    public static rocks.zipcodewilmington.animals.Cat getCatById(Integer id) {
    return catHouse.getAnimalById(id);
    }
    public static Integer getNumberOfCats() {
    return catHouse.getNumberOfAnimals();
    }
    public static void clear (){
    catHouse.clear();
    }










}

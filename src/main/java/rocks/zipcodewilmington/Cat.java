package rocks.zipcodewilmington;

public class Cat {
    private String catName;
    private int birthDate;
 private int ID;
    public Cat(String catName, int birthDate, int ID) {
        this.catName = catName;
        this.birthDate = birthDate;
        this.ID = ID;

    }

    public Cat() {
    }

    public String getCatName() {
        return catName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getID() {
        return ID;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void ID(int ID) {
        this.ID = ID;
    }


}






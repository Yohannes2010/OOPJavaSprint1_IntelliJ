package ooj.sprint1.demos.interfaces;

public class Teacher extends Person implements IPartyAnimal{
    
    public Teacher(String namn){
        super(namn);
    }
    
    public String getFavoriteSnack() {
        return "Kale chips";
    }


    public String getFavouriteDrink() {
        return "Green tea";
    }
}
package factoryPattern;

public class Dog implements Pet {
    private String breed;
    private Integer noOflives;


    public Integer getNoOfLives() {
        return noOflives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOflives = noOfLives;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }
}

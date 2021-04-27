package MyAssignment.After;

public abstract class Beverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addIngredient();
    }

    void boilWater () {
        System.out.println("Water is bolling!");
    }

    void pourInCup(){
        System.out.println("Pouring in Cup!");
    }

    abstract void brew();
    abstract void addIngredient();

}

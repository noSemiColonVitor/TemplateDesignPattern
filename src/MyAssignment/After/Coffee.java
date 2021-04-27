package MyAssignment.After;

public class Coffee extends Beverage{
    @Override
    void brew() {
        System.out.println("Coffee is brewing!");
    }

    @Override
    void addIngredient() {
        System.out.println("Adding sugar!");
    }
}

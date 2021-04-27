package MyAssignment.After;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("Tea is brewing!");
    }

    @Override
    void addIngredient() {
        System.out.println("Adding lemon!");
    }
}

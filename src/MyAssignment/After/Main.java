package MyAssignment.After;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        // Skip line
        System.out.println();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}

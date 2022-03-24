package src;//Customers can make food and drink orders from a limited menu
// waiters and customers will both need a method to order food


public class Menu {

    private int id;
    private Food food;
    private Drink drink;


    public Menu(Food food, Drink drink) {


        this.food = food;
        this.drink = drink;
    }

    //add to database menu list
    public Menu addMenu(Food food, Drink drink)
    {
        Menu menu =  new Menu(food,drink);


        return menu;

    }



}

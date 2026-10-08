

import java.util.Scanner;

public class ordersystem {
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);
        char again = 'y';
        double GrandTotal = 0;

        do {
            // Declare only what you need
            double mealPrice = 0;
            double drinkPrice = 0;
            String mealName = "";
            String sizeName = "";
            String drinkName = "";
            int MealQuantity;
            int DrinkQuantity;

            System.out.println("======================");
            System.out.println("Jollibee Order System");
            System.out.println("======================");
            System.out.println("== Type of Order ==");
            System.out.println("[1] Dine in");
            System.out.println("[2] Take out");
            System.out.println("----------------------");
            System.out.print("Enter your choice: ");
            int TypeOfOrder = robot.nextInt();

            // Meals// Meals
System.out.println("\n====== Menu ======");
System.out.println("== HAPPY MEAL ==");
System.out.println("[1] Spaghetti        (69)");
System.out.println("[2] Yum Burger       (42)");
System.out.println("[3] Fries            (50)");
System.out.println("[4] Peach Mango Pie  (55)");
System.out.println("[5] Burger Steak     (69)");
System.out.println("[6] Jolly Hotdog     (55)");
System.out.println("-------------------------");
System.out.print("Enter your choice: ");
int HappyMeal = robot.nextInt();

switch (HappyMeal) {
    case 1:
        mealName = "Spaghetti";
        mealPrice = 69;
        break;

    case 2:
        mealName = "Yum Burger";
        mealPrice = 42;
        break;

    case 3:
        mealName = "Fries";
        mealPrice = 50;
        break;

    case 4:
        mealName = "Peach Mango Pie";
        mealPrice = 55;
        break;

    case 5:
        mealName = "Burger Steak";
        mealPrice = 69;
        break;

    case 6:
        mealName = "Jolly Hotdog";
        mealPrice = 55;
        break;

    default:
        System.out.println("Invalid meal!");
        continue;
}

System.out.print("Enter meal quantity: ");
MealQuantity = robot.nextInt();
            // Drinks size
            System.out.println("\n== DRINKS ==");
            System.out.println(" ");
            System.out.println("== Size of Drinks ==");
            System.out.println("[1] Regular (+25)");
            System.out.println("[2] Medium   (+35)");
            System.out.println("[3] Large    (+45)");
            System.out.println("------------------------");
            System.out.print("Enter size: ");
            int SizeOfDrinks = robot.nextInt();

            switch (SizeOfDrinks) {
                case 1: sizeName = "Regular"; drinkPrice += 25; break;
                case 2: sizeName = "Medium"; drinkPrice += 35; break;
                case 3: sizeName = "Large";  drinkPrice += 45; break;
                default: sizeName = "Unknown"; break;
            }

            // Drinks type
            System.out.println("\n== TYPE OF DRINKS ==");
            System.out.println("[1] Coke         (25)");
            System.out.println("[2] Ice tea      (25)");
            System.out.println("[3] Sprite       (25)");
            System.out.println("[4] Mountain Dew (25)");
            System.out.println("[5] Coke Float   (40)");
            System.out.println("------------------------");
            System.out.print("Enter your choice: ");
            int TypeOfDrinks = robot.nextInt();
            System.out.print("Enter drink quantity: ");
            DrinkQuantity = robot.nextInt();

            switch (TypeOfDrinks) {
                case 1: drinkName = "Coke"; drinkPrice += 25; break;
                case 2: drinkName = "Ice Tea"; drinkPrice += 25; break;
                case 3: drinkName = "Sprite"; drinkPrice += 25; break;
                case 4: drinkName = "Mountain Dew"; drinkPrice += 25; break;
                case 5: drinkName = "Coke Float"; drinkPrice += 40; break;
                default: System.out.println("Invalid drink!"); break;
            }

            // Computations
            double mealTotal = mealPrice * MealQuantity;
            double drinkTotal = drinkPrice * DrinkQuantity;
            double subTotal = mealTotal + drinkTotal;

            double discount = 0;
            if (subTotal >= 200) {
                discount = subTotal * 0.10; // 10% discount
            }

            double total = subTotal - discount;
            GrandTotal += total;

            // Receipt
            System.out.println("\n=========== RECEIPT ===========");
            System.out.println("Order Type : " + (TypeOfOrder == 1 ? "Dine In" : "Take Out"));
            System.out.println("\nMeal       : " + mealName);
            System.out.println("Meal Qty   : " + MealQuantity);
            System.out.println("Meal Total : " + mealTotal);

            System.out.println("\nDrink      : " + drinkName);
            System.out.println("Size       : " + sizeName);
            System.out.println("Drink Qty  : " + DrinkQuantity);
            System.out.println("Drink Total: " + drinkTotal);

            System.out.println("--------------------------------");
            System.out.println("Subtotal   : " + subTotal);
            System.out.println("Discount   : " + discount);
            System.out.println("GrandTotal : " + GrandTotal);
            System.out.println(" ");          
            System.out.println("================================");
            System.out.println("Thank you, Enjoy your meal!!!");
            System.out.print("\nOrder again? (Yes/No): ");
            again = robot.next().charAt(0);

        } while (again == 'Y' || again == 'y');
    
      robot.close();
    }
}
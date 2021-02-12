/* Name: Cole Ternes
 * ID: 2323955
 * Description: Creates some pipin' hot pizzas
 */
import java.util.Scanner;

public class Pizza {
  //Member Variables
  private String m_size; //Small, Medium, Large
  private int m_number_of_cheese_tops;
  private int m_number_of_pepperoni_tops;
  private int m_number_of_ham_tops;

  //Default Constructor
  public Pizza() {
    m_size = " ";
    m_number_of_cheese_tops = 0;
    m_number_of_pepperoni_tops = 0;
    m_number_of_ham_tops = 0;
  }

  //Overloaded Constructor
  public Pizza(String size, int cheese, int pepperoni, int ham) {
    m_size = size;
    m_number_of_cheese_tops = cheese;
    m_number_of_pepperoni_tops = pepperoni;
    m_number_of_ham_tops = ham;
  }

  //Mutators & Accessors
  public String getSize() {
    return m_size;
  }
  public void setSize(String size) {
    m_size = size;
  }

  public int getCheese() {
    return m_number_of_cheese_tops;
  }
  public void setCheese(int cheese) {
    m_number_of_cheese_tops = cheese;
  }

  public int getPepperoni() {
    return m_number_of_pepperoni_tops;
  }
  public void setPepperoni(int pepperoni) {
    m_number_of_pepperoni_tops = pepperoni;
  }

  public int getHam() {
    return m_number_of_ham_tops;
  }
  public void setHam(int ham) {
    m_number_of_ham_tops = ham;
  }

  //Other Methods
  public double calcCost() {
    double cost = 0.0;
    if (m_size.equalsIgnoreCase("small")) {
      cost = 10 + (2 * m_number_of_cheese_tops) + (2 * m_number_of_pepperoni_tops) + (2 * m_number_of_ham_tops);
    } else if (m_size.equalsIgnoreCase("medium")) {
      cost = 12 + (2 * m_number_of_cheese_tops) + (2 * m_number_of_pepperoni_tops) + (2 * m_number_of_ham_tops);
    } else if (m_size.equalsIgnoreCase("large")) {
      cost = 14 + (2 * m_number_of_cheese_tops) + (2 * m_number_of_pepperoni_tops) + (2 * m_number_of_ham_tops);
    }
    return cost;
  }

  public String getDescription() {
    double cost = calcCost();
    String desc = "Size: " + m_size + "\nNumber of Cheese Toppings: " + m_number_of_cheese_tops + "\nNumber of Pepperoni Toppings: " + m_number_of_pepperoni_tops + "\nNumber of Ham Toppings: " + m_number_of_ham_tops + "\nCost: $" + cost +"0";
    return desc;
  }

  //Main Method
  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);

    //Creates instances of Pizza
    Pizza p1 = new Pizza();
    String p1_desc = " ";
    Pizza p2 = new Pizza("Large", 1, 1, 2);
    String p2_desc = " ";
    Pizza p3 = new Pizza("Small", 1, 1, 0);
    String p3_desc = " ";

    //Utilizes the mutator methods
    System.out.println("Enter a size for your pizza (Small, Medium, Large): ");
    String s = sin.nextLine();
    p1.setSize(s);
    System.out.println("Enter the number of cheese toppings: ");
    int c = sin.nextInt();
    p1.setCheese(c);
    System.out.println("Enter the number of pepperoni toppings: ");
    int p = sin.nextInt();
    p1.setPepperoni(p);
    System.out.println("Enter the number of ham toppings: ");
    int h = sin.nextInt();
    p1.setHam(h);

    //Spacing
    System.out.println("\n\nYour pizza description:");

    //Prints the description of the user's pizza
    p1_desc = p1.getDescription();
    System.out.println(p1_desc + "\n");

    //Spacing
    System.out.println("Press 'ENTER' to continue.");
    String response = sin.nextLine();
    response = sin.nextLine();
    System.out.println("More pizzas.\n");

    //Prints the description of example pizzas
    p2_desc = p2.getDescription();
    System.out.println(p2_desc + "\n");
    p3_desc = p3.getDescription();
    System.out.println(p3_desc);
  }
}

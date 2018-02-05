
public class Main {

    public static void main(String[] args) {
        
        Orange o1 = new Orange();
        Apple  a1 = new Apple();
        
        System.out.println("Total cost is: $" + 3*o1.cost() + 2*a1.cost() + ". Cash or credit?");
        
        
        
        double totalCost = calcCost(3,o1,2,a1);
        System.out.println("Total cost is: $" + totalCost + ". BArter?");
        
    }
    
    public static double calcCost(int n1, Costable a1, int n2, Costable a2 ) {
        
        return n1*a1.cost() + n2*a2.cost();
        
    }
    
    
}

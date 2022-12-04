import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    
    public int getStreakGoal(){
        int[] myWeeks = {1,2,3,4,5,6,7,8,9,10};
        int totalWeeks = 0;
        for (int i=0; i < myWeeks.length; i++){
            totalWeeks += myWeeks[i];
        }
        return totalWeeks;
    }

    public double getOrderTotal(double[] prices){
        double orderTotal = 0.0;
        for (int i= 0; i<prices.length; i++){
            orderTotal+= prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems){
            System.out.println(menuItems);
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello "+userName);
        for (Integer i = 0; i<customers.size(); i++){
            System.out.println("There are "+ i +" people in front of you.");
        }
        

    }
}
public class PizzaBillingSystem {
    import java.util.Scanner;

    public class PizzaBillingSystem {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            // Selection:
            System.out.println("Select Pizza size: (small:100, medium:200, large:300)");
            String size = input.nextLine().toLowerCase();
            while(!size.equals("small") && !size.equals("medium") && !size.equals("large")){
                System.out.println("Invalid size! Enter again: ");
                size = input.nextLine().toLowerCase();
            }
            int basePrice = 0;
            // for base price
            switch(size){
                case "small":
                    basePrice = 100;
                    break;
                case "medium":
                    basePrice = 200;
                    break;
                case "large":
                    basePrice = 300;
                    break;

            }
            // Checking Pepproni Need:

            System.out.println("Want to add pepperoni ? (Yes/No)");
            String pepp = input.nextLine().toLowerCase();
            while(!pepp.equals("yes") && !pepp.equals("no")){
                System.out.println("Invalid size! Enter again: ");
                pepp = input.nextLine().toLowerCase();
            }
            boolean addPepp = pepp.equalsIgnoreCase("yes");
            if(addPepp){
                if(size.equalsIgnoreCase("small")){
                    basePrice = basePrice + 30;
                }else {
                    basePrice = basePrice + 50;
                }
            }
            // Checking Cheese Need:
            System.out.println("Want to add cheese? (Yes/No)");
            String cheese = input.nextLine();
            while(!cheese.equals("yes") && !cheese.equals("no")){
                System.out.println("Invalid size! Enter again: ");
                cheese = input.nextLine().toLowerCase();
            }
            boolean addCheese = cheese.equalsIgnoreCase("yes");
            if(addCheese){
                basePrice = basePrice + 20;
            }

            System.out.println("Your Pizza size: "+size);
            System.out.println("Do you want Pepproni? "+pepp);
            System.out.println("Do you want Cheese? "+cheese);
            System.out.println("Total Price: "+basePrice);

}
    }
}

import java.util.*;

/*
 The lottery system produces results consisting of 4 digits + 1 letter, e.g., 0345F. Develop a lottery ticket purchase system with the following features:
Users can choose from the following tickets:
5678B,9876C,2345D,6789E,3456F,8765G,4321H,7890J,5432K,2109L,8765M,1357N,2468P,6543Q,7891R,3579S,9821T,4682U,5763V,1234A
-Users can buy a minimum of 1 and a maximum of 2 tickets.
-Payment is accepted in cash, and each ticket costs 1 USD.
-After choosing tickets and quantity, the system prompts the user to pay in cash or by bank card.
-This system only accepts 1 USD and 5 USD bills. The user must choose the bill to use for payment, and the system should return the change if applicable.
-After payment, the ticket is issued.
-The user returns to the main menu to play the lottery.
-The lottery system generates 1 random ticket code.
*/
public class Main {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static Ticket tickets = new Ticket(); // Creación de un objeto Ticket
    private static HashMap<Integer, String> ticketLottery = tickets.getTicketOptions();
    private static int keySelected;

    public static void main(String[] args) {
        int menuOption;
        int subMenuOption;

        while(true){
            menuOption = mainMenu();

            switch (menuOption){
                case 0 ->{
                    selectTickets(ticketLottery);
                    subMenuOption = subMenu();
                    while (true){
                        switch (subMenuOption){
                            case 0 ->{

                            }

                        }
                    }

                }
                case 1->{
                    System.out.println("Have a nice day!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("That's not an option, try again");

                }
            }
        }




        /*System.out.println("Here you have the list of the tickets you can buy, press from 1 to 20 to buy it");

        // Imprimimos el Hashmap
        for(Map.Entry<Integer, String> entry : ticketLottery.entrySet()) {
            System.out.println("Ticket" + entry.getKey() + ": " + entry.getValue());

        }
        int keyTicket = scanner.nextInt();
        System.out.println("The ticket you bought is" + ticketLottery.get(keyTicket) + "Do you want to buy another one?");
        System.out.println("0: No");
        System.out.println("1 Yes");
        int subMenuChoice = scanner.nextInt();


        ticketLottery.remove(keyTicket);*/
    }
    private static int mainMenu(){
        System.out.println("Welcome to the Man U lottery system, you are allowed to buy maximum 2 tickets.");
        System.out.println("What do you want to do?");
        System.out.println("0 Buy a ticket");
        System.out.println("1 Leave");

        return scanner.nextInt();
    }
    private static int subMenu(){
        System.out.println("Now that you bought a ticket, do you want to play lottery or buy another one?");
        System.out.println("0 Buy another ticket");
        System.out.println("1 Play Lottery");
        return scanner.nextInt();
    }
    public static void selectTickets(HashMap<Integer, String> ticketLottery) {
        System.out.println("Here you have the list of the tickets you can buy, press from 1 to 20 to buy it");
        for (Map.Entry<Integer, String> entry : ticketLottery.entrySet()) {
            System.out.println("Ticket " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Type from 1 to 20 to select the ticket you want to buy");
        keySelected =scanner.nextInt();
        System.out.println("The ticket you bought is: "+ ticketLottery.get(keySelected));
    }
    public static void selectTickets2(HashMap<Integer, String> ticketLottery) {
        ticketLottery.remove(keySelected);
        System.out.println("Here you have the list of the tickets you can buy, press from 1 to 19 to buy it");
        for (Map.Entry<Integer, String> entry : ticketLottery.entrySet()) {
            System.out.println("Ticket " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Type from 1 to 20 to select the ticket you want to buy");
        int KeySelected =scanner.nextInt();
        System.out.println("The ticket you bought is: "+ ticketLottery.get(KeySelected));
    }

}

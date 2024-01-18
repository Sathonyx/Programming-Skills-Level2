import java.util.*;

public class Ticket {

    HashMap<Integer,String> ticketOptions= new HashMap<>();
    String[] ticketPool = {"5678B","9876C","2345D","6789E","3456F","8765G","4321H","7890J","5432K","2109L","8765M","1357N","2468P","6543Q","7891R","3579S","9821T","4682U","5763V","1234A"};
    int keyValue = 0;

    public Ticket() {
        for(String ticket: ticketPool){
            keyValue++;
            ticketOptions.put(keyValue,ticket);
            //Creamos el hashmap con la iteracion.

        }

    }
}

package academy.devdojo.javacore.ZZHpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {

    private String name;
    public final Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public Aircraft() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}

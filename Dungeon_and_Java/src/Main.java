import Enginee.Table;
import Races.Humanoid;
import Races.People;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<People> party = new ArrayList<>();
        Humanoid.Draw n1 = new Humanoid.Draw("Giorgio", 300, "giullare");
        Humanoid.Elf e1 = new Humanoid.Elf("Marco", 150, "filososfo", "estate");
        Humanoid.Human u1 = new Humanoid.Human("Giovanni", 20, "nobile");
        party.add(n1);


        Table scac = new Table(5, 5);
        scac.Iniz();

        int approve = 0;
        while(approve == 0)
            approve = scac.Agg(party.get(0), 2, 2);

        scac.printScac();

    }
}

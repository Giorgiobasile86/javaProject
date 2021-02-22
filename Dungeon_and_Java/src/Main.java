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
        party.add(e1);


        int i = 1;
        while(party.get(0).getLife() > 0 && party.get(1).getLife() > 0){
            System.out.println("\nround " + i);
            party.get(0).atk(party.get(1));
            party.get(0).perry();
            System.out.println("vita elfo:" + e1.getLife());
            party.get(1).atk(party.get(0));
            System.out.println("vita nano:" + n1.getLife());
            i++;
        }

        /*able scac = new Table(5, 5);
        scac.Iniz();

        int approve = 0;
        while(approve == 0)
            approve = scac.Agg(party.get(0), 2, 2);

        scac.printScac();
        */
    }
}

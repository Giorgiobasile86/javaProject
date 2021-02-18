package Races;

public class Humanoid extends People{

    public Humanoid(String name, int age, String origini, char indicator) {
        super(name, age, origini, indicator);
    }

    public static class Human extends Humanoid{
        public Human(String name, int age, String origini) {
            super(name, age, origini, 'U');
        }
    }

    public static class Draw extends Humanoid{
        private String casata;

        public Draw(String name, int age, String origini) {
            super(name, age, origini, 'D');
            this.casata = "orfano";
        }
        public Draw(String name, int age,String origini, String casata) {
            super(name, age, origini, 'D');
            this.casata = casata;
        }

        public void attack(){}
    }

    public static class Elf extends Humanoid{
        String stagione;

        public Elf(String name, int age,String origini, String stagione) {
            super(name, age, origini, 'D');
            this.stagione = stagione;
        }
    }

}

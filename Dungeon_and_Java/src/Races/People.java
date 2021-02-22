package Races;

interface azioni{
    abstract public void atk(People target);
    abstract public void perry();
}

public class People implements azioni{
    private char indicator;
    private String name;
    private int age;
    String origini;
    private int status;
    private int life;

    public People(String name, int age, String origini, char indicator){
        this.name = name;
        this.age = age;
        this.origini = origini;
        this.indicator = indicator;
        this.status = 0;
        this.life = 10;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public char getIndicator() {
        return indicator;
    }

    @Override
    public void atk(People target) {

        if(target.status == 0){
            target.life -= 2;
        }else if(target.status == 2){
            target.life -= 1;
        }
    }

    @Override
    public void perry() {
        status = 2;
    }
}



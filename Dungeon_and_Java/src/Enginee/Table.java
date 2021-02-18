package Enginee;

import Races.People;

public class Table {
    private int dim1;
    private int dim2;
    Casella[][] scac;

    public Table(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
        scac = new Casella[dim1][dim2];
    }

    public void Iniz(){
        for(int i = 0; i < dim1; i++)
            for(int j = 0; j < dim2; j++)
                scac[i][j] = new Casella(0);
    }

    public int Agg(People p, int r, int c){
        if(r >= dim1 || r < 0){
            System.out.println("error baound");
            return 0;
        }
        if(r >= dim1 || r < 0){
            System.out.println("error baound");
            return 0;
        }
        scac[r][c].stato = 1;
        scac[r][c].find = p;
        return 1;
    }

    public void printScac(){
        for(int i = 0; i < dim1; i++){
            for(int j = 0; j < dim2; j++){
                if(scac[i][j].stato == 0)
                    System.out.print(scac[i][j].stato + " ");
                else
                    System.out.print(scac[i][j].find.getIndicator() + " ");
            }
            System.out.print("\n");
        }
    }

    public static class Casella{
        private int stato;
        People find;

        public Casella(int stato){
            this.stato = stato;
        }
    }

}

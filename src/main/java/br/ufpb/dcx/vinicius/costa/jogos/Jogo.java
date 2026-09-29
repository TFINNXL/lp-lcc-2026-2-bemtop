package br.ufpb.dcx.vinicius.costa.jogos;

public class Jogo {
    private String nomeTime1;
    private String nomeTime2;
    private int numGolsTime1;
    private int numGolsTime2;



    public Jogo (String nomeTime1 , String nomeTime2 , int numGolsTime1 ,int numGolsTime2 ){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }
    public Jogo (){
        this.nomeTime1 = "";
        this.nomeTime2 = "";
        this.numGolsTime1 = 0;
        this.numGolsTime2 = 0;
    }

    public String getNomeTime1(){
        return this.nomeTime1;

    }



    public String getNomeTime2(){
        return this.nomeTime2;

    }



    public void setNomeTime1(String nomeTime1){
        this.nomeTime1 = nomeTime1;


    }



    public void setNomeTime2(String nomeTime2){
        this.nomeTime2 = nomeTime2;
}

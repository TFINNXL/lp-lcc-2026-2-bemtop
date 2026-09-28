package br.ufpb.dcx.vinicius.costa.lp;

import javax.swing.JOptionPane;
public class calcIMC {
    public static void main(String[] args){
        String pesostr = JOptionPane.showInputDialog("Qual seu Peso?");
        double peso = Double.parseDouble(pesostr);
        String alturastr = JOptionPane.showInputDialog("Qual sua Altura?");
        double altura = Double.parseDouble(alturastr);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é " + imc);

    }
}

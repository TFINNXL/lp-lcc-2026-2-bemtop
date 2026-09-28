package br.ufpb.dcx.vinicius.costa.lp;

import javax.swing.JOptionPane;
public class cidadeNome {
    public static void main(String[] args){
        String nomeMlk = JOptionPane.showInputDialog("Digite seu Nome");
        String cidadeMlk = JOptionPane.showInputDialog("Digite sua Cidade");
        JOptionPane.showMessageDialog(null, "Oi " + nomeMlk + "! Que legal saber que você é da cidade "+ cidadeMlk );




    }

}

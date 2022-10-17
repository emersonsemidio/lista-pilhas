package QuestãoUm;

import java.util.Scanner;

public class PilhasQuestaoUm {
    Scanner scan = new Scanner(System.in);

    public String LerString() {
        String s;

        System.out.println("Digite a String:");
        s = scan.nextLine();


        return s;
    }


    public Boolean verificarStrings(String x, String y){
        if(x.length() != y.length()){
            System.out.println("As strings têm tamanhos diferentes");
            return false;
        } else{

            int i = 0;

            while(i <= x.length()-1){
                if((x.charAt(i) != 'A' && x.charAt(i) != 'B') || (y.charAt(i) != 'A' && y.charAt(i) != 'B')){
                    System.out.println("Alguma das strings não está no formato");
                    return false;
                }

                i++;
            }
        }
        return true;
    }


    public Boolean comparaStrings(String x, String y){

        int i = 0, j = y.length() - 1;

        while(j >= 0){
            if(x.charAt(i) != y.charAt(j)){
                System.out.println("Y não é o inverso de X");

                return false;
            }
            i++;
            j--;

        }
        System.out.println("Y é o inverso de X");
        return true;
    }
}

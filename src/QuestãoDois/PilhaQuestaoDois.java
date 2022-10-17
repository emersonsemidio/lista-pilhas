package QuestãoDois;

import java.util.Scanner;

public class PilhaQuestaoDois {
    Scanner scan = new Scanner(System.in);

    public String lerString() {
        String s;

        System.out.println("Digite a String:");
        s = scan.nextLine();
        return s;
    }

    public Boolean verificarStrings(String x, String y) {
        Boolean tamanho = comparaTamanhos(x, y);
        if (!tamanho) {
            return false;
        }

        Boolean separador = verificaSeparadores(x, y);
        if (!separador) {
            return false;
        }

        int i = 0;
        while (i <= x.length() - 1) {
            if ((x.charAt(i) != 'A' && x.charAt(i) != 'B') || (y.charAt(i) != 'A' && y.charAt(i) != 'B')) {
                if (x.charAt(i) == 'D' && y.charAt(i) == 'D') {//Entra nesse
                    if (x.charAt(i + 1) == 'D' || y.charAt(i + 1) == 'D') {
                        System.out.println("Alguma das Strings está com 2 ou mais 'D' consecutivos");
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }

    public Boolean verificaSeparadores(String x, String y) {
        int cont = 0;
        for (int j = 0; j < x.length(); j++) {
            if(x.charAt(j) == 'D'){
                cont++;
            }
            if(y.charAt(j)=='D'){
                cont++;
            }
        }
        if(cont < 2){
            System.out.println("Não há o separador D em pelo menos 1 das Strings");
            return false;
        }

        return true;
    }

    public Boolean comparaTamanhos(String x, String y) {
        if (x.length() != y.length()) {
            System.out.println("As strings têm tamanhos diferentes");
            return false;
        }
        return true;
    }

    public Boolean comparaStrings(String x, String y) {

        int i = 0, j = y.length() - 1;

        while (j >= 0) {
            if (x.charAt(i) == 'D' && y.charAt(j) == 'D') {
                i++;
                j--;
                continue;
            }
            if (x.charAt(i) != y.charAt(j)) {
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


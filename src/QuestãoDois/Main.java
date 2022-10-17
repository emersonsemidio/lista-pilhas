package QuestãoDois;

public class Main {
    public static void main(String[] args){
        PilhaQuestaoDois pilhaQuestaoDois = new PilhaQuestaoDois();

        String x = pilhaQuestaoDois.lerString();
        String y = pilhaQuestaoDois.lerString();

        Boolean stringVerificada = pilhaQuestaoDois.verificarStrings(x,y);

        if(stringVerificada){
            pilhaQuestaoDois.comparaStrings(x, y);
        }

    }
}

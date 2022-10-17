package QuestãoUm;

public class Main {
    public static void main(String[] args){

        PilhasQuestaoUm pilhasQuestaoUm = new PilhasQuestaoUm();

        String x = pilhasQuestaoUm.LerString();
        String y = pilhasQuestaoUm.LerString();
        Boolean stringVerificada =  pilhasQuestaoUm.verificarStrings(x,y);

        if(stringVerificada){
            pilhasQuestaoUm.comparaStrings(x, y);
        }
    }
}

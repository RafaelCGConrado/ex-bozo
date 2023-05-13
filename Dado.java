public class Dado{
    private int lados;
    private int lado_anterior;
    private static Random random = new Random();

    Dado(){
        //O lado anterior é marcado como -1 (dado ainda não rolado)
        lados = 6;
        lado_anterior = -1;

    }

    Dado(int n){
        lados = n;
        lado_anterior = -1;
    }

    int getLado(){
       return this.lado_anterior;

    }


    //Faz a rolagem e armazena em lado_anterior
    int rolar(){
        int rolagem = random.getIntRand(lados);
        rolagem++;
        
        lado_anterior = rolagem;
        return rolagem;
    }

    @Override
    public java.lang.String toString(){
        String extremidade = "+-----+";
        String linha1 = new String();
        String linha2 = new String();
        String linha3 = new String();
        
        switch(lado_anterior){
            case 1:
                linha1 = "|     |";
                linha2 = "|  *  |";
                linha3 = "|     |";
                break;

            case 2:
                linha1 = "|*    |";
                linha2 = "|     |";
                linha3 = "|    *|";
                break;

            case 3:
                linha1 = "|*    |";
                linha2 = "|  *  |";
                linha3 = "|    *|";
                break;

            case 4:
                linha1 = "|*   *|";
                linha2 = "|     |";
                linha3 = "|*   *|";
                break;

            case 5:
                linha1 = "|*   *|";
                linha2 = "|  *  |";
                linha3 = "|*   *|";
                break;

            case 6: 
                linha1 = "|*   *|";
                linha2 = "|*   *|";
                linha3 = "|*   *|";
                break;
            
            case -1:
                linha1 = "       ";
                linha2 = "       ";
                linha3 = "       ";
            
            // String resultado = extremidade + linha1+ linha2+ linha3+ extremidade;
        }
        
        String resultado = (extremidade+"\n"+linha1+"\n"+linha2+"\n"+linha3+"\n"+extremidade);
        return resultado;
        }

    public static void main(String[] args){
        Dado dado = new Dado();
        // System.out.println(dado.lado_anterior);
        System.out.println(dado.rolar());
        String resultado = dado.toString();

        System.out.print(resultado);
    }


}
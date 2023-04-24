package comandos;
import javax.swing.JOptionPane;

/****************************************
 * CRIANDO UMA CAIXA DE DIALOGO PADRÃO
 ****************************************/

public class Aula_013_Utilizando_JOptionPane {
    public static void main(String[] args) {
        int n;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(
                "<html>Informe um valor: <br><em>(valor 0 interronpe)</em></html>"));
        }while(n != 0);
    }
    
}

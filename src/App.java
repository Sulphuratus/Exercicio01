
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
EXERCICIO 1: PROGRAMA QUE RECEBE VIA TECLADO OS DADOS DE UM PRODUTO E 
IMPRIME OS VALORES ARMAZENADOS VIA CONSOLE E VIA INTERFACE UTILIZANDO 
JANELAS JOPTIONPANE
*/

public class App {
    public static void main(String[] args) throws Exception {
    //Declaração de variáveis    
        String nome, modelo;
        float tamanho;
        double preco;
        int quantidade;

    // Leitura das variáveis via console
    /*    Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        System.out.println("Informe o nome do produto: ");
        nome = leitor.nextLine();
        System.out.println("Informe o modelo do produto: ");
        modelo = leitor.nextLine();
        System.out.println("Informe o tamanho do produto: ");
        tamanho = leitor.nextFloat();
        System.out.println("Informe o preço do produto: ");
        preco = leitor.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        quantidade = leitor.nextInt();    
    */

// Leitura de dados via interface usando janelas JOptionPane
    nome = JOptionPane.showInputDialog(null, "Informe o nome do produto:","Nome", JOptionPane.QUESTION_MESSAGE);
    modelo = JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE);
    String temp = JOptionPane.showInputDialog(null, "Informe tamanho: ", "Tamanho", JOptionPane.QUESTION_MESSAGE);
    tamanho = Float.parseFloat(temp);
    temp = JOptionPane.showInputDialog(null, "Informe o preço: ", "Preço", JOptionPane.QUESTION_MESSAGE);
    preco = Double.parseDouble(temp);
    temp = JOptionPane.showInputDialog(null, "Informe a quantidade de produto:", "Quantidade", JOptionPane.QUESTION_MESSAGE);
    quantidade = Integer.parseInt(temp);

    // Impressão das variáveis no console    
 /*       System.out.println("Nome do produto: " + nome);
        System.out.println("Modelo do produto: " + modelo);
        System.out.println("Tamanho do produto: " + tamanho);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade de produto: " + quantidade);
 */

    // Impressão das variáveis via interface usando janelas JOptionPane
    JOptionPane.showMessageDialog(null, "Nome do Produto: " + nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Modelo do Produto: " + modelo, "Modelo", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Tamanho do Produto: " + tamanho, "Tamanho", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Preço do produto: " + preco , "Preço", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Quantidade de produto: " + quantidade, "Quantidade", JOptionPane.INFORMATION_MESSAGE);
     
    }
}

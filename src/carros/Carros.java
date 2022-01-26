/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.Scanner;

/**
 *
 * @author JAUM
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
       teclado = new Scanner(System.in);
       // a lista está vazia, logo, objeto inicio têm o valor null, o objeto inicio conterá o endereço do primeiro elemento da lista
       Cars inicio = null;
       // o objeto fim conterá o endereço do último elemento da lista
       Cars fim = null;
       // o objeto aux é um objeto auxiliar
       Cars aux;
       // o objeto anterior é um objeto auxiliar
       Cars anterior;
       // apresenta o menu de opções
       int op, numero, achou;

       do {

           System.out.println("\nMENU DE OPÇÕES\n");
           System.out.println("1 - Inserir no início da lista");
           System.out.println("2 - Inserir no final da lista");
           System.out.println("3 - Consultar toda a lista");
           System.out.println("4 - Remover da lista");
           System.out.println("5 - Esvaziar a lista");
           System.out.println("6 - Tamanho");
           System.out.println("7 - Sair");
           System.out.println("Digite sua opção: ");
           op = Integer.parseInt(teclado.nextLine());

           if (op < 1 || op > 7) {
               System.out.println("Opção inválida!!");
           } else {

               if (op == 1) {
                   Cars novo = new Cars();
                   System.out.println("Digite o número do cadastro ");
                   novo.num = Integer.parseInt(teclado.nextLine());
                   System.out.println("Digite o Nome do Carro");
                   novo.nome = teclado.nextLine ();
                   System.out.println("Digite o ano de fabricaçao");
                   novo.AnoF = teclado.nextLine ();
                   System.out.println("Digite o Numero de Chassi ");
                   novo.Chassi = teclado.nextLine ();
                   System.out.println("Informe a Placa do Carro ");
                   novo.Placa = teclado.nextLine ();
                   System.out.println("Informe o Ano do Modelo");
                   novo.AnoM = teclado.nextLine ();
                   
                   if (inicio == null) {
                       // a lista esta vazia e o elemento inserido será o primeiro e o último da lista
                       inicio = novo;
                       fim = inicio;
                       novo.prox = null;

                   } else {
                       // a lista já contem elementos e o novo elemento será inserido no início da lista
                       novo.prox = inicio;
                       inicio = novo;

                   }
                   System.out.println("+++++++++++++Cadastro inserido na lista!!++++++++++++");

               }

               if (op == 2) {
                   Cars novo = new Cars();
                   System.out.println("Digite o número do cadastro ");
                   novo.num = Integer.parseInt(teclado.nextLine());
                   System.out.println("Digite o Nome do Carro");
                   novo.nome = teclado.nextLine ();
                   System.out.println("Digite o ano de fabricaçao");
                   novo.AnoF = teclado.nextLine ();
                   System.out.println("Digite o Numero de Chassi ");
                   novo.Chassi = teclado.nextLine ();
                   System.out.println("Informe a Placa do Carro ");
                   novo.Placa = teclado.nextLine ();
                   System.out.println("Informe o Ano do Modelo");
                   novo.AnoM = teclado.nextLine ();
       
                   }
                System.out.println("+++++++++++++Cadastro inserido na lista!!++++++++++++");
                }
                    if (op == 3) {
                   if (inicio == null) {
                       // a lista está vazia
                       System.out.println("Lista vazia!!");

                   } else {

                       // a lista contém elementos e estes serão mostrados do início ao fim
                       System.out.println("\nConsultando toda a lista\n");
                       aux = inicio;
                       while (aux != null) {
                           System.out.println("  <========================================================> ");
                           System.out.println("Numero de Cadastro = " + aux.num + " ");
                           System.out.println("Nome do Carro = " + aux.nome + " ");
                           System.out.println("Numero de Chassi = " + aux.Chassi + " ");
                           System.out.println("Placa do veiculo = " + aux.Placa + " ");
                           System.out.println("Modelo do veiculo = " + aux.AnoM + " ");
                           System.out.println("Ano de fabricação = " + aux.AnoF + " ");
                           System.out.println("  <========================================================> ");

                           aux = aux.prox;
                       }
                   }
               }

               if (op == 4) {
                   if (inicio == null) {
                       // a lista está vazia
                       System.out.println("Lista vazia!!");

                   } else {

                       // a lista contém elementos e o elmento a ser removido deve ser digitado
                       System.out.print("\nDigite o numero do cadastro a ser removido: ");
                       numero = Integer.parseInt(teclado.nextLine());
                       // todos as ocorrências da lista, iguais ao número digitado serão removidas
                       aux = inicio;
                       anterior = null;
                       achou = 0;
                       while (aux != null) {
                           if (aux.num == numero) {
                               // o número digitado foi encontrado na lista e será removido
                               achou = achou + 1;
                               if (aux == inicio) {
                                   // o número a ser removido é o primeiro da lista
                                   inicio = aux.prox;
                                   aux = inicio;

                               } else if (aux == fim) {
                                   // o número a ser removido é o último da lista
                                   anterior.prox = null;
                                   fim = anterior;
                                   aux = null;

                               } else {
                                   // o número a ser removido está no meio da lista
                                   anterior.prox = aux.prox;
                                   aux = aux.prox;

                               }

                           } else {
                               anterior = aux;
                               aux = aux.prox;

                           }

                       }

                         if (achou == 0) {

                           System.out.println("Cadastro não encontrado");

                       } else if (achou == 1) {

                           System.out.println("Cadastro Removido");

                       } else {

                           System.out.println("Cadastro removido " + achou + " Veses Repetidamente ");

                       }

                   }

               }

               if (op == 5) {

                   if (inicio == null) {
                       // a lista está vazia
                       System.out.println("Lista vazia!!");
                   } else {
                       // a lista será esvaziada
                       inicio = null;
                       System.out.println("Lista esvaziada");

                   }

               }

              
if (op == 6) {
                   int tamanho = 0;
                   aux = inicio;
                   while (aux != null) {
                       tamanho++;
                       aux = aux.prox;
                   }
                   System.out.println("A lista de Carros possui " + tamanho + " registro(s)");

               }

           

       } while (op != 7);

   }

}
    
    


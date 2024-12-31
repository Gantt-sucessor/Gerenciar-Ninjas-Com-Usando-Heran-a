import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcoes;
        int contador = 0;
        int contador1 = 0;

        Ninja4 ninjas = new Ninja4();
        String[] nome = new String[2];
        int[] idade = new int[2];
        String[] missao = new String[2];
        String[] nivelDificuldade = new String[2];
        String[] StatusDaMissao = new String[2];

        Uchiha4 uchiha = new Uchiha4();
        String[] nome1 = new String[2];
        int[] idade1 = new int[2];
        String[] missao1 = new String[2];
        String[] nivelDificuldade1 = new String[2];
        String[] StatusDaMissao1 = new String[2];
        String[] HabilidadeEspecial1 = new String[2];

        while (true){

           try{
               System.out.println("=== MENU ===");
               System.out.println("1. Cadastrar Ninja");
               System.out.println("2. Cadastrar Uchiha");
               System.out.println("3. Listar Ninjas");
               System.out.println("4. Listar Uchihas");
               System.out.println("5. Sair");
               System.out.print("Escolha uma opção: ");
               opcoes = input.nextInt();

               if (opcoes < 1 || opcoes > 5) {
                   System.out.println("Número fora do intervalo. Escolha entre 1 e 3.");
                   continue;
               }

           } catch (InputMismatchException e) {

               System.out.println("Informe uma opção válida para continuar");
               input.nextLine();
               continue;
           }

           switch (opcoes){

               case 1:

                   if (contador < nome.length){

                       System.out.println("Digite o nome do Ninja: ");
                       ninjas.nome = input.next();
                       nome[contador] = ninjas.nome;

                       System.out.println("Digite a idade do Ninja: ");
                       ninjas.idade = input.nextInt();
                       idade[contador] = ninjas.idade;

                       System.out.println("Informe a missao do Ninja: ");
                       ninjas.missao = input.next();
                       missao[contador] = ninjas.missao;

                       System.out.println("Informe o nivel de dificuldade da missão do Ninja: ");
                       ninjas.nivelDificuldade = input.next();
                       nivelDificuldade[contador] = ninjas.nivelDificuldade;

                       System.out.println("Informe o status da missão: ");
                       ninjas.StatusDaMissao = input.next();
                       StatusDaMissao[contador] = ninjas.StatusDaMissao;

                       contador++;

                   } else{
                       System.out.println("Não é mais possível adicionar mais ninjas porque passou do tamanho do array");
                       continue;
               }
                   break;

               case 2:

                   if (contador1 < nome1.length){

                       System.out.println("Digite o nome do Uchiha: ");
                       uchiha.nome = input.next();
                       nome1[contador1] = uchiha.nome;

                       System.out.println("Digite a idade do Ninja: ");
                       uchiha.idade = input.nextInt();
                       idade1[contador1] = uchiha.idade;

                       System.out.println("Informe a missao do Ninja: ");
                       uchiha.missao = input.next();
                       missao1[contador1] = uchiha.missao;

                       System.out.println("Informe o nivel de dificuldade da missão do Ninja: ");
                       uchiha.nivelDificuldade = input.next();
                       nivelDificuldade1[contador1] = uchiha.nivelDificuldade;

                       System.out.println("Informe o status da missão: ");
                       uchiha.StatusDaMissao = input.next();
                       StatusDaMissao1[contador1] = uchiha.StatusDaMissao;

                       System.out.println("Informe a habilidade especial do Uchiha: ");
                       uchiha.HabilidadeEspecial = input.next();
                       HabilidadeEspecial1[contador1] = uchiha.HabilidadeEspecial;

                       contador1++;

                   }else{
                       System.out.println("Não é mais possível adicionar mais ninjas porque passou do tamanho do array");
                       continue;
                   }

                   break;

               case 3:


                   for (int i = 0; i < contador; i++) {

                       System.out.println("Meu nome é: "+nome[i]+" tenho "+idade[i]+" anos "+" minha missao é "+missao[i]+
                               " com nivel de dificuldade "+nivelDificuldade[i]+ " e o status da missao se encontra "+StatusDaMissao[i]);

                   }
                   break;

               case 4:

                   for (int i = 0; i < contador1; i++) {

                       System.out.println("Meu nome é: "+nome1[i]+" tenho "+idade1[i]+" anos "+" minha missao é: "+missao1[i]+
                               " com nivel de dificuldade "+nivelDificuldade1[i]+ " e o status da missao se encontra "+StatusDaMissao1[i]+
                               " e minha técnica especial é "+HabilidadeEspecial1[i]);
                   }

                   break;

               case 5:

                   System.out.println("Saindo...");
                   input.close();
                   return;
           }


        }
    }
}

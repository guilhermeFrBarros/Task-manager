package taskmanager2;

import java.util.ArrayList;
import java.util.Scanner;


public class TaskManager2 {

    
    public static void visualizadorDeTarefas(ArrayList<String> tarefas) {
		System.out.println("\n\nLISTA DE TAREFAS\n");
		for(int i = 0; i< tarefas.size(); i++) {
			System.out.println( (i+1)+") -" + tarefas.get(i));
		}
    }
    
    
    public static void main(String[] args) throws Exception {
       Scanner leitura = new Scanner(System.in);
       ArrayList<String> tarefas = new ArrayList<String>();
       int escolha = 2;
       String gg = null;
       
        System.out.println("GERENCIADOR DE TAREFAS\n");
        do{

           System.out.println("Insira uma tarefa");
           tarefas.add("-> "+leitura.nextLine());
           System.out.println("Deseja inserir mais uma atividade, digite: \n[1]sim ou [0] nao ");
           escolha= leitura.nextInt();
           leitura.nextLine();//limpando buffer
           
        }while( 1 == escolha);
       
       visualizadorDeTarefas(tarefas);
       
       
       do{

           System.out.println("Insira o numero da tarefa concluida");
           escolha = leitura.nextInt();
           tarefas.set( escolha -1, tarefas.get(escolha-1)+" --> CONCLUIDO "); 
           visualizadorDeTarefas(tarefas);
           
           System.out.println("Deseja inserir mais uma atividade como concluida:\ndigite: [1]sim ou [0] nao ");
           escolha= leitura.nextInt();
           leitura.nextLine();//limpando buffer
           
           
        }while( 1 == escolha);
       
       leitura.close();
    }
    
}


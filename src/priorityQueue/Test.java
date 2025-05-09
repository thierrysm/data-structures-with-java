package priorityQueue;

public class Test {

    public static void main(String[] args) {
        MyPriorityQueue<String> priorityQueue = new MyPriorityQueue<>(5);

        // Adiciona elementos em ordem aleatória
        priorityQueue.add("Elemento 1");
        priorityQueue.add("Elemento 7");
        priorityQueue.add("Elemento 3");
        priorityQueue.add("Elemento 2");

        // Exibe o estado atual da fila em ordem de proridade
        System.out.println("Conteúdo da fila de prioridade:");
        System.out.println(priorityQueue);
    }
}

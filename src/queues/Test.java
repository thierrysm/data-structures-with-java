package queues;

public class Test {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>(5);

        System.out.println("=== Inserindo elementos com offer ===");
        queue.offer("Elemento 1");
        queue.offer("Elemento 2");
        queue.offer("Elemento 3");
        System.out.println("Fila após inserções: " + queue);

        System.out.println("\n=== Removendo elementos com poll ===");
        System.out.println("Removido: " + queue.poll());
        System.out.println("Fila atual: " + queue);

        System.out.println("Removido: " + queue.poll());
        System.out.println("Fila atual: " + queue);

        System.out.println("Removido: " + queue.poll());
        System.out.println("Fila atual: " + queue);

        System.out.println("\n=== Reutilizando a fila ===");
        queue.offer("Elemento 4");
        queue.offer("Elemento 5");
        System.out.println("Fila atual: " + queue);

        System.out.println("\n=== Verificando o primeiro elemento com peek ===");
        System.out.println("Topo da fila (peek): " + queue.peek());
    }
}

package stacks;

public class Test {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(5);

        System.out.println("Adicionando elementos à pilha:");
        stack.push("Elemento 1");
        stack.push("Elemento 2");
        stack.push("Elemento 3");
        stack.push("Elemento 4");
        System.out.println("Pilha atual: " + stack);

        System.out.println("\n Removendo elementos da pilha:");
        System.out.println("Elemento removido (pop): " + stack.pop());
        System.out.println("Elemento removido (pop): " + stack.pop());
        System.out.println("Pilha após remoções: " + stack);

        System.out.println("\n Topo da pilha (peek): " + stack.peek());

        System.out.println("\n Testando remoção até a pilha ficar vazia:");
        stack.pop(); // remove "Elemento 2"
        stack.pop(); // remove "Elemento 1"
        System.out.println("Pilha após esvaziar: " + stack);

        System.out.println("\n Tentando remover de pilha vazia:");
        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n Tentando acessar topo da pilha vazia:");
        try {
            System.out.println("Topo: " + stack.peek());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

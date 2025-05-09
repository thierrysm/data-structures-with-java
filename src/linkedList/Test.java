package linkedList;

public class Test {

    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        System.out.println("===== 🟢 Adicionando elementos no final =====");
        linkedList.addLast("Elemento 1");
        linkedList.addLast("Elemento 2");
        linkedList.addLast("Elemento 3");
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== 🟢 Adicionando elementos no início =====");
        linkedList.addFirst("Elemento 4");
        System.out.println("Lista atual: " + linkedList);
        linkedList.addFirst("Elemento 5");
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== 🔢 Tamanho da lista =====");
        System.out.println("Tamanho: " + linkedList.getSize());

        System.out.println("\n===== 🔍 Testando método get(index) =====");
        System.out.println("Elemento na posição 2: " + linkedList.get(2));

        System.out.println("\n===== 🔍 Testando método get(data) =====");
        try {
            System.out.println("Busca por 'Elementsasao 1': " + linkedList.get("Elementsasao 1"));
        } catch (Exception e) {
            System.out.println("Erro ao buscar 'Elementsasao 1': " + e.getMessage());
        }

        System.out.println("Busca por 'Elemento 2': " + linkedList.get("Elemento 2"));
        System.out.println("Busca por 'Elemento 5': " + linkedList.get("Elemento 5"));

        System.out.println("\n===== ➕ Adicionando elemento em posição específica =====");
        linkedList.add(3, "Novo elemento na posição 3");
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ❌ Removendo elementos no início =====");
        System.out.println("Elemento removido: " + linkedList.removeFirst());
        System.out.println("Lista atual: " + linkedList);
        System.out.println("Elemento removido: " + linkedList.removeFirst());
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ➕ Adicionando mais elementos no final =====");
        linkedList.addLast("Elemento 2");
        linkedList.addLast("Elemento 3");
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ❌ Removendo elementos no final =====");
        System.out.println("Elemento removido: " + linkedList.removeLast());
        System.out.println("Lista atual: " + linkedList);
        System.out.println("Elemento removido: " + linkedList.removeLast());
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ➕ Repondo elementos para teste de remoção por posição =====");
        linkedList.addLast("Elemento 2");
        linkedList.addLast("Elemento 3");
        linkedList.addLast("Elemento 4");
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ❌ Removendo por posição =====");
        System.out.println("Elemento removido na posição 2: " + linkedList.remove(2));
        System.out.println("Lista atual: " + linkedList);

        System.out.println("\n===== ⚠️ Tentativa de remover posição inválida =====");
        System.out.println(linkedList.getSize());
        try {
            linkedList.remove(12);
        } catch (Exception e) {
            System.out.println("Erro ao remover posição inválida: " + e.getMessage());
        }
    }
}

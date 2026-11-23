public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int[] valores = {50, 30, 70, 20, 40, 60, 80, 35, 65, 10, 50};
        for (int v : valores) {
            arvore.inserir(v);
        }
        arvore.inserir(null);

        System.out.print("Árvore em ordem: ");
        arvore.emOrdem();

        System.out.println("Buscar 60: " + arvore.buscar(60));
        System.out.println("Buscar 67: " + arvore.buscar(67));
        System.out.println("Buscar null: " + arvore.buscar(null));

        arvore.remover(10);
        System.out.print("Após remover 10 (folha): ");
        arvore.emOrdem();

        arvore.remover(40);
        System.out.print("Após remover 40 (um filho): ");
        arvore.emOrdem();

        arvore.remover(50);
        System.out.print("Após remover 50 (dois filhos): ");
        arvore.emOrdem();
    }
}
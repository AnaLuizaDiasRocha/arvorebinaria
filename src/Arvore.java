public class Arvore {
    private No raiz;

    public void inserir(Integer valor) {
        if (valor == null) return;
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, Integer valor) {
        if (no == null) return new No(valor);
        if (valor < no.valor) no.esquerdo = inserir(no.esquerdo, valor);
        else if (valor > no.valor) no.direito = inserir(no.direito, valor);

        return no;
    }

    public boolean buscar(Integer valor) {
        if (valor == null) return false;
        return buscar(raiz, valor);
    }

    private boolean buscar(No no, Integer valor) {
        if (no == null) return false;
        if (valor < no.valor) return buscar(no.esquerdo, valor);
        if (valor > no.valor) return buscar(no.direito, valor);
        return true;
    }

    public void remover(Integer valor) {
        if (valor == null) return;
        raiz = remover(raiz, valor);
    }

    private No remover(No no, Integer valor) {
        if (no == null) return null;

        if (valor < no.valor) {
            no.esquerdo = remover(no.esquerdo, valor);
        } else if (valor > no.valor) {
            no.direito = remover(no.direito, valor);
        } else {
            if (no.esquerdo == null) return no.direito;
            if (no.direito == null) return no.esquerdo;

            no.valor = menor(no.direito);
            no.direito = remover(no.direito, no.valor);
        }
        return no;
    }

    private Integer menor(No no) {
        if (no.esquerdo == null) return no.valor;
        return menor(no.esquerdo);
    }

    public void emOrdem() {
        emOrdem(raiz);
        System.out.println();
    }

    private void emOrdem(No no) {
        if (no == null) return;
        emOrdem(no.esquerdo);
        System.out.print(no.valor + " ");
        emOrdem(no.direito);
    }
}
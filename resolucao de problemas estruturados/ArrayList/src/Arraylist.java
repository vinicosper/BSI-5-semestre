import java.util.Arrays;
import java.util.Objects;

public class Arraylist<E> {
    private Object[] elemento;
    private int tamanho;

    public static final int capacidade_inicio = 10;

    public Arraylist(){
        this.elemento = new Object[capacidade_inicio];
        this.tamanho = 0;
    }

    public Arraylist(int capacidade){
        if (capacidade <= 0){
            throw new IllegalArgumentException("Capacidade deve ser igual ou maior que 1");
        }
        this.elemento = new Object[capacidade];
        this.tamanho = 0;
    }

    public void add(E e) {
        Objects.requireNonNull(e, "Elemento não pode ser nulo");

        if (tamanho == elemento.length){
            AumentaCapacidade();
        }

        elemento[tamanho++] = e;
    }

    private void AumentaCapacidade(){
        int NovaCapacidade = elemento.length + (elemento.length / 2);
        elemento = Arrays.copyOf(elemento, NovaCapacidade);
    }

    public void add(int Index, E e) {
        Objects.requireNonNull(e, "Elemento não pode ser nulo");

        if (Index < 0 || Index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + Index);
        }

        if (tamanho == elemento.length){
            AumentaCapacidade();
        }

        // Corrigido: Aqui usamos `tamanho - Index`
        System.arraycopy(elemento, Index, elemento, Index + 1, tamanho - Index);
        elemento[Index] = e;
        tamanho++;
    }

    public E remove(int Index) {
        if (Index < 0 || Index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + Index);
        }

        E ElementoRemovido = (E) elemento[Index];

        System.arraycopy(elemento, Index + 1, elemento, Index, tamanho - Index - 1);
        elemento[--tamanho] = null; // Evita vazamento de memória

        return ElementoRemovido;
    }

    public boolean remove(Object o) {
        Objects.requireNonNull(o, "O elemento não pode ser nulo");

        int Index = indexOf(o);
        if (Index == -1) {
            return false;
        }
        remove(Index);
        return true;
    }

    public E get(int Index) {
        if (Index < 0 || Index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + Index);
        }
        return (E) elemento[Index];
    }

    public void set(int Index, E e) {
        Objects.requireNonNull(e, "Elemento não pode ser nulo");

        if (Index < 0 || Index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + Index);
        }
        elemento[Index] = e;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public int indexOf(Object o) {
        if (o == null) return -1;

        for (int i = 0; i < tamanho; i++) {
            if (Objects.equals(elemento[i], o)){
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elemento, tamanho);
    }
}

public class GenericNode<T> {
    private GenericNode<T> next;
    private T value;

    public GenericNode(T value) {
        this.value = value;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}

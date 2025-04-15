public class GenericList<T> {
    private GenericNode<T> head;

    public void add(T value) {
        GenericNode<T> newNode = new GenericNode<>(value);

        if (head == null) {
            head = newNode;
        } else {
            GenericNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        GenericNode<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.getNext();
        }

        return current != null ? current.getValue() : null;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Die Liste: ");
        GenericNode<T> current = head;

        while (current != null) {
            result.append(current.getValue()).append(" ");
            current = current.getNext();
        }

        return result.toString().trim();
    }

}

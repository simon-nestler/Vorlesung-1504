public class StringList {
    private StringNode head;

    public void add(String value) {
        StringNode newNode = new StringNode(value);

        if (head == null) {
            head = newNode;
        } else {
            StringNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public String toString() {
        String result = "Die Liste: ";
        StringNode current = head;

        while (current != null) {
            result += current.getValue() + " ";
            current = current.getNext();
        }

        return result.trim();
    }
}

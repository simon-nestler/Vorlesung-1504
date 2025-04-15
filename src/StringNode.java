public class StringNode {
    private StringNode next;
    private String value;

    public StringNode(String value) {
        this.value = value;
    }

    public StringNode getNext() {
        return next;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }
}

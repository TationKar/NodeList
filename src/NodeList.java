public class NodeList {

    Node head;
    Node last;

    public void append(Node node) {
        if (head.getNext() == null) {
            head.setNext(node);
            node.setPrev(head);
        } else {
            head.getNext().append(node);
        }
    }

    public String toString() {
        Node curr = head;
        StringBuilder sBuilder = new StringBuilder();
        while (curr != null) {
            sBuilder.append(curr.getData()).append(curr.hasNext() ? " > " : "");
            curr = curr.getNext();
        }
        return sBuilder.toString();
    }

    public String reverse() {
        Node curr = head;
        Node newHead = null;
        Node newLast = null;
        while (curr != null) {
            Node pre = curr.getPrev();
            Node next = curr.getNext();
            if (pre == null) newLast = curr; 
            if (next == null) newHead = curr; 
            curr.setNext (pre);  
            curr.setPrev (next); 
            curr = curr.getPrev (); 
        }
        head = newHead; 
        last = newLast; 
        return this.toString();
    }
}

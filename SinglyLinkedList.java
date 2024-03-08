import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList() {
        this("linked list");
    }

    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode<E> newNode = new ListNode<>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode<E> newNode = new ListNode<>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public void deleteNode() {
        if (isEmpty()) {
            System.out.println("List is empty. Nothing to delete.");
        } else if (firstNode == lastNode) {
            firstNode = lastNode = null;
            System.out.println("Node deleted successfully.");
        } else {
            ListNode<E> current = firstNode;
            ListNode<E> previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            lastNode = previous;
            System.out.println("Node deleted successfully.");
        }
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }

    private static class ListNode<E> {
        E data;
        ListNode<E> next;

        ListNode(E object) {
            this(object, null);
        }

        ListNode(E object, ListNode<E> node) {
            data = object;
            next = node;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>("Integer Linked List");

        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtFront(3);
        list.print(); // Output: 3 2 1

        list.insertAtBack(4);
        list.insertAtBack(5);
        list.insertAtBack(6);
        list.print(); // Output: 3 2 1 4 5 6
        
        list.deleteNode(); // Delete the last node
        list.print(); // Output: 3 2 1 4 5
    }
}

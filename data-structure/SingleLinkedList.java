public class SingleLinkedList<T> {

    public Node<T> head = null; // 최초엔 head가 아무것도 없음

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node<T data> {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                // node.next != null의 의미 -> 그 다음 노드가 존재한다는 의미
                node = node.next; // 맨 끝 노드로 이동
            }
            node.next = new Node<T>(data); // 맨 끝 노드 다음 노드에 새로운 노드를 삽입
        }
    }

}

    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        System.out.println("MyLinkedList.head.data = " + MyLinkedList.head.data);

        MyLinkedList.addNode(2);
        System.out.println("MyLinkedList.head.next = " + MyLinkedList.head.next);

    }


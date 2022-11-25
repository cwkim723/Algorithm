public class Node<T> {
    T data;
    Node<T> next = null; // 다음 노드를 가리키는 포인터

    public Node(T data) {
        this.data = data;
    }

    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);

    node1.next = node2;
    Node head = node1; // 맨 앞의 노드를 알아야 계속 타고타고 갈 수 있기 때문에 맨 첫 노드(node1)를 head로 따로 지정해줌
}

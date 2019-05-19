package com.algorithm.graph;

class GraphSearchTestUtil {

    static Node get6NodesGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.addLink(node2);
        node1.addLink(node3);
        node3.addLink(node4);
        node4.addLink(node5);
        node4.addLink(node6);
        node4.addLink(node1);
        node4.addLink(node2);
        node4.addLink(node4);

        return node1;
    }
}

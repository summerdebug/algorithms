package com.algorithm.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Set;

class ElementSearchBfs {

    static Optional<Node> find(int id, Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        Set<Node> checked = new HashSet<>();

        while (!queue.isEmpty()) {
            Node currentNode = queue.removeFirst();
            if (checked.add(currentNode)) {
                if (currentNode.getId() == id) {
                    return Optional.of(currentNode);
                }
                for (Node link : currentNode.getLinks()) {
                    if (!checked.contains(link)) {
                        queue.addLast(link);
                    }
                }
            }
        }

        return Optional.empty();
    }
}

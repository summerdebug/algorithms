package com.algorithm.graph;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class ShortestPathSearchBfs {

    static List<Node> findPath(Node start, Node end) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(start);
        Set<Node> checked = new HashSet<>();

        while (!queue.isEmpty()) {
            Node currentNode = queue.removeFirst();
            if (checked.add(currentNode)) {
                if (currentNode.equals(end)) {
                    return buildPath(currentNode);
                }
                for (Node link : currentNode.getLinks()) {
                    if (!checked.contains(link)) {
                        link.setPrevious(currentNode);
                        queue.addLast(link);
                    }
                }
            }
        }

        return Collections.emptyList();
    }

    private static List<Node> buildPath(Node node) {
        LinkedList<Node> path = new LinkedList<>();
        path.add(node);
        while (path.getFirst().getPrevious().isPresent()) {
            path.addFirst(path.getFirst().getPrevious().get());
        }
        return path;
    }
}

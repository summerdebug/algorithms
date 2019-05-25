package com.algorithm.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Dijkstra {

    private static final int MAX = Integer.MAX_VALUE / 2;

    static void execute(DijkstraNode start) {
        Set<DijkstraNode> nodes = getAllNodes(start);

        for (DijkstraNode node : nodes) {
            node.setDistance(MAX);
        }

        DijkstraNode node = start;
        start.setDistance(0);
        while (node != null) {
            int distance = node.getDistance();
            for (Map.Entry<DijkstraNode, Integer> link : node.getLinks().entrySet()) {
                DijkstraNode linkNode = link.getKey();
                int newLinkDistance = distance + link.getValue();
                if (linkNode.getDistance() > newLinkDistance) {
                    linkNode.setPrevious(node);
                    linkNode.setDistance(newLinkDistance);
                }
            }
            node.setChecked(true);

            node = getMinimumDistanceUncheckedNode(nodes);
        }
    }

    private static DijkstraNode getMinimumDistanceUncheckedNode(Set<DijkstraNode> nodes) {
        DijkstraNode result = null;
        int minDistance = MAX;
        for (DijkstraNode node : nodes) {
            if (!node.isChecked()) {
                int distance = node.getDistance();
                if (distance <= minDistance) {
                    minDistance = distance;
                    result = node;
                }
            }
        }
        return result;
    }

    private static Set<DijkstraNode> getAllNodes(DijkstraNode start) {
        Set<DijkstraNode> nodes = new HashSet<>();
        if (nodes.add(start)) {
            for (DijkstraNode link : start.getLinks().keySet()) {
                nodes.addAll(getAllNodes(link));
            }
        }
        return nodes;
    }
}

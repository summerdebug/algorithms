package com.algorithm.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

class ElementSearchDfs {

    private Set<Node> checked = new HashSet<>();

    Optional<Node> find(int id, Node node) {
        if (node.getId() == id) {
            return Optional.of(node);
        }

        for (Node link : node.getLinks()) {
            if (!checked.contains(link)) {
                checked.add(link);
                Optional<Node> result = find(id, link);
                if (result.isPresent()) {
                    return result;
                }
            }
        }

        return Optional.empty();
    }

    Optional<Node> find(int id, List<Node> nodes) {
        for (Node node : nodes) {
            Optional<Node> result = find(id, node);
            if (result.isPresent()) {
                return result;
            }
        }

        return Optional.empty();
    }
}

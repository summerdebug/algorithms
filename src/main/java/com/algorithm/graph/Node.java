package com.algorithm.graph;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Node {

    private final int id;
    private final Set<Node> links = new HashSet<>();

    Node(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    Set<Node> getLinks() {
        return Collections.unmodifiableSet(links);
    }

    void addLink(Node link) {
        if (link != null) {
            links.add(link);
        }
    }

    void addLinks(Collection<Node> links) {
        if (links != null) {
            this.links.addAll(links);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((Node) obj).getId() == id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

package com.algorithm.graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DijkstraNode {

    private final int id;
    private DijkstraNode previous;
    private Map<DijkstraNode, Integer> links = new HashMap<>();

    void setChecked(boolean checked) {
        this.checked = checked;
    }

    private int distance;

    boolean isChecked() {
        return checked;
    }

    private boolean checked;

    DijkstraNode(int id) {
        this.id = id;
    }

    void setPrevious(DijkstraNode previous) {
        this.previous = previous;
    }

    Map<DijkstraNode, Integer> getLinks() {
        return Collections.unmodifiableMap(links);
    }

    void addLink(DijkstraNode link, int weight) {
        if (link != null && (!links.containsKey(link) || links.get(link) > weight)) {
            links.put(link, weight);
        }
    }

    int getId() {
        return id;
    }

    int getDistance() {
        return distance;
    }

    void setDistance(int distance) {
        this.distance = distance;
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

    @Override
    public String toString() {
        String result = String.valueOf(id) + "(" + distance + ")";
        if (previous != null) {
            return result + " -> " + previous.toString();
        }
        return result;
    }
}

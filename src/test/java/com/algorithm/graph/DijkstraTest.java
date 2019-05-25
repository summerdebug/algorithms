package com.algorithm.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DijkstraTest {

    @Test
    public void givenDijkstraWhenExecuteThenSuccessful() throws Exception {
        // Arrange
        DijkstraNode node1 = new DijkstraNode(1);
        DijkstraNode node2 = new DijkstraNode(2);
        DijkstraNode node3 = new DijkstraNode(3);
        DijkstraNode node4 = new DijkstraNode(4);
        DijkstraNode node5 = new DijkstraNode(5);
        DijkstraNode node6 = new DijkstraNode(6);

        node1.addLink(node2, 1);
        node2.addLink(node3, 1);
        node3.addLink(node4, 1);
        node4.addLink(node5, 1);
        node5.addLink(node6, 1);
        node2.addLink(node6, 2);

        // Act
        Dijkstra.execute(node1);

        // Assert
        assertEquals("6(3) -> 2(1) -> 1(0)", node6.toString());
    }
}

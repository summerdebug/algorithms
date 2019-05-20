package com.algorithm.graph;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class ShortestPathSearchBfsTest {

    @Test
    public void givenShortestPathSearchBfsWhenFindPathThenSuccessful() throws Exception {
        // Arrange
        Node start = GraphSearchTestUtil.get6NodesGraph();
        Node end = new ElementSearchBfs().find(6, start).get();

        List<Node> path = ShortestPathSearchBfs.findPath(start, end);

        // Assert
        assertEquals(4, path.size());
        path.forEach(n -> System.out.print(n.getId() + " -> "));
    }
}

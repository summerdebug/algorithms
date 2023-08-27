package com.algorithm.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LowestCommonAncestorTest {

  @Test
  public void lcaTest() {
    // Arrange
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);

    node1.addLink(node2);
    node2.addLink(node3);
    node3.addLink(node4);
    node4.addLink(node5);
    node2.addLink(node6);

    // Act
    Node lca = LowestCommonAncestor.getLowestCommonAncestor(node1, node5, node6);

    // Assert
    assertEquals(node2, lca);
  }

}
package com.algorithm.graph;

public class LowestCommonAncestor {

  public static Node getLowestCommonAncestor(Node root, Node node1, Node node2) {
    setParent(root, null);
    Node first = node1;
    Node second = node2;
    if (first.getDepth() != second.getDepth()) {
      while (first.getDepth() > second.getDepth()) {
        first = first.getPrevious().orElseThrow();
      }
      while (second.getDepth() > first.getDepth()) {
        second = second.getPrevious().orElseThrow();
      }
    }
    while (first != second) {
      first = first.getPrevious().orElseThrow();
      second = second.getPrevious().orElseThrow();
    }
    return first;
  }

  private static void setParent(Node node, Node parent) {
    node.setPrevious(parent);
    if (parent != null) {
      node.setDepth(parent.getDepth() + 1);
    }
    for (Node link : node.getLinks()) {
      setParent(link, node);
    }
  }
}

class Gfg {
    /* Takes two lists sorted in increasing order, and splices
    their nodes together to make one big sorted list which is returned. */
    public Node sortedMerge(Node nodeA, Node nodeB) {
        if (nodeA == null)
            return nodeB;
        if (nodeB == null)
            return nodeA;

        if (nodeA.data < nodeB.data) {
            nodeA.next = sortedMerge(nodeA.next, nodeB);
            return nodeA;
        } else {
            nodeB.next = sortedMerge(nodeA, nodeB.next);
            return nodeB;
        }
    }
}
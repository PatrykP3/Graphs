package org.nowpat.graphs.graph;

public class GraphBuilder {

    private final Graph graph;

    public GraphBuilder() {
        graph = new Graph();
    }

    public GraphBuilder addVertex(String vertex) {
        graph.addVertex(vertex);
        return this;
    }

    public GraphBuilder addEdge(String v1, String v2) {
        graph.addEdge(v1, v2);
        return this;
    }

    public Graph build() {
        return graph;
    }
}

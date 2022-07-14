package org.nowpat.graphs.graph;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Vertex {

    String label;

    Vertex(String label) {
        this.label = label;
    }
}

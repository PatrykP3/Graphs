package org.nowpat.graphs;

import org.junit.Before;
import org.junit.Test;
import org.nowpat.graphs.graph.Graph;
import org.nowpat.graphs.graph.Graphs;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    private Graph testGraph;

    @Before
    public void setUp() {
        testGraph = Graphs.createSampleGraph();
    }

    @Test
    public void simpleTest() {

        assertEquals("[Bob, Rob, Maria, Alice, Mark]", Graphs.depthFirstTraversal(testGraph, "Bob").toString());

        assertEquals("[Bob, Alice, Rob, Mark, Maria]", Graphs.breadthFirstTraversal(testGraph, "Bob").toString());
    }
}

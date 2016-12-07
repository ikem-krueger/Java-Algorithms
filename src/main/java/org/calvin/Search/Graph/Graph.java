/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search.Graph;

public class Graph {
    public int count; // num of vertices
    private Node vertices[];

    public Graph() {
        vertices = new Node[8];
        count = 0;
    }

    public void addNode(Node n) {
        if(count < 10) {
            vertices[count] = n;
            count++;
        }
    }

    public Node[] getNode() {
        return vertices;
    }

}

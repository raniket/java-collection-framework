package implementation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class Graph {

    public class Node {
        public int id;
        public LinkedList<Node> adjacent = new LinkedList<Node>();
        public Node(int id) {
            this.id = id;
        }
    }

    private HashMap<Integer, Node> nodeLookup = new HashMap<>();

    public void addNode(int id) {
        Node node = new Node(id);
        nodeLookup.put(id, node);
    }

    private Node getNode(int id) {
        return nodeLookup.get(id);
    }

    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
        if (visited.contains(source.id)) { return false; }
        visited.add(source.id);
        if (source.id == destination.id) { return true; }
        for(Node child : source.adjacent) {
            if(hasPathDFS(child, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        return hasPathBFS(getNode(source), getNode(destination));
    }

    private boolean hasPathBFS(Node source, Node destination) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(source);
        while(!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node.id == destination.id) { return true; }
            if(visited.contains(node.id)) { continue; }
            visited.add(node.id);
            for(Node child : source.adjacent) {
                nextToVisit.add(child);
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        for(Node node : nodeLookup.values()) {
            str += node.id + ": ";
            for(Node child : node.adjacent) {
                str += child.id + " ";
            }
            str += "\n";
        }
        return str;
    }

}

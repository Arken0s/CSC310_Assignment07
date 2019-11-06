import java.util.LinkedList;

class DFTGraph
{
    private LinkedList<Integer>[] adjLists;
    private int vertices;

    DFTGraph(int vertices) //Constructs Basic Graph based on vertices
    {
        this.vertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjLists[i] = new LinkedList();
    }

    void addEdge(int node, int child) //Adds a child edge to a node
    {
        adjLists[node].add(child);
    }

    void DFTBegin(int node) //Separated the two functions as it was easier to manage the boolean array this way.
    {
        boolean nodeVisited[] = new boolean[this.vertices]; //Used boolean array instead of setting a value to -1 as I felt it was cleaner.
        DFTRecursion(node, nodeVisited);
    }

    void DFTRecursion(int node, boolean[] nodeVisited)
    {
        nodeVisited[node] = true;
        System.out.println("Visiting node " + node + ".");
        for (int child : adjLists[node]) {
            if (!nodeVisited[child])
                DFTRecursion(child, nodeVisited);
        }
    }

    void PrintChildren() {
        for (int i = 0; i < adjLists.length; i++) {
            System.out.println(i + " has children nodes: " + adjLists[i]);
        }
    }

}

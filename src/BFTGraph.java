import java.util.LinkedList;

class BFTGraph
{
    private LinkedList<Integer>[] adjLists;
    private int vertices;

    BFTGraph(int vertices) //Constructs Basic Graph based on vertices
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

    void BFT(int node)
    {
        boolean[] nodeVisited = new boolean[vertices];
        LinkedList<Integer> bftQueue = new LinkedList<Integer>();

        nodeVisited[node]=true;
        bftQueue.add(node);

        while (bftQueue.size() != 0)
        {
            node = bftQueue.poll();
            System.out.println("Visiting node " + node + ".");
            for (int n : adjLists[node]) {
                if (!nodeVisited[n]) {
                    nodeVisited[n] = true;
                    bftQueue.add(n);
                }
            }
        }
    }

    void PrintChildren() {
        for (int i = 0; i < adjLists.length; i++) {
            System.out.println(i + " has children nodes: " + adjLists[i]);
        }
    }

}

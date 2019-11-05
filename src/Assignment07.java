class Assignment07 {

    public static void main(String[] args) {
        //Decided to build the DFS into a seperate class so it would be easier to manage
        //properties such as veritices, visisted status, and the LinkedLists.

        DFSGraph testGraph = new DFSGraph(7);

        testGraph.addEdge(0, 1);
        testGraph.addEdge(0,2);
        testGraph.addEdge(1,3);
        testGraph.addEdge(1,4);
        testGraph.addEdge(2,5);
        testGraph.addEdge(2,6);

        testGraph.DFSBegin(0);
    }

}
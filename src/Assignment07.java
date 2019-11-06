class Assignment07 {

    public static void main(String[] args) {
        //Decided to build the traversals into seperate classes so it would be easier to manage
        //properties such as veritices, visisted status, and the LinkedLists.
        System.out.println("DFT Test:");
        DFTGraph testDFTGraph = new DFTGraph(7);

        testDFTGraph.addEdge(0, 1);
        testDFTGraph.addEdge(0,2);
        testDFTGraph.addEdge(1,3);
        testDFTGraph.addEdge(1,4);
        testDFTGraph.addEdge(2,5);
        testDFTGraph.addEdge(2,6);

        testDFTGraph.DFTBegin(0);

        System.out.println("BFT Test:");
        BFTGraph testBFTGraph = new BFTGraph(7);

        testBFTGraph.addEdge(0, 1);
        testBFTGraph.addEdge(0,2);
        testBFTGraph.addEdge(1,3);
        testBFTGraph.addEdge(1,4);
        testBFTGraph.addEdge(2,5);
        testBFTGraph.addEdge(2,6);

        testBFTGraph.BFT(0);
    }

}
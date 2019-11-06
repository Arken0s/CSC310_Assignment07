// Jacob O'Bryan
// CSC 310 - Assignment 07

class Assignment07 {

    public static void main(String[] args) {
        //Decided to build the traversals into seperate classes so it would be easier to manage
        //properties such as veritices, visisted status, and the LinkedLists.

        System.out.println("********************************************");
        System.out.println("Question 1A");
        System.out.println("********************************************");

        TraversalGraph quest1A = new TraversalGraph(8);
        quest1A.addEdge(1,2);
        quest1A.addEdge(1,4);
        quest1A.addEdge(2,1);
        quest1A.addEdge(2,5);
        quest1A.addEdge(2,7);
        quest1A.addEdge(3,4);
        quest1A.addEdge(3,6);
        quest1A.addEdge(3,7);
        quest1A.addEdge(4,1);
        quest1A.addEdge(4,3);
        quest1A.addEdge(4,5);
        quest1A.addEdge(5,2);
        quest1A.addEdge(5,4);
        quest1A.addEdge(5,6);
        quest1A.addEdge(5,7);
        quest1A.addEdge(6,3);
        quest1A.addEdge(6,5);
        quest1A.addEdge(7,2);
        quest1A.addEdge(7,3);
        quest1A.addEdge(7,5);
        System.out.println("--Depth First Traversal Path--");
        quest1A.DFTBegin(1);
        System.out.println("--Breadth First Traversal Path--");
        quest1A.BFT(1);
//      ******************************************
        System.out.println("********************************************");
        System.out.println("Question 1B");
        System.out.println("********************************************");

        TraversalGraph quest1B = new TraversalGraph(8);
        quest1B.addEdge(1,5);
        quest1B.addEdge(1,4);
        quest1B.addEdge(2,4);
        quest1B.addEdge(2,3);
        quest1B.addEdge(3,2);
        quest1B.addEdge(3,4);
        quest1B.addEdge(4,1);
        quest1B.addEdge(4,2);
        quest1B.addEdge(4,3);
        quest1B.addEdge(4,7);
        quest1B.addEdge(5,1);
        quest1B.addEdge(5,6);
        quest1B.addEdge(6,5);
        quest1B.addEdge(6,7);
        quest1B.addEdge(7,4);
        quest1B.addEdge(7,6);
        System.out.println("--Depth First Traversal Path--");
        quest1B.DFTBegin(1);
        System.out.println("--Breadth First Traversal Path--");
        quest1B.BFT(1);
//      ******************************************
        System.out.println("********************************************");
        System.out.println("Question 1C");
        System.out.println("********************************************");

        TraversalGraph quest1C = new TraversalGraph(8);
        quest1C.addEdge(1,2);
        quest1C.addEdge(1,4);
        quest1C.addEdge(1,5);
        quest1C.addEdge(2,3);
        quest1C.addEdge(2,4);
        quest1C.addEdge(2,7);
        quest1C.addEdge(3,4);
        quest1C.addEdge(4,6);
        quest1C.addEdge(4,7);
        quest1C.addEdge(5,4);
        quest1C.addEdge(6,5);
        quest1C.addEdge(7,6);
        System.out.println("--Depth First Traversal Path--");
        quest1C.DFTBegin(1);
        System.out.println("--Breadth First Traversal Path--");
        quest1C.BFT(1);
        //      ******************************************
        System.out.println("********************************************");
        System.out.println("Question 1D");
        System.out.println("********************************************");

        TraversalGraph quest1D = new TraversalGraph(8);
        quest1D.addEdge(1,2);
        quest1D.addEdge(1,4);
        quest1D.addEdge(1,5);
        quest1D.addEdge(2,3);
        quest1D.addEdge(3,7);
        quest1D.addEdge(4,2);
        quest1D.addEdge(4,3);
        quest1D.addEdge(4,6);
        quest1D.addEdge(4,7);
        quest1D.addEdge(5,4);
        quest1D.addEdge(6,7);
        System.out.println("--Depth First Traversal Path--");
        quest1D.DFTBegin(1);
        System.out.println("--Breadth First Traversal Path--");
        quest1D.BFT(1);
    }

}
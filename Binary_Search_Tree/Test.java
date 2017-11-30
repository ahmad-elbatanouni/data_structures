public class Test {
    public static void main(String[] args) {
        Binary_Search_Tree myTree = new Binary_Search_Tree();
        
        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(70);
        myTree.insert(25);
        myTree.insert(75);
        myTree.insert(35);
        myTree.insert(65);
        
        System.out.println("Max:");
        System.out.println(myTree.findMax());
        
        System.out.println("Min:");
        System.out.println(myTree.findMin());
    }
} 

 class Node {
    int data;
    Node right;
    Node left;
}

public class Binary_Search_Tree {

    Node root;

    Node find(int searchKey) {
        Node current = root;
        while (current.data != searchKey) {
            if (searchKey < current.data) 
                current = current.left;
            else 
                current = current.right;
            if (current == null)
                return null;
        }
        return current ;
    }
    
    void insert ( int data) {
        Node new_node = new Node();
        new_node.data = data;
        if ( root == null )
            root = new_node;
        else {
            Node current = root;
            Node parent;
            while ( true ) {
                parent = current;
                if ( data < current.data ) {
                    current = current.left;
                    if(current == null) {
                        parent.left= new_node;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right= new_node;
                        return;
                    }
                }
            }
        }
    }
    
    Node delete(int searchKey) {
        // to be added later
        return null;
    }
    
    int findMin ( ) {
        Node current = root;
        while ( current.left != null ) {
            current = current.left;
        }
        return current.data;
    }
    
    int findMax ( ) {
        Node current = root;
        while ( current.right != null ) {
            current = current.right;
        }
        return current.data;
    }
    
    
    


}

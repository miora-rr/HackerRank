public class LCA {
    public static Node lca(Node root, int v1, int v2) {
        Node node = root;
        while(node != null){
            if(v1 < node.data && v2 < node.data) node = node.left;
            else if(v1 > node.data && v2 > node.data) node = node.right;
            else return node;
        }

        return null;
    }
}

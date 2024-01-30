public class HuffmanDecode {
    void decode(String s, Node root) {
        Node currentNode = root;

        for (char c : s.toCharArray()) {
            currentNode = c == '0'? currentNode.left : currentNode.right;
            if (currentNode.left == null && currentNode.right == null) {
                System.out.print(currentNode.data);
                currentNode = root;
            }
        }
    }
}

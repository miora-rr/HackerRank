import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int type = scan.nextInt();
            if (type == 1) {  // append
                textEditor.append(scan.next());
            } else if (type == 2) {  // delete
                textEditor.delete(scan.nextInt());
            } else if (type == 3) { // print
                textEditor.print(scan.nextInt());
            } else if (type == 4) { // undo
                textEditor.undo();
            }
        }
        scan.close();
    }

    public static class TextEditor {
        private Stack<String> previous = new Stack<>();
        private StringBuilder s = new StringBuilder();

        public void append(String W) {
            previous.add(s.toString());
            s.append(W);
        }

        public void delete(int k) {
            previous.add(s.toString());
            s.delete(s.length()-k, s.length());
        }

        public void print(int k) {
            System.out.println(s.charAt(k-1));
        }

        private void undo() {
            s = new StringBuilder(previous.pop());
        }
    }
}

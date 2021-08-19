import javax.swing.tree.TreeNode;
import java.util.Stack;

//class TreeNodes {
//int val = 0;
//TreeNode left = null;
//TreeNode right = null;
//public TreeNodes(int val) {
//this.val = val;
//}
//}

public class Test8_18_2 {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if(minStack.isEmpty() || node < min()){
            minStack.push(node);
        }else{
            minStack.push(min());
        }
        dataStack.push(node);
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null){
            return null;
        }
        if(pRoot.left == null && pRoot.right == null){
            return pRoot;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        if(pRoot.left != null){
            Mirror(pRoot.left);
        }
        if(pRoot.right != null){
            Mirror(pRoot.right);
        }
        return pRoot;
    }
}
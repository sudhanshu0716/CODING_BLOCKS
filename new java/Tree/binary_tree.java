import java.util.*;
public class binary_tree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public binary_tree()
    {
        root=CreateTree();
    }
    Scanner sc=new Scanner(System.in);
    private Node CreateTree()
    {
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if(hlc)
        {
            nn.left=CreateTree();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc)
        {
            nn.right=CreateTree();
        }
        return nn;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String s="";
        s="<--"+node.val+"-->";
        if(root.left!=null){
            s=node.left.val+s;
        }
        else{
            s="."+s;
        }
        if(root.right!=null){
            s=node.right.val+s;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }

}
//package _11_java_collection_framework.baitap.binary_tree_optional;
//
//public class BinarySearchTree {
//    Node root;
//
//    public BinarySearchTree() {
//        root = null;
//    }
//
//    public Node addRoot(Node newKey, int key) {
//        if (root==null){
//            root=new Node(key);
//            return root;
//        }else if(key<root.key) {
//            return root.left = addRoot(root.left, key);
//        }else if(key>root.key){
//            return root.right=addRoot(root.right,key);
//        }
//        return root;
//    }
//    public void add(int key){
//        addRoot(root,key);
//    }
//    public void disPlayRoot(Node node){
//        if(node!=null){
//            disPlayRoot(node.left);
//            System.out.println(node.key);
//            disPlayRoot(node.right);
//        }
//    }
//    public void disPlay(){
//        disPlayRoot(root);
//    }
//
//    public static void main(String[] args) {
//        BinarySearchTree tree=new BinarySearchTree();
//        tree.add(10);
//        tree.add(20);
//        tree.add(15);
//        tree.add(5);
//        tree.disPlay();
//
//    }
//}

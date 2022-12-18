
public class BTree {

	Node root;
	public Tree() {
		root=null;
	}
	Node newNode(int data) {
		root=new Node(data);
		return root;
	}
	Node Insert(Node root,int data) {
		if(root!=null) {
			if(data<root.data) {
				root.left=Insert(root.left,data); // ???? kokten kucukse sola buyukse sola ekledık
			}
			else {
				root.right=Insert(root.right,data);
			}
			return root;
		}
	}
	
	
		void preOrder(Node root) {
			if(root!=null) {
				System.out.println(root.data + " ");
				preOrder(root.left); // ????
				preOrder(root.right);
			}
        	}
		void InOrder(Node root) {
			if(root!=null) {
				InOrder(root.left); // ????
				System.out.println(root.data + " ");
				InOrder(root.right);
			}
        	}
		void postOrder(Node root) {
			if(root!=null) {
				System.out.println(root.data + " ");
				postOrder(root.left); // ????
				postOrder(root.right);
			}
        	}
		
		int height(Node root) {
			if(root==null) {
				return -1; //return 0 deseydik,sadece kök varsa yukseklıgı 1 algılardı,-1 içi yukseklıgı 0 algılar sadece root varsa
			}
			else {
				int sol=0,sağ=0;
				
				sol=height(root.left);//???
				sağ=height(root.right);
				
				if(sol>sağ)
					return sol+1;//??
				else
					return sağ+1;
			}
		}
		
		int size(Node root) {
			if(root==null)
				return 0;
			else 
			{
				return size(root.left)+1+size(root.right);
			}
		}
		
		
		
}

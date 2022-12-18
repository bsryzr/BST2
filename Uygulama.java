
public class Uygulama {

	public static void main(String[] args) {
		
		BTree bst=new BTree(); // BTree sınıfından  bir agac olusturduk!!!! BTree classı ayrı bı sınıfta tanımlanır
		bst.root=bst.Insert(bst.root,10); // dataları ekleme
		bst.root=bst.Insert(bst.root,8);
		bst.root=bst.Insert(bst.root,15);
		bst.root=bst.Insert(bst.root,5);
		bst.root=bst.Insert(bst.root,12);
		bst.root=bst.Insert(bst.root,20);
		bst.root=bst.Insert(bst.root,9);
		
		/*System.out.println("kök:"+ bst.root.data);
		System.out.println("kök solu:"+ bst.root.left.data);
		System.out.println("kök sağı :"+ bst.root.right.data);*/ // bunları tek tek yazdırmaktansa preorder ınorder seklinde yazdırırız
		

		System.out.print("preOrder : ");
		bst.preOrder(bst.root); //bst nın preorderını calıstır dıyoruz ve bstnın rootunu da oarametre olarak gonderırız
		
		System.out.println();
		
		System.out.print("InOrder : ");
		bst.InOrder(bst.root);
		
		System.out.println();
		
		System.out.print("postOrder : ");
		bst.postOrder(bst.root);
		
		
		System.out.println("\nagacın yukseklıgı:"+ bst.height(bst.root));
		System.out.println("\nagac ustundeki eleman sayisi:"+ bst.height(bst.root));
	}

}

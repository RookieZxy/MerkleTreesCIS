import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List tempTxList = new ArrayList();
		tempTxList.add("a");
		tempTxList.add("b");
		tempTxList.add("c");
		tempTxList.add("d");
		tempTxList.add("e");

		MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
		merkleTrees.merkle_tree();
		System.out.println("root : " + merkleTrees.getRoot());
	}
}
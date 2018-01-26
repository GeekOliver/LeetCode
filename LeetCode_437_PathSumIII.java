/**
 * Created by oliverwang on 2018/1/26.
 */


public class LeetCode_437_PathSumIII {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int dfs(TreeNode root, int sum){
        int res = 0;
        if (root == null) return res;
        if (sum == root.val)
            res++;
        res += dfs(root.left, sum - root.val);
        res += dfs(root.right, sum - root.val);
        return res;
    }
}

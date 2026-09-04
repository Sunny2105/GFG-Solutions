class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ans = new ArrayList<>();

        int d = b * b - 4 * a * c;

        if (d < 0) {
            ans.add(-1);
            return ans;
        }

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);

        int root1 = (int)Math.floor(r1);
        int root2 = (int)Math.floor(r2);

        if (root1 > root2) {
            ans.add(root1);
            ans.add(root2);
        } else {
            ans.add(root2);
            ans.add(root1);
        }

        return ans;
        
    }
}
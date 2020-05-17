class FindContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0;
        int si = 0;
        while ( si < s.length && gi < g.length ){
            if ( g[gi] <= s[si] ){
                gi++;
            }
            si++;
        }
        return gi;
    }
}
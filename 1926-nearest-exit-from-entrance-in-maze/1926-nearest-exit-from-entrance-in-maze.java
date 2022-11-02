class Solution {
    public int nearestExit(char[][] m, int[] e) {
        int c=0;
        Queue<int[]> nm=new LinkedList<>();
        int a[][]={{0,1},{1,0},{-1,0},{0,-1}};
        nm.offer(e);
        boolean k[][]=new boolean[m.length][m[0].length];
        k[e[0]][e[1]]=true;
        while(!nm.isEmpty())
        {
            int p=nm.size();
            c++;
            for(int i=0;i<p;i++)
            {
                int f[]=nm.poll();
                for(int b[]:a)
                {
                    int x=b[0]+f[0];
                    int y=f[1]+b[1];
                    if(x<0||y<0||x>=m.length||y>=m[0].length)
                        continue;
                    else if(k[x][y]||m[x][y]=='+')
                        continue;
                    if(x==0||y==0||x==m.length-1||y==m[0].length-1)
                        return c;
                    nm.add(new int[]{x,y});
                    k[x][y]=true;
                }
            }
        }
        return -1;
    }
}
public double[] twoSum(int n) {
    //dp[i][j]����iöɫ�Ӻ�Ϊj�ĸ���
    double[][] dp=new double[n+1][6*n+1];
    double probability=1.0/6.0;
    //base��ʼ��
    for(int i=1;i<=6;i++) dp[1][i]=probability;
    for(int i=2;i<=n;i++){ //ö��ɫ��
        for(int j=i;j<=i*6;j++){ //ö�ٵ���
            for(int k=1;k<=j && k<=6;k++){ //ö�ٵ�ǰɫ�ӵĵ���
                dp[i][j]+=(probability*dp[i-1][j-k]);
            }
        }
    }
    double[] res=new double[5*n+1];//
    System.arraycopy(dp[n],n,res,0,res.length);
    return res;
}

���ߣ�resolmi
���ӣ�https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/solution/java-dong-tai-gui-hua-by-im1gw0/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������

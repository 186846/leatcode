package leetcode;


class Solution{
    public static int timerequire(int[] tickets,int k){
        //定义时间总合
        int ss=0;
        //定义数组的长度
        int n = tickets.length;
        boolean flag = true;
        while (flag){
            for (int i = 0;i<n;i++){
                if (tickets[i]!=0){
                    tickets[i]--;
                    ss++;
                }
                if (tickets[k] == 0){
                    flag = false;
                    break;
                }
            }

        }
        return ss;
    }

    //测试代码
    public static void main(String[] args) {
        int[] array = {3,2,1};
        int k = 1;
        int ss = timerequire(array,k);
        System.out.println(ss);
    }
}

package leetcode;


class Solution{
    public static int timerequire(int[] tickets,int k){
        //����ʱ���ܺ�
        int ss=0;
        //��������ĳ���
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

    //���Դ���
    public static void main(String[] args) {
        int[] array = {3,2,1};
        int k = 1;
        int ss = timerequire(array,k);
        System.out.println(ss);
    }
}

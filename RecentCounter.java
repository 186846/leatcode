package leetcode;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    List<Integer> list = new ArrayList<>();
    public int ping(int t) {
        list.add(t);
        int l = 0,r = list.size()-1;
        while(l<r){
            int m = r + l >> 1;
            if(list.get(m)<t-3000) l = m + 1;
            else r = m;
        }
        return list.size()-l;
    }
}

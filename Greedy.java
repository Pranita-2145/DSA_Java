import java.util.*;
class Greedy {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8};
        int end[] = {2,4,6,7,9}; // sorted by end time

        
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // first activity
        ans.add(0);
        int lastEnd = end[0];

        for(int i = 1; i < end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = " + maxAct);

        for(int i = 0; i < ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }
    }
}
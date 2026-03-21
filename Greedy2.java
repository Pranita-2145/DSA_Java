import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//Arrays not sorted according to end time
public class Greedy2 {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8};
        int end[] = {2,4,6,7,9}; // sorted by end time
        int activities [] [] = new int[start.length][3];
        for(int i=0; i<activities.length;i++){
            activities[i][0] =i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // first activity
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i < end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max activities = " + maxAct);

        for(int i = 0; i < ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }
}
}

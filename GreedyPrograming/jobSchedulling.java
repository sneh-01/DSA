package GreedyPrograming;
import java.util.*;

public class jobSchedulling {

    static class Job{
        int deadline;
        int profit;
        int id;//0,1,2

        public Job(int i , int d, int p){
            id = i;
            deadline = d;   
            profit = p; 
        }
    }
    
    public static void main(String[] args) {
        int jobsInfo[][]  = {{4,20}, {1,10}, {1,40}, {1,30}};
        
        ArrayList<Job> jobs = new ArrayList<Job>();

        for( int i =0; i<jobsInfo.length; i++ ){
            jobs.add(new Job(i , jobsInfo[i][0] , jobsInfo[i][1] ));
        }

        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<Integer>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
          
        // max jobs
        System.out.println("max jobs: " + seq.size());
        for(int i=0; i<seq.size(); i++){
                System.out.print(seq.get(i));
        }
        System.out.println( );





        

    }
}

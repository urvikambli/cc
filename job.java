import java.util.ArrayList;
import java.util.Collections;

class jobsc {
    char id;
    int deadline, profit;
    public jobsc() {}

    public jobsc(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;

    }

    void jobscheduler(ArrayList<jobsc> arr, int t){
        int n = arr.size();
        Collections.sort(arr, (a,b) -> b.profit - a.profit);

        boolean[] result = new boolean[t];

        char job[] = new char[t];

        for(int i = 0; i<n; i++){
            for(int j = Math.min((t-1), (arr.get(i).deadline-1)); j>=0; j--){
                if(result[j] == false){
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for(char a: job){
            System.out.print(a +" ");
        System.out.println();
        }


    }
    public static void main(String[] args) {
        ArrayList<jobsc> aa = new ArrayList<jobsc>();
        aa.add(new jobsc('a', 2,100));
        aa.add(new jobsc('b', 1,24));
        aa.add(new jobsc('c', 2,27));
        aa.add(new jobsc('d', 1,15));
        aa.add(new jobsc('e', 3,5));
        jobsc bb = new jobsc();
        bb.jobscheduler(aa, 3);


        
    }
    
}

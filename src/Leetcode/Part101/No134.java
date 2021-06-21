package Leetcode.Part101;

/**
 * <h3>leetcode</h3>
 * <p>加油站</p>
 *
 * @author : 张严
 * @date : 2021-04-18 16:37
 **/
public class No134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
       for(int i=0;i<n;i++){
            int sumGas = gas[i];
            int sumCost = cost[i];
            int j=(i+1)%n;
            while(sumGas>=sumCost&&j!=i){
                sumGas = gas[j]+sumGas;
                sumCost = cost[j]+sumCost;
                j = (j+1)%n;
            }
            if(j==i&&sumGas>=sumCost) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}

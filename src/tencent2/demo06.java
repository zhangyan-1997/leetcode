package tencent2;

public class demo06 {
    public static int get_index(String[] points){
        double x = 0;
        double y = 0;
        for (int i = 0; i < points.length; i++) {
            String[] split = points[i].split(",");
            x += Integer.parseInt(split[0]);
            y += Integer.parseInt(split[1]);
        }
        x /= points.length;
        y /= points.length;
        int res = points.length;
        double min_distance = Integer.MAX_VALUE;
        for (int i = points.length - 1; i >= 0; i--) {
            String[] split = points[i].split(",");
            double distance = Math.pow(Integer.parseInt(split[0])-x,2) + Math.pow(Integer.parseInt(split[1])-y,2);
            if(distance <= min_distance){
                min_distance = distance;
                res = i;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String[] points = {"1,1","2,2","3,3","2,2","1,1"};
        System.out.println(get_index(points));
    }

}

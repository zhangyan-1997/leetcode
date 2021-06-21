package ZJOffer;

public class Offer44 {
    public static int findNthDigit(int n) {
        if (n < 0) {
            return -1;
        }

        /*
            初始化 位数、当前位数的开始数字、当前位数的总数
        */
        int digit = 1;  // 位数
        long start = 1;  // 当前位数的开始数字
        long count = 9;  // 当前位数的总数
        /*
            计算目标数字 的 位数 和 余数
        */
        while (n > count) {
            n -= count; // 计算 剩余多少数字
            start *= 10;
            digit++;
            count = digit * start * 9;  // 计算 下一位数，新增的数字范围大小
        }
        long num = start + (n - 1) / digit; // 计算当前位数下，目标数字距离第一个数字的偏移量
        return Long.toString(num).charAt((n - 1) % digit) - '0';    // 计算结果
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(1000));
    }
}

package bishilianxi;

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] nums = new String[s.length()];
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=48 &&s.charAt(i)<= 57) {
                if (nums[count] == null) {
                    nums[count] = String.valueOf(s.charAt(i));
                } else {
                    nums[count] = nums[count] + s.charAt(i);
                }
            }else {
                count ++;
            }
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != null && nums[i].length()>max && nums[i].charAt(0) <=57){
                max = nums[i].length();
                count = i;
            }
        }
        if(nums[count] != null&&nums[count].charAt(0)>57){
            System.out.println("null");
            return ;
        }
        System.out.println(nums[count]);
    }
}
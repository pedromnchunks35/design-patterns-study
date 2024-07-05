package runner;

import java.util.ArrayList;
import java.util.List;
import debug.*;

public class Main {
    public static void sort(List<Integer>arr){
        boolean sorted=true;
        while(sorted){
            sorted=false;
            for(int i=0;i<arr.size()-1;i++){
                int a = arr.get(i);
                int b = arr.get(i+1);
                if(a<b){
                    arr.set(i,b);
                    arr.set(i+1,a);
                    sorted=true;
                }
            }
        }
    }
    public static boolean contains(int num,List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            if(num==arr.get(i)){
                return true;
            }
        }
        return false;
    }
    public static int thirdMax(int[] nums) {
        List<Integer> has_appeared=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(has_appeared.size()==3){
                break;
            }
            System.out.println(nums[i]);
            if(!contains(nums[i],has_appeared)){
                System.out.println(nums[i]);
                has_appeared.add(nums[i]);
            }
        }
        if(has_appeared.size()==1){
            return has_appeared.get(0);
        }
        if(has_appeared.size()<3){
            return has_appeared.get(0)>has_appeared.get(1)?has_appeared.get(0):has_appeared.get(1);
        }
        sort(has_appeared);
        System.out.println(has_appeared.get(1));
        return has_appeared.get(2);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,5,3,5};
        thirdMax(arr);
    }
}
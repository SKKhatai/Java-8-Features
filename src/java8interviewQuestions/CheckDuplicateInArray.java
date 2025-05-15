package java8interviewQuestions;

import java.util.Arrays;

public class CheckDuplicateInArray {
    public static void main(String[] args) {
        //int[] arr= {67,56,3,8,2,3,4,4,90};
        int[] arr={1,2,3,4};
        if(Arrays.stream(arr).distinct().count()!=arr.length){
            System.out.println("Array Contains Duplicate");
        }
        else{
            System.out.println("Array Does not contain Duplicate");
        }
    }
}

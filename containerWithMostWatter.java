public class containerWithMostWatter {
    public static void main(String[] args) {
        int[] a = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
       maxArea(a);
    }

    public static void maxArea(int[] height) {
int st = 0,las = height.length-1,max=0;
while (st<las) {
    if (height[st] < height[las]) {
        max = Math.max((las-st)*height[st], max);
        st++;
    }else{
        max = Math.max((las-st)*height[las], max);
        las--;
    }
}
     System.out.println(max);
}
// public static int maxArea(int[] height) {
//     int maxarea=0, firstPointer=0, secondPointer=height.length-1;
//    while (firstPointer<secondPointer){
//        if(height[firstPointer]<height[secondPointer]){
//            maxarea=Math.max(maxarea, height[firstPointer]*(secondPointer-firstPointer));
//            firstPointer++;
//        }
//       else{
//            maxarea=Math.max(maxarea, height[secondPointer]*(secondPointer-firstPointer));
//            secondPointer--;
//        }
//    }
//    return maxarea;
// }
}
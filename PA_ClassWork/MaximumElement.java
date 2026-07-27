class MaximumElement {
    static int maximum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,25,50,30};
        int ans = maximum(arr);
        System.out.println("maximum: "+ans);
        
    }
}

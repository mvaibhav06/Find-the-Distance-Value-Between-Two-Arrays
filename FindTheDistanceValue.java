class FindTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int out = 0;

        for(int i=0; i<arr1.length; i++){
            int j = 0;
            for(j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j]) <= d){
                    break;
                }
            }
            if(j == arr2.length){
                out++;
            }
        }
        return out;
    }
}

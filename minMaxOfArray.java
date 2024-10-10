public Pair<Long, Long> getMinMax(int[] arr) {
        long min = arr[0];
        long max= arr[0];
        
        
        for(int i = 1; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
            
        }
        
        return new Pair<>(min,max);
        
    }


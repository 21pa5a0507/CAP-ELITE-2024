public static List<Integer> countingSort(List<Integer> arr) {
        int max_value=Collections.max(arr);
        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<100;i++){
            arr1.add(0);
        }
        for(int i=0;i<arr.size();i++){
            arr1.set(arr.get(i),arr1.get(arr.get(i))+1);
        }
        return arr1;
    }

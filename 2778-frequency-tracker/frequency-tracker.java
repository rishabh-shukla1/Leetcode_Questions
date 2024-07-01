class FrequencyTracker {
    Map<Integer, Integer> frequencyTracker;
    int[] arr = new int[100001];

    public FrequencyTracker() {
        frequencyTracker = new HashMap<>();
    }
    
    public void add(int number) {
        if(frequencyTracker.containsKey(number)) {
            arr[frequencyTracker.get(number)]--;
        }
        frequencyTracker.put(number, frequencyTracker.getOrDefault(number, 0) + 1);
        arr[frequencyTracker.get(number)]++;
    }
    
    public void deleteOne(int number) {
        if(frequencyTracker.get(number) == null) {
            return;
        }
        
        arr[frequencyTracker.get(number)]--;
        frequencyTracker.put(number, frequencyTracker.getOrDefault(number, 0) - 1);
        if(frequencyTracker.get(number) != 0) {
            arr[frequencyTracker.get(number)]++;
        } else {
            frequencyTracker.remove(number);
        }  
    }
    
    public boolean hasFrequency(int frequency) {
        if(arr[frequency] > 0) {
            return true;
        }
        return false;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
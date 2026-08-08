
class TimeStampedValue {
    public int timestamp;
    public String value;

    public TimeStampedValue(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    private Map<String, ArrayList<TimeStampedValue>> entriesByKey;

    public TimeMap() {
        entriesByKey = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!entriesByKey.containsKey(key)) {
            entriesByKey.put(key, new ArrayList<>());
        }
        ArrayList<TimeStampedValue> timeStampedValues = entriesByKey.get(key);
        timeStampedValues.add(new TimeStampedValue(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!entriesByKey.containsKey(key)) {
            return "";
        }
        
        ArrayList<TimeStampedValue> timeStampedValues = entriesByKey.get(key);
        Optional<TimeStampedValue> timeStamp = binarySearchTimeStamp(timeStampedValues, timestamp);
        
        if (timeStamp.isEmpty()) {
            return "";
        }
        return timeStamp.get().value;
    }

    private Optional<TimeStampedValue> binarySearchTimeStamp(
        ArrayList<TimeStampedValue> arr, int target) {
        if (arr == null || arr.isEmpty()) {
            return Optional.empty();
        }

        int left = 0, right = arr.size() - 1;
        int matchIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            TimeStampedValue cur = arr.get(mid);
            if (cur.timestamp <= target) {
                matchIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (matchIndex == -1) {
            return Optional.empty();
        }
        return Optional.of(arr.get(matchIndex));
    }
}
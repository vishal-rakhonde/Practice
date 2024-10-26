class Solution {
    public int smallestChair(int[][] friendTimes, int targetFriendIndex) {
        TreeSet<Integer> availableSeats = new TreeSet<>();
        int nextSeat = 0;
        PriorityQueue<Pair<Integer, Integer>> occupiedSeats = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
        int targetFriendArrival = friendTimes[targetFriendIndex][0];
        
        // Sort based on arrival times
        Arrays.sort(friendTimes, (a, b) -> a[0] - b[0]);
        
        for (int[] time : friendTimes) {
            int arrivalTime = time[0], leaveTime = time[1];
            
            // Free up seats that are now available
            while (!occupiedSeats.isEmpty() && occupiedSeats.peek().getKey() <= arrivalTime) {
                int seatToFree = occupiedSeats.poll().getValue();
                availableSeats.add(seatToFree);
            }
            
            // Assign a seat to the current friend
            if (availableSeats.isEmpty()) {
                if (arrivalTime == targetFriendArrival) return nextSeat;
                occupiedSeats.add(new Pair<>(leaveTime, nextSeat++));
            } else {
                int seat = availableSeats.pollFirst();
                if (arrivalTime == targetFriendArrival) return seat;
                occupiedSeats.add(new Pair<>(leaveTime, seat));
            }
        }
        
        return -1;
    }
}

import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> carAndTime = new HashMap<>();
        Map<String, Integer> carAndTotalTime = new HashMap<>();
        
        for(String record : records) {
            String[] info = record.split(" ");
            String[] time = info[0].split(":");
            int hour = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            int curTime = hour * 60 + min;
            
            String car = info[1];
            String inAndOut = info[2];
            
            if(inAndOut.equals("IN")) {
                carAndTime.put(car, curTime);
            }else {
                int start = carAndTime.get(car);
                int parkingTime = curTime - start;
                carAndTotalTime.put(car, carAndTotalTime.getOrDefault(car, 0) + parkingTime);
                carAndTime.remove(car);
            }
        }
        
        //출차 안 한 차량
        int endTime = 23 * 60 + 59;
        for(String remainCar : carAndTime.keySet()) {
            int start = carAndTime.get(remainCar);
            int parkingTime = endTime - start;
            
            carAndTotalTime.put(remainCar, carAndTotalTime.getOrDefault(remainCar, 0) + parkingTime);
        }
        
        //차량번호 순서
        List<String> cars = new ArrayList<>(carAndTotalTime.keySet());
        Collections.sort(cars);
        
        int[] result = new int[cars.size()];
        for(int i = 0; i < result.length; i++) {
            int totalTime = carAndTotalTime.get(cars.get(i));
            
            result[i] = calculateFee(totalTime, fees);
        }
        return result;
        
    }
    
    private int calculateFee(int time, int[] fees) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if(time <= baseTime) return baseFee;
        return baseFee + (int)Math.ceil((time - baseTime) / (double) unitTime) * unitFee;
    }
}
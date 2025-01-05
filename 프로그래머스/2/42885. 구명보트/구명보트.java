import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int weight, answer = 0;
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        while (left <= right) {
            weight = people[right];
            right--;
            if (weight + people[left] <= limit) {
                left++;
            }
            answer++;
        }
        return answer;
    }
}
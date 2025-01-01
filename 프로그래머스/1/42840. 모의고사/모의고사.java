public class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5}; // 5개 반복
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8개 반복
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개 반복
        
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) scores[0]++;
            if (answers[i] == person2[i % person2.length]) scores[1]++;
            if (answers[i] == person3[i % person3.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        int count = 0;
        for (int score : scores) {
            if (score == maxScore) count++;
        }
        
        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer[index++] = i + 1;
            }
        }
        
        return answer;
    }
}

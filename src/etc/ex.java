package etc;

class ex {
    public int[] solution(int[] numbers, int num1, int num2) {
        //int 인덱스 자른 자리수 선언
        int[] answer = new int[num2-num1+1];
        int a = 0;
        // num1 부터 num2 까지 반복 돌려줌
        //
        for(int i = num1 ; i <= num2 ;i++){
            answer[a++] = numbers[i];
        }
        return answer;
    }
}
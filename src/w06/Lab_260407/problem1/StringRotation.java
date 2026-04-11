package w06.Lab_260407.problem1;

class StringRotation {
    public void rotateAndPrint(String str, int num) {
        int len = str.length();
        // 반복수 = 문자열 길이 / 회전수 (정수값)
        int count = len / Math.abs(num); // 음수, 양수 상관없이 이동칸수를 알기 위함.

        for (int i = 1; i <= count; i++) {
            int shift = (num * i) % len; // 몇 칸 밀어야 하는지 계산, 회전 단위(num)에 반복 횟수(i)를 곱해 전체 이동 거리 구함. 문자열 길이가 넘어가면 다시 처음으로 돌아오도록 나머지 연산 수행.
            if (shift < 0) { // 입력값이 음수일 때
                shift += len; // 음수 회전 = (길이- 이동칸수) 만큼 왼쪽으로 회전하는 것과 결과가 같으니까.
                // 7글자에서 오른쪽 1칸(-1)이면, 왼쪽으로 6칸(-1 + 7) 가는 것과 똑같은 모양이 됨.
            }
            String rotated = str.substring(shift) + str.substring(0, shift);
            System.out.println(rotated);
        }
    }
}

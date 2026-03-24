package w04.task260324.memo;

class Memo {
    // 필드 3개: private 접근 지정자, String 사용
    private String name;
    private String time;
    private String content;

    // 생성자 1개, 매개변수 3개
    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    // 메모 작성자가 같으면 true, 다르면 false 리턴
    public boolean isSameName(Memo other) {
        return this.name.equals(other.name);
    }

    // 메모 출력
    public void show() {
        System.out.println(name + ", " + time + " " + content);
    }

    // 메모 작성자 이름 리턴
    public String getName() {
        return name;
    }

    // 메모 텍스트의 길이 리턴
    public int length() {
        return content.length();
    }
}

package w03;

import java.util.Scanner;

class Song {
    String title; //노래제목
    String artist; //가수
    int year;
    String country;

    public Song() {
        title = "아무 노래";
        artist = "지코";
        year = 2020;
        country = "대한민국";
    }

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println("Song 정보: " + year+"년, " + country +" 국적의 " + artist + "가 부른 " + "\"" +title + "\"");

        //출력서식을 이용한 출력
        //System.out.printf("Song 정보: %d년,  %s 국적의 %s가 부른 \"%s\" \n",year, country, artist,title);
    }
}

public class SongMain {
    static void main() {
        //정수 1 입력
        Song dancingQueen = new Song();

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 1 입력");

        System.out.println("노래제목 가수 발표년도 국적 순서로 입력해주세요.");

        /*입력*/
        dancingQueen.title = sc.nextLine();
        dancingQueen.artist = sc.nextLine();
        dancingQueen.year = sc.nextInt();
        sc.nextLine(); // 이후 nextline을 위한 개행처리
        dancingQueen.country = sc.nextLine();

        dancingQueen.show(); //매개변수 입력 받은 값 출력

        //정수 2 입력
        System.out.println("정수 2 입력");
        Song Basic = new Song(); //매개변수 미입력시의 값 출력

        Basic.show();

    }
}

package com.mycom.word;

import java.util.Scanner;

public class WordManager { // test
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);

    }

    public int selectMenu() { // 메뉴 세팅
        System.out.print("*** 영단어 마스터 ***\n"
                + "********************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n" + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "********************\n"
                + "=> 원하는 메뉴는? ");
        return s.nextInt();
    }
    public void start() { // menu를 보여주고 commend를 입력받아 그에 따른 기능 실행하는 method
        wordCRUD.loadFile();
        while(true){
            int menu = selectMenu();
            System.out.println(menu);
            if(menu == 0) break; // 프로그램 종료: 0
            if(menu == 4){ // 단어 추가: 4
                wordCRUD.addItem();

            }
            else if(menu == 1){ // 모든 단어보기: 1
                wordCRUD.listAll();

            }
            else if(menu == 2){ // 수준별 단어보기: 2
                wordCRUD.searchLevel();

            }
            else if(menu == 3){ // 단어 검색: 3
                wordCRUD.searchWord();

            }
            else if(menu == 5){ // 단어 수정: 5
                wordCRUD.updateItem();

            }
            else if(menu == 6){ // 단어 삭제: 6
                wordCRUD.deleteItem();

            }
            else if(menu == 7){ // 파일 저장: 7
                wordCRUD.saveFile();
            }

        }

    }
}

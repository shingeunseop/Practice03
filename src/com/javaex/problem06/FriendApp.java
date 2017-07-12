package com.javaex.problem06;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Friend> flist=new ArrayList<Friend>();

        System.out.println("친구를 3명 등록해 주세요");
        for(int i=0;i<3;i++) {
        String str=sc.nextLine();
        String[] div=str.split(" ");
        
        Friend friendArray=new Friend(div[0],div[1],div[2]);
        flist.add(friendArray);
        }
        for(int j=0;j<3;j++) {
        System.out.println("이름:"+flist.get(j).getName()
        		+" 핸드폰:"+flist.get(j).getHp()
        		+" 학교:"+flist.get(j).getSchool());
        }
        	// 친구정보 입력받기
        	
       
            // 입력받은 친구정보를 공백으로 분리
            // Friend 객체 생성하여 데이터 넣기
           // 배열에 추가하기
        
        // 친구정보 출력
       

        sc.close();
    }

}

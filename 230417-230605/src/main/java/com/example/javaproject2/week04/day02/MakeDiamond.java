package com.example.javaproject2.week04.day02;

public class MakeDiamond {
    public String spaceChar;
    public int height;

    public MakeDiamond(String spaceChar, int height){
        //클래스와 이름이 같은 메소드, new 할때 실행됨 , 매개변수로 값을 입력받을수있음
        this.spaceChar = spaceChar;
        this.height = height;
    }

    public static void main(String[] args) {

        MakeDiamond md = new MakeDiamond(" ",5);
        md.printPyramid();
        md.printRevPyramid();

        MakeDiamond md2 = new MakeDiamond("-",5);
        md2.printPyramid();
        md2.printRevPyramid();
    }



    public String makePyramidLine(int i){
        return String.format("%s%s%s\n",spaceChar.repeat(height-1-i),"*".repeat(2*i+1),spaceChar.repeat(height-1-i));
    }


    public void printPyramid(){
        //정 피라미드 구조. repeat 메서드 사용
        for (int i = 0; i < height; i++) {
            System.out.print(makePyramidLine(i));
        }
    }

//    public String makeRevPyramidLine(int j){
//        return String.format("%s%s%s\n",spaceChar);
//    }
    public void printRevPyramid(){
        //역 피라미드 구조. 이중 포문 사용
        for (int i = height-1; i > 0 ; i--) {
            //공백
            for (int j = 0; j < height-i; j++) {
                System.out.print(spaceChar);
            }
            for (int j = 2*i-1; j > 0 ; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < height-i; j++) {
                System.out.print(spaceChar);
            }
            System.out.println();
        }
    }
    //생성자를 사용하는 이유
    //멤버변수를 바꾸기 위함이다.
    //소스코드를 수정하지 않고 클래스에 변화를 주기위해
    //메소드의 기능이 많으면 > 확장시 불리하기 때문에, 기능을 분리시켜줌
    //분리시켜주는 과정에 생성자를 사용하지 않으면 메소드에 줄 파라미터 개수가 많아져 헷갈려서 생성자 사용
}

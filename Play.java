package Second_Renju;

import java.util.Scanner;

public class Play {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		Admin tom = new Admin();
		Admin jerry = new Admin();
		int a ;
		int b ;
		String Piece;
		Go go = new Go();
		System.out.println("这是游戏棋盘");
		go.showInfo();
		System.out.println();
		System.out.println("玩家一执手“O”");
		System.out.println("玩家一执手“X”");
		do{
//			try{
			do{
				System.out.println("*********************************");
				System.out.print("玩家一请输入要下的棋子位置：");
				a = input.nextInt();
				b = input.nextInt();
				Piece = tom.getUSER1();
				if((a>Board.SIZE||a<1)&&(b>Board.SIZE||b<1)){
					System.out.println("你的输入有误。");
				}else{
					
				
				if(go.ValPiece(a-1, b-1)==false){
					System.out.println("输入的坐标已存在棋子。");
					
				}else{
					go.ChangeBoard(a-1,b-1 , Piece);
					go.showgo();
					System.out.println();
					System.out.println("玩家一下的坐标是["+a+","+b+"]");
					if(go.ValPlay1()==true){
						System.out.println("玩家一获胜");
						System.exit(0);
					}
					break;
				}
				}
			}while(true);
			do{
				System.out.print("玩家二请输入要下的棋子位置：");
				a = input.nextInt();
				b = input.nextInt();
				Piece = jerry.getUSER2();
				if((a>Board.SIZE||a<1)&&(b>Board.SIZE||b<1)){
					System.out.println("你的输入有误。");
				}else{
				if(go.ValPiece(a-1, b-1)==false){
					System.out.println("输入的坐标已存在棋子。");
					
				}else{
					go.ChangeBoard(a-1,b-1 , Piece);
					go.showgo();
					System.out.println();
					System.out.println("玩家二下的坐标是["+a+","+b+"]");
					if(go.ValPlay2()==true){
						System.out.println("玩家二获胜");
						System.exit(0);
					}
					break;
				}
				}
			}while(true);
//			}catch(Exception e){
//				System.out.println("输入有误，请重新输入。");
//			}
		}while(true);
		
	}
}

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
		System.out.println("������Ϸ����");
		go.showInfo();
		System.out.println();
		System.out.println("���һִ�֡�O��");
		System.out.println("���һִ�֡�X��");
		do{
//			try{
			do{
				System.out.println("*********************************");
				System.out.print("���һ������Ҫ�µ�����λ�ã�");
				a = input.nextInt();
				b = input.nextInt();
				Piece = tom.getUSER1();
				if((a>Board.SIZE||a<1)&&(b>Board.SIZE||b<1)){
					System.out.println("�����������");
				}else{
					
				
				if(go.ValPiece(a-1, b-1)==false){
					System.out.println("����������Ѵ������ӡ�");
					
				}else{
					go.ChangeBoard(a-1,b-1 , Piece);
					go.showgo();
					System.out.println();
					System.out.println("���һ�µ�������["+a+","+b+"]");
					if(go.ValPlay1()==true){
						System.out.println("���һ��ʤ");
						System.exit(0);
					}
					break;
				}
				}
			}while(true);
			do{
				System.out.print("��Ҷ�������Ҫ�µ�����λ�ã�");
				a = input.nextInt();
				b = input.nextInt();
				Piece = jerry.getUSER2();
				if((a>Board.SIZE||a<1)&&(b>Board.SIZE||b<1)){
					System.out.println("�����������");
				}else{
				if(go.ValPiece(a-1, b-1)==false){
					System.out.println("����������Ѵ������ӡ�");
					
				}else{
					go.ChangeBoard(a-1,b-1 , Piece);
					go.showgo();
					System.out.println();
					System.out.println("��Ҷ��µ�������["+a+","+b+"]");
					if(go.ValPlay2()==true){
						System.out.println("��Ҷ���ʤ");
						System.exit(0);
					}
					break;
				}
				}
			}while(true);
//			}catch(Exception e){
//				System.out.println("�����������������롣");
//			}
		}while(true);
		
	}
}

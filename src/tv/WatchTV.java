package tv;

import java.util.Scanner;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);  	
		Scanner sc = new Scanner(System.in);

		tv.power( true );
		while(true) {
			tv.status();
			System.out.println("1. 채널 선택");
			System.out.println("2. 채널 위로");
			System.out.println("3. 채널 아래로");
			System.out.println("4. 볼륨 선택");
			System.out.println("5. 볼륨 위로");
			System.out.println("6. 볼륨 아래로");
			System.out.println("0. 전원 off");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			int val;
			
			if(select==0) {
				tv.power(false);
				break;
			} else if(select==1) {
				System.out.print("채널(1~255) : ");
				val = sc.nextInt();
				if(val>=1 && val<=255)
					tv.channel(val);
				else
					System.out.println("잘못된 값 입력");
				continue;
			} else if(select==4) {
				System.out.print("볼륨(0~100) : ");
				val = sc.nextInt();
				if(val>=0 && val<=100)
					tv.channel(val);
				else
					System.out.println("잘못된 값 입력");
				tv.volume(val);
				continue;
			}
			
			switch (select) {
				case 2: {
					tv.channel(true);
					continue;
				}
				case 3: {
					tv.channel(false);
					continue;
				}
				case 5: {
					tv.volume(true);
					continue;
				}
				case 6: {
					tv.volume(true);
					continue;
				}
			}
		}
		sc.close();
	}
}

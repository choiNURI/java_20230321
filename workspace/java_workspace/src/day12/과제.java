package day12;


public class 과제 {

	public static void main(String[] args) {
	
		/* TV의 채널은 0~10까지 있음. 
		 * vol 0~20까지 있음. 0이되면 음소거라고 출력
		 * vol 0이하로 내려가지 않음. 20이상 올라가지 않음
		 * 모든 기능은 power가  On일때만 작동
		 * */
		
	Tv t = new Tv();
	t.powerOff();
	t.powerOn();
	t.channelUp();
	t.channelUp();
	t.channelUp();
	t.channelDown();
	t.channelDown();
	t.volUp();
	t.volDown();
	t.powerOff();
	t.channelDown();
	t.volUp();
	t.volDown();
	t.powerOn();
	t.volDown();
	t.volDown();


	}

 }

interface Remocon{ 
	void powerOn();
	void powerOff();
	
	void channelUp(); 
	void channelDown(); 
	
	void volUp(); 
	void volDown(); 
 }


 class Tv implements Remocon{
	 
	private boolean power;
	private int ch;
	private int vol;

	
	public void powerOn() {	
		System.out.println("TV가 켜졌습니다.");
		power = true;			
	}


	public void powerOff() {
		System.out.println("TV가 꺼졌습니다.");
		power = false;		
	}

	

	public void channelUp() {
		
		if(power) {
			ch++;
			if(ch>10) {
				ch=0;
			}
			System.out.println("채널 : " + ch);
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}
//		if(power==false) {
//			System.out.println("TV가 꺼져있습니다. TV를 켜주세요.");
//		}
//		 else{ 
//			ch++;
//			System.out.println("현재 채널은 "+ch);
//		 }
//		if(ch>=10) {
//			ch=0;
//		System.out.println("현재 채널은 "+ch);
//		}		
	


	@Override
	public void channelDown() {
		if(power) {
			ch--;
			if(ch<0) {
				ch=10;
			}
			System.out.println("채널 : " + ch);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
		
	}
//	if(power==false) {
//		System.out.println("TV가 꺼져있습니다. TV를 켜주세요.");
//	}
//	else{ 
//		ch--;
//		System.out.println("현재 채널은 "+ch);
//	}
//	if(ch<=0) {
//		ch=10;
//		System.out.println("현재 채널은 "+ch);
//	}		


	
	@Override
	public void volUp() {
		if(power) {
			vol++;
			if(vol>20) {
				vol=20;
			}
			System.out.println("볼륨 : " + vol);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
	}
//		if(vol>=20) {
//			System.out.println("최대 음량은 20입니다.");
//		}else{
//			
//			System.out.println("현재 음량은 "+vol);
//			vol++;
//			
//		}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
			}
			System.out.println("볼륨 : " + vol);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
		
			
		}	
//		if(vol<=0) {
//			System.out.println("음소거모드ON");
//			
//		}else {
//		
//		System.out.println("현재 음량은 "+vol);
//		vol--;
//		}
	
 
 }


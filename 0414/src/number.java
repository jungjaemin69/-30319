import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지");
		int check=0;
		int num=sc.nextInt();
		for(int i = 1 ; i < 50 ; i++) {
			int rand = (int)(Math.random()*50+1);

			int []arr=new int[10];
		for(int a=0; a<10; a++){
			arr[a]=(int)(Math.random()*50+1);
			System.out.println(arr[a]+" ");
		}
		System.out.println();
			System.out.println("꽝! 다음기회에~");
			
		}
	}

}
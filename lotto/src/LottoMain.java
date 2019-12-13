import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoMain {
	// �������� ����
	private int command=0;
	
	private BufferedReader in;
	private LottoPro program = null;
	
	//CODE ��
	public final int RECOMMANDATION_NUMBER=1;
	public final int PRINT_NUMBER=2;
	public final int EXIT=3;
	
	public LottoMain() {		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		program=new LottoPro(true);
		program=new LottoPro(false);
		program=new LottoPro();
		
		start();
		
	}

	public void start() {
		int n=1;
		System.out.println("�ζ� ���α׷��� ���۵˴ϴ�.");
		for(int i=1; i<11; i++) {
			System.out.println(i*10+"%");
			if(i==10)
				System.out.println("ȯ���մϴ�!!");
		}
		System.out.println();
		while(true) {
			System.out.println("��"+n+"ȸ�� �ζ� ");
			System.out.println("----------MENU----------");
			System.out.println("1.��÷        2.����       3.������");
			System.out.println("------------------------");
			System.out.print(">>");
			try {
				this.command = Integer.parseInt(in.readLine());
		
			}catch(IOException e) {
				System.out.println("(System)IOException !! try again..");
				continue;
			}
			switch(this.command) {
			case RECOMMANDATION_NUMBER:
				program.start_recommandation();
				break;
			case PRINT_NUMBER:
				program.printNumber();
				n++;
				break;
			case EXIT:
				System.out.println("������ �� ������~~!");
				return;
			}
		}
	}
	
	public static void main(String[] ar) {
		new LottoMain();
	}
}
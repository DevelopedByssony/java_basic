package interface1;

// �������̽� ����(����� �ƴ�!) �ϱ� ���ؼ���
// extends ��ſ� implements�� ����մϴ�.
// �������̽� ������ �߻�޼���� ������ ���� �����ؾ� �մϴ�.
public class Car implements Vehicle {
	// �ڵ������ ������ �ϴ� ���� ����
	// ���� �ӵ�, ���� ���ᷮ, ����
	private int Speed;
	private int fuelLevel;
	private String Owner;
	
	// �����ڸ� ������ּ���. ���ָ� �Է¹ް�
	// ������ ��Ҵ� ����ӵ� 0, ���ᷮ 100�� �ڵ����� �������ּ���.
	public Car(String Owner) {
		this.Owner = Owner;
		this.Speed = CAR_MIN_SPEED;
		this.fuelLevel = CAR_MAX_GAS;
	}
		
	@Override
	public void accel() {
		// �� �� ���ӽ� �ӵ��� 10�� �þ���� ���ּ���.
		// ����� �� �� ���ӿ� 1�� �Һ��մϴ�.
		// ��, �ӵ��� 200�� �ʰ��� �� �����ϴ�.
		
		/// ------------------------------------------
		/// :) ������ �ڵ�
		if(Speed + CAR_ACCELERATE > CAR_MAX_SPEED) {
			Speed = CAR_MAX_SPEED;
		} else {
			Speed += CAR_ACCELERATE;
		}
		fuelLevel -= CAR_DECREASE_GAS;
		
		/// :) �� �ڵ�
		/// if (this.Speed <= 200) { 
		/// this.Speed += 10;
		/// this.fuelLevel -= 1; }
		/// ------------------------------------------
		
		/// :) ��°� ��ȸ
		/// System.out.println(this.Speed);
		/// System.out.println(this.fuelLevel);
	}

	@Override
	public void breakSpeed() {
		// �� �� ���ӽ� �ӵ��� 10�� �پ�鵵�� ���ּ���
		// �� �ӵ��� 0 �̸��� �� �� �����ϴ�.
		if(Speed - CAR_REDUCE < 0) {
			Speed = 0;
		} else {
			Speed -= CAR_REDUCE;
		}
		System.out.println(this.Speed);
	}

	@Override
	public void reFuel() {
		// ����� �ٽ� ä�ﶧ���� 30�� ä���ݴϴ�.
		// ���� �ִ뷮�� 70L�� �����ϰ� 70���� �����մϴ�.
		if(fuelLevel + CAR_FILL > CAR_MAX_GAS) {
			fuelLevel = CAR_MAX_GAS;
		} else {
			fuelLevel += CAR_FILL;
		}
		System.out.println(this.fuelLevel);
	}

	@Override
	public void showStatus() {
		// �ڵ����� �ӵ�, ���ᷮ, ���ְ� ������ �������� ���ݴϴ�.
		System.out.println("�ӵ�" + this.Speed);
		System.out.println("���ᷮ" + this.fuelLevel);
		System.out.println("����" + this.Owner);
		System.out.println("-----------------");
		
	}	
	}
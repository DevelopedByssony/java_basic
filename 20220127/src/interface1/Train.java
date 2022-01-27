package interface1;

// Vehicle�� �����ϱ� ���� implements�� Ȱ���մϴ�.
public class Train implements Vehicle {
	
	// �ӵ�, ���ᷮ, �������� �����մϴ�.
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = TRAIN_MIN_SPEED;
		this.gas = TRAIN_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {		
		if (speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPEED) {
			speed = TRAIN_MIN_SPEED;
		}
	}

	@Override
	public void breakSpeed() {
		if (speed + TRAIN_DECREASE_SPD < TRAIN_MIN_SPEED) {
			
		}
		
	}

	@Override
	public void reFuel() {
		if (gas + TRAIN_REFUEL_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		} else {
			gas += TRAIN_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		
	}
		
}
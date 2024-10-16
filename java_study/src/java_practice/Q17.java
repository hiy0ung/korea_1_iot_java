package java_practice;

//Computer 클래스
class Computer {
 // 필드 선언
 private String processor;          // 필수
 private int ram;                   // 필수
 private int storage;               // 필수
 private String graphicsCard;       // 선택적
 private boolean isBluetoothEnabled;// 선택적
 private boolean isWifiEnabled;     // 선택적

 // private 생성자: 빌더 클래스만 접근 가능
 private Computer(Builder builder) {
     this.processor = builder.processor;
     this.ram = builder.ram;
     this.storage = builder.storage;
     this.graphicsCard = builder.graphicsCard;
     this.isBluetoothEnabled = builder.isBluetoothEnabled;
     this.isWifiEnabled = builder.isWifiEnabled;
 }

 // 필드 출력 메서드
 public void printSpecs() {
     System.out.println("Computer Specifications:");
     System.out.println("Processor: " + processor);
     System.out.println("RAM: " + ram + "GB");
     System.out.println("Storage: " + storage + "GB");
     System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "None"));
     System.out.println("Bluetooth Enabled: " + (isBluetoothEnabled ? "Yes" : "No"));
     System.out.println("Wi-Fi Enabled: " + (isWifiEnabled ? "Yes" : "No"));
 }


 // Builder 클래스
 public static class Builder {
     // 필수 필드
     private String processor;
     private int ram;
     private int storage;

     // 선택 필드 (기본값 설정)
     private String graphicsCard = null;
     private boolean isBluetoothEnabled = false;
     private boolean isWifiEnabled = false;

     // 생성자: 필수 필드 초기화
     public Builder(String processor, int ram, int storage) {
         this.processor = processor;
         this.ram = ram;
         this.storage = storage;
     }

     // 선택 필드 설정 메서드
     public Builder setGraphicsCard(String graphicsCard) {
         this.graphicsCard = graphicsCard;
         return this; // 메서드 체이닝을 위해 반환
     }

     public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
         this.isBluetoothEnabled = isBluetoothEnabled;
         return this;
     }

     public Builder setWifiEnabled(boolean isWifiEnabled) {
         this.isWifiEnabled = isWifiEnabled;
         return this;
     }

     // Computer 객체 생성 메서드
     public Computer build() {
         return new Computer(this);
     }
}
}
public class Q17 {
	
	// Main 클래스
	public static void main(String[] args) {
		// Computer 객체 생성 (필수 필드만 설정)
		Computer basicComputer = new Computer.Builder("Intel i5", 8, 256)
				.build();
		
		// Computer 객체 생성 (선택 필드 포함)
		Computer advancedComputer = new Computer.Builder("Intel i9", 16, 512)
				.setGraphicsCard("NVIDIA RTX 3080")
				.setBluetoothEnabled(true)
				.setWifiEnabled(true)
				.build();
		
		// 출력
		basicComputer.printSpecs();
		System.out.println("------------------------------");
		advancedComputer.printSpecs();
	}
}


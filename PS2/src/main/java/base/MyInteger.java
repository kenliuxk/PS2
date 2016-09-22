package base;

public class MyInteger {
	
	int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue % 2 == 0);{
			return true;
		} 
	}
	
	public boolean isOdd(){
		if (iValue % 2 == 1);{
			return true;
		}
	}
	
	public boolean isPrime(){
		if (iValue > 2){
			for (int i =2; i <= iValue/2; i++){
				if (iValue % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(int Value){
		if (Value % 2 == 0);{
			return true;
		}
	}
	
	public static boolean isOdd(int Value){
		if (Value % 2 == 1);{
			return true;
		}
	}
	
	public static boolean isPrime(int Value){
		if (Value > 2){
			for (int i =2; i <= Value/2; i++){
				if (Value % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n){
		if (n.iValue % 2 == 0);{
			return true;
		}
	}
	
	public static boolean isOdd(MyInteger n){
		if (n.iValue % 2 == 1);{
			return true;
		}
	}
	
	public static boolean isPrime(MyInteger n){
		if (n.iValue > 2){
			for (int i =2; i <= n.iValue/2; i++){
				if (n.iValue % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean equals(int Value){
		if (iValue == Value){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger n){
		if (iValue == n.iValue){
			return true;
		}
		return false;
	}

	

}

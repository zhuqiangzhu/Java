class Fraction{
	int numerator;

	int denominator;

	double toDouble(){
		return (double)numerator / denominator;
	}

	Fraction plus(Fraction r){
		Fraction s = new Fraction();
		s.denominator = denominator * r.denominator;
		s.numerator = numerator * r.denominator + denominator * r.numerator;
		return s;
	}

	Fraction multiply(Fraction r){
		r.numerator *= numerator;
		r.denominator *= denominator;
		return r;
	}
	//求m,n最大公约数
	int gcd(int m, int n){
		int min = m < n ? m : n;
		for(int i = min; i >= 1; i--){
			if(m % i == 0 && n % i == 0){
				return i;
			}
		}
		return -1;
	}

	void print(){
		int h = gcd(numerator, denominator);
		numerator = numerator / h;
		denominator = denominator / h;
		if(numerator % denominator == 0){
			System.out.println(numerator / denominator);
		}else{
			System.out.println(""+numerator+"/"+denominator);
		}
	}

}

class Frac{
	public static void main(String[] args) {
		Fraction fraction = new Fraction();
		fraction.numerator = 2;
		fraction.denominator = 4;
		System.out.println(fraction.toDouble());
		fraction.print();
	}
}
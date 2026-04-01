class load{
	void show(int a, int b){
		System.out.println(a+b);
	}

	void show(int a){
		System.out.println(a);	
	}
}

class iLoad{
	public static void main(String[] args){
		load l1=new load();
		l1.show(2,3);
		l1.show(2);
		l1.show(2,6);
	}
}
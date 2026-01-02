class Relationop{
	public static void main(String[] args){
		int a=2;
		int b=1;
		int c=5;
		int d=9;
		System.out.println(a+"<"+b+"="+(a<b));
		System.out.println(c+">"+d+"="+(c>d));
		System.out.println(a+"<="+b+"="+(a<=b));
		System.out.println(c+">="+d+"="+(c>=d));
		System.out.println(a+"!="+b+"="+(a!=b));
		System.out.println(c+"=="+d+"="+(c==d));
		System.out.println(a+"%"+b+"="+a%b);
		System.out.println(a+"++"+"="+ ++a);
		System.out.println(a+"--"+"="+ --a);
		System.out.println("(c > 0) && (b <0) = " + ((c>0) && (b<0)));
		System.out.println("(c> 0) || (d == 0) = " + ((c>0) || (d==0)));
		System.out.println("!(a ==1) && (b > 0) = " + (!(a==1) && (b>0)));
	}
}
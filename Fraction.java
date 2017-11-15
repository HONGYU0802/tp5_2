package tp5_2;

public class Fraction {
	private int numerateur;//分子
	private int denominateur;//分母
	
	public Fraction(int numerateur,int denominateur){//构造函数有分子，分母
		this.numerateur=numerateur;
		this.denominateur=denominateur;
	}
	
	public Fraction(int numerateur){//构造函数只有分子，默认分母是1
		this.numerateur=numerateur;
		denominateur=1;
	}
	
	public Fraction(){//空构造函数，分子为0，分母为1
		this.numerateur=0;
		this.denominateur=1;
	}
	
	public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
	
	public int getdenominateur(){//返回整型分母
		return denominateur;
	}
	
	public int getnumerateur(){//返回整型分子
		return numerateur;
	}
	
	
	public double todouble(){//返回小数型
		return (double)numerateur/(double)denominateur;
	}

	public void add(Fraction f){//加法
		int d=f.denominateur;
		int n=f.numerateur;
		if(d==denominateur)
		{
			numerateur+=n;
		}
		else
		{
			numerateur=numerateur*d;
			d=d*denominateur;
			n=n*denominateur;
			denominateur=d;
			numerateur+=n;
		}
		
	}
	
	public boolean equal(Fraction f){//判断相等
		if(f.todouble()==this.todouble()){
			return true;
		}
		return false;
			
	}

	public String toString(){//转换成字符串
		return Integer.toString(numerateur)+'/'+Integer.toString(denominateur);
	}

	public int comparaison(Fraction f){//比较
		double valeur=f.todouble()-this.todouble();
		if(valeur>0){
			return -1;
		}
		else if(valeur==0){
			return 0;
		}
		else{
			return 1;
		}
	}
}
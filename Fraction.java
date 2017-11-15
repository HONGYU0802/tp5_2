package tp5_2;

public class Fraction {
	private int numerateur;//����
	private int denominateur;//��ĸ
	
	public Fraction(int numerateur,int denominateur){//���캯���з��ӣ���ĸ
		this.numerateur=numerateur;
		this.denominateur=denominateur;
	}
	
	public Fraction(int numerateur){//���캯��ֻ�з��ӣ�Ĭ�Ϸ�ĸ��1
		this.numerateur=numerateur;
		denominateur=1;
	}
	
	public Fraction(){//�չ��캯��������Ϊ0����ĸΪ1
		this.numerateur=0;
		this.denominateur=1;
	}
	
	public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
	
	public int getdenominateur(){//�������ͷ�ĸ
		return denominateur;
	}
	
	public int getnumerateur(){//�������ͷ���
		return numerateur;
	}
	
	
	public double todouble(){//����С����
		return (double)numerateur/(double)denominateur;
	}

	public void add(Fraction f){//�ӷ�
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
	
	public boolean equal(Fraction f){//�ж����
		if(f.todouble()==this.todouble()){
			return true;
		}
		return false;
			
	}

	public String toString(){//ת�����ַ���
		return Integer.toString(numerateur)+'/'+Integer.toString(denominateur);
	}

	public int comparaison(Fraction f){//�Ƚ�
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
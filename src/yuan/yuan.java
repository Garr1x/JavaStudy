package yuan;

public class yuan {
	public static void main(String arg[]) {
		int a,b,c,d,e,f,g,h;//a=100Ԫ��b=50Ԫ����������������h=0.1Ԫ��
		for(a=0;a<1;a++)
			for(b=0;b<2;b++)
				for(c=0;c<5;c++)
					for(d=0;d<10;d++)
						for(e=0;e<20;e++)
							for(f=0;f<100;f++)
								for(g=0;g<100;g++)
									for(h=0;h<100;h++)
									{
										if(a+b+c+d+e+f+g+h==100 && a*100+b*50+c*20+d*10+e*5+f*1+g*0.5+h*0.1==100)
										{
											System.out.println(a + " ��100+ " + b + " ��50+ " + c + " ��20+ " + d + " ��10+ "
																+ e + " ��5+ " + f +" ��1+ " + g + " ��0.5+ " + h + " ��0.1" );
										}
									}
	}
}

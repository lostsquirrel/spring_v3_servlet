package demo.spring_servlet.po;

public class TestBean {

	private Integer a;
	
	private Double b;
	
	private String c;
	
	private String d;

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "TestBean [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}

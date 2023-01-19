package java04_jdbc;

// dept테이블의 하나의 행을 저장하기 위한 class ==> 패턴화 됨(DTO패턴, VO패턴, Domain패턴)
// Value Object
// Data Transfer Object
public class Dept {
	int deptno;
	String dname;
	String loc;
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}

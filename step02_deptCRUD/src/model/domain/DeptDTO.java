//deptno, dname, loc
//dept의 row 하나와 1:1 매핑되는 클래스

package model.domain;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {}
	
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
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
		StringBuilder builder = new StringBuilder();
		builder.append("DeptDTO [deptno=");
		builder.append(deptno);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", loc=");
		builder.append(loc);
		builder.append("]");
		return builder.toString();
	}
	
}

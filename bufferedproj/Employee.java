package bufferedproj;

public class Employee {
	
		public Employee()
		{
			eid = 1;
			ename = "Avani";
		}
		
		public Employee(int id , String name)
		{
			eid = id;
			ename = name;
		}
		private int eid;
		private String ename;
		
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", getEid()=" + getEid() + ", getEname()=" + getEname()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
	

}
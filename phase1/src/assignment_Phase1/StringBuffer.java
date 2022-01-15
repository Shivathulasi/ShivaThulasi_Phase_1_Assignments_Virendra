package assignment_Phase1;

public class StringBuffer {
		 public StringBuffer(String str) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args)
	    {
	     String str = "thulasi";
	     StringBuffer sbr = new StringBuffer(str);
	     sbr.reverse();
	     System.out.println(sbr);
	     StringBuilder sbl = new StringBuilder(str);
	     sbl.append("Midde");
	     System.out.println(sbl);
	    }
		private void reverse() {
			// TODO Auto-generated method stub
			
		}
	}
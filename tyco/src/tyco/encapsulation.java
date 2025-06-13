
package tyco;

public class encapsulation {
	private String Acc_name;
	public long Acc_no;
	

	

	public String getAcc_name() {
		return Acc_name;
	}


	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}


	public long getAcc_no() {
		return Acc_no;
	}


	public void setAcc_no(long acc_no) {
		Acc_no = acc_no;
	}


	public static void main(String[] args) {
		encapsulation e=new encapsulation();;
		e.setAcc_name("vaishnai");
		e.setAcc_no(743578865);
		System.out.println(e.getAcc_no());
		System.out.println(e.getAcc_name());
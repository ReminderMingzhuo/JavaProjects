public class ControlExercise1 {
	public static void main (String[] args){
	int newOne = 7988;
	int oldOne = 1500;
	int buHuan = (int)(newOne * 0.8);
	int huan = newOne - oldOne;
	if(buHuan > huan) {
	   System.out.println("卖了旧的更赚");
    }	else {
	   System.out.println("以旧换新更赚");
	}
  }
}	
		
public class TimeCalc{
    public static void main(String[] args) {
	int a = 5000;
	int hr = a/3600;
	int min = a%3600/60;
	int sec = a%60;
	System.out.println(hr + "," + min + "," + sec );
	}
	
}
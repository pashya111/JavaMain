public class CurrentTime{
	public static void main (String args[]){
		
		long totalSecondsMillis = System.currentTimeMillis() ;
		long totalSeconds = totalSecondsMillis / 1000 ;
		long currentSeconds = totalSeconds % 60 ;
		long totalMinutes = totalSeconds / 60 ;
		long CurrentMintues = totalMinutes % 60 ;
		long totalHours = totalMinutes / 60 ;
		long currentHours = totalHours % 24;
		
		System.out.print(currentHours+":"+CurrentMintues+":"+currentSeconds) ;
	}
}
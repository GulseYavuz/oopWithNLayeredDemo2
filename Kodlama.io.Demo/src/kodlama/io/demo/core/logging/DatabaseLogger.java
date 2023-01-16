package kodlama.io.demo.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanina loglandi: " + data);
		
	}

}

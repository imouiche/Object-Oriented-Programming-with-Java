package P2.Example;
// Reducing coupling - example of browser app
public class Browser {
	public void navigate(String address) {
		String ip = findIpAddress(address); // get the ip addr
		String html = sendHttpRequest(ip); //send the http request
		System.out.println(html);
	}

	private String sendHttpRequest(String ip) {
		return "<html></html>";
	}

	private String findIpAddress(String address) {
		return "127.0.0.1";
	}
}

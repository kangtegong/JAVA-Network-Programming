import java.io.*;
import java.net.*;

public class Receiver {
	public static void main(String[] args) throws IOException {

		byte[] buf = new byte[256];

		DatagramSocket socket = new DatagramSocket(5000); // 포트 번호: 5000
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println(new String(buf));
	}
}

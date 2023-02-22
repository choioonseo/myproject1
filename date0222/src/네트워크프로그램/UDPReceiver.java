package 네트워크프로그램;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws IOException {
		// 1. 받는 소켓 있어야 함(port)
		DatagramSocket socket = new DatagramSocket(8888); //포트 8888
		// 2. 패킷으로 보냈기 떄문에 빈 패킷을 만들어두면,
		// 빈 패킷 안에는 빈 byte[]이 있어야 함.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("받을 준비중..");
		// 3. 소켓이 받아서 빈 패킷에 넣는다.
		socket.receive(packet);

		// 4. byte[]에 있는 String으로 바꾸어준다.
		System.out.println("받은 데이터는 " + new String(data));

		socket.close(); // 전화기를 끊는다.

	}

}
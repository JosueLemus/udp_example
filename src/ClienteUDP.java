import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {
	public static void main(String[] args) {
		System.out.println("----Cliente----");
		try {
			// creamos socket puerto host
			DatagramSocket socketUDP = new DatagramSocket();
			int puerto = 6543;
			InetAddress host = InetAddress.getByName("localhost");
			
			//Creamos buffer para leer en consola
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			
			String cad;
			cad = sc.readLine();
			
			byte [] mensaje = cad.getBytes();
			
			DatagramPacket paticion = new DatagramPacket(mensaje, cad.length(), host, puerto);
			
			socketUDP.send(paticion);
			
		} catch (Exception e) {}
		
	}
}

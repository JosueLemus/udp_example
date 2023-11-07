import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {
	public static void main(String[] args) {
		System.out.println("----Servidor----");
		try {
			int puerto = 6543;
			
			DatagramSocket socketUDP = new DatagramSocket(puerto);
			
			byte [] bufer = new byte[10000];
			
			while(true) {
				DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);
				
				socketUDP.receive(peticion);
				
				System.out.println("Datos: " + new String(peticion.getData()));
			}
			
			
			
		} catch (Exception e) {}
		
	}
}

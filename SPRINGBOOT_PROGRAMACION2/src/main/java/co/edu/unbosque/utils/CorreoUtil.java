package co.edu.unbosque.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import co.edu.unbosque.entity.Usuario;
import co.edu.unbosque.entity.Venta;

@Service
public class CorreoUtil {

	@Autowired
	private final JavaMailSender mailSender;

	public CorreoUtil(JavaMailSender mailSender) {
		this.mailSender = mailSender;

	}

	public void contraseña(Usuario usuario) {

		String username = usuario.getLogin();
		String mail = usuario.getCorreoUsuario();

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mail);
		msg.setSubject("Bienvenido a Sophy-Shop");
		msg.setText("¡Hola " + username + "!\n\n" + "Para activar tu cuenta, te envio tu contraseña:\n" + "contrasenia"
				+ "\n\n" + "Si no fuiste tú, ignora este correo.\n\n" + "Saludos,\nEquipo Sophy-Shop App");

		mailSender.send(msg);
	}

	public void venta(Venta venta) {

		String productos = "";
		for(int i=0; i<venta.getProductos().size();i++) {
			productos += venta.getProductos().get(i).getNombre() + " "
					+ venta.getProductos().get(i).getPrecioVentaActual();
		}
		
		String mail = venta.getCorreoCliente();

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mail);
		msg.setSubject("Compra realizada con exito");
		msg.setText("¡Hola " + venta.getUsernameCliente() + " su compra fue exisosa " + "!\n\n"
				+ "Hiciste un pago en la tienda online de Sophy-Shop, por valor de " + venta.getValorVenta()
				+ " los productos fueron: \n" + productos + "\n\n" + "Si no fuiste tú, ignora este correo.\n\n"
				+ "Saludos,\nEquipo Sophy-Shop App");

		mailSender.send(msg);
		
		

	}
}

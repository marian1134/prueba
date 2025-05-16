package co.edu.unbosque.entity;

import java.io.Serializable;
import jakarta.persistence.*;

import java.util.List;
import java.util.Date;

/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name = "venta")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private byte estado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_venta")
	private Date fechaVenta;

	@Column(name = "username_cliente")
	private String usernameCliente;

	@Column(name = "correo_cliente")
	private String correoCliente;

	@Column(name = "valor_dscto")
	private int valorDscto;

	@Column(name = "valor_iva")
	private int valorIva;

	@Column(name = "valor_venta")
	private int valorVenta;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
        name = "venta_producto",
        joinColumns = @JoinColumn(name = "venta_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
	private List<Producto> productos;

	public Venta() {
	}

	public Venta(byte estado, Date fechaVenta, String usernameCliente, String correoCliente, int valorDscto,
			int valorIva, int valorVenta, List<Producto> productos) {
		super();
		this.estado = estado;
		this.fechaVenta = fechaVenta;
		this.usernameCliente = usernameCliente;
		this.correoCliente = correoCliente;
		this.valorDscto = valorDscto;
		this.valorIva = valorIva;
		this.valorVenta = valorVenta;
		this.productos = productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsernameCliente() {
		return usernameCliente;
	}

	public void setUsernameCliente(String usernameCliente) {
		this.usernameCliente = usernameCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFechaVenta() {
		return this.fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getValorDscto() {
		return this.valorDscto;
	}

	public void setValorDscto(int valorDscto) {
		this.valorDscto = valorDscto;
	}

	public int getValorIva() {
		return this.valorIva;
	}

	public void setValorIva(int valorIva) {
		this.valorIva = valorIva;
	}

	public int getValorVenta() {
		return this.valorVenta;
	}

	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}

}
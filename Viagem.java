package model ;


public class Viagem
{
	
	private int id_viagem;

	private String destino;
	
	private String tipo_transporte;
	
	private DataType data_ida;
	
	private DataType data_volta;
	
	private String local_ida;
	
	private double valor_viagem;
	
	public Viagem(){
		super();
	}

    public viagem(int id_viagem, String destino, String data_ida, String data_volta, String local_ida,
			String valor_viagem, String tipo_transporte) {
		super();
		this.id_viagem = id_viagem;
		this.destino = destino;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
		this.local_ida = local_ida;
		this.valor_viagem = valor_viagem;
		this.tipo_transporte = tipo_transporte;
	}


	public int getId_viagem() {
		return id_viagem;
	}


	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getData_ida() {
		return data_ida;
	}


	public void setData_ida(String data_ida) {
		this.data_ida = data_ida;
	}


	public String getData_volta() {
		return data_volta;
	}


	public void setData_volta(String data_volta) {
		this.data_volta = data_volta;
	}


	public String getLocal_ida() {
		return local_ida;
	}


	public void setLocal_ida(String local_ida) {
		this.local_ida = local_ida;
	}


	public String getValor_viagem() {
		return valor_viagem;
	}


	public void setValor_viagem(String valor_viagem) {
		this.valor_viagem = valor_viagem;
	}


	public String getTipo_transporte() {
		return tipo_transporte;
	}


	public void setTipo_transporte(String tipo_transporte) {
		this.tipo_transporte = tipo_transporte;
	}
	
	
	
}



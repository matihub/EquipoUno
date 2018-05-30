package Modelo;

public class Provincia {
        int id;
        String Provincia;
		public Provincia(int id, String provincia) {
			super();
			this.id = id;
			Provincia = provincia;
		}
		public Provincia() {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProvincia() {
			return Provincia;
		}
		public void setProvincia(String provincia) {
			Provincia = provincia;
		}
}

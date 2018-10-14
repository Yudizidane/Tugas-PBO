public class Konohagakure{
  public static void main(String[] args) {
    Shinobi[] m= new Shinobi[3];

    m[0] = new Shinobi();
    m[0].setNoregistrasi("012606");
    m[0].setNama("Uchiha Sasuke");
    m[0].setPeringkat("Genin");

    m[1] = new Shinobi();
    m[1].setNoregistrasi("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    m[2] = new Shinobi();
    m[2].setNoregistrasi("012601");
    m[2].setNama("Haruno Sakure");
    m[2].setPeringkat("Chunin");


    System.out.println("Data Shinobi \n");
    for(Shinobi x:m){
      System.out.println("setNoregistrasi : " +x.getNoregistrasi());
      System.out.println("Nama :" +x.getNama());
      System.out.println("peringkat :" +x.getPeringkat());
      System.out.println();
    }
  }
}

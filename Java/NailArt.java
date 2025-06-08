import java.util.Scanner;

class Customer {
    private String name;
    private String phoneNumber;
    private String tanggalpemesanan;

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }

    // Setter untuk phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Setter untuk tanggalpemesanan
    public void settanggalpemesanan(String tanggalpemesanan) {
        this.tanggalpemesanan = tanggalpemesanan;
    }

    // Method untuk menampilkan detail customer
    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Tanggal Pemesanan: " + tanggalpemesanan);
    }
}

// Kelas Service
class Service extends Customer {
    private String jenisNailArt;
    private double harga;

    // Setter untuk jenisNailArt
    public void setJenisNailArt(String jenisNailArt) {
        this.jenisNailArt = jenisNailArt;

        // Menentukan harga berdasarkan jenis nail art
        switch (jenisNailArt) {
            case "Nail Art Gel":
                this.harga = 20000;
                break;
            case "Nail Art Glitter":
                this.harga = 30000;
                break;
            case "Nail Art Bermotif":
                this.harga = 50000;
                break;
            default:
                this.harga = 65000; // Default harga untuk nail art lainnya
        }
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Jenis Nail Art: " + jenisNailArt);
        System.out.println("Harga: Rp " + harga);
    }
}

// Main Class
public class NailArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Service
        Service order = new Service();

        // Mengisi data customer
        System.out.print("Masukkan nama customer: ");
        order.setName(scanner.nextLine());

        System.out.print("Masukkan nomor telepon customer: ");
        order.setPhoneNumber(scanner.nextLine());

        // Mengisi data layanan
        System.out.print("Masukkan jenis nail art: ");
        order.setJenisNailArt(scanner.nextLine());

        // Mengisi detail pesanan nail art
        System.out.print("Masukkan tanggal pemesanan: ");
        order.settanggalpemesanan(scanner.nextLine());

        // Menampilkan detail pesanan
        System.out.println("\nDetail Pesanan:");
        order.displayDetails();

        scanner.close();
    }
}

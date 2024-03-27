public class LCD { // Tidak boleh dirubah

    // Atribut kelas LCD
    private String status; // Status di layar LCD
    private int volume; // Volume suara dari LCD
    private int brightness; // Tingkat kecerahan layar LCD
    private final String[] jenisKabel = {"VGA", "DVI", "HDMI", "DisplayPort", "USB Type-C"}; // Array jenis kabel
    private String cable; // Jenis kabel apa yg terhubung ke layar

    // Menyimpan status di layar sekarang
    public void turnOn() {
        status = "On";
    }

    public void turnOff() {
        status = "Off";
    }

    public void Freeze() {
        status = "Freeze";
    }

    // Method pengatur volume LCDnya
    public void setVolume(int volumeSuara) { // Mengatur nilai volume di method ini
        this.volume = volumeSuara;
    }

    // Disesuaikan dengan nilai yg ada di kelas main
    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    // Method pengatur tingkat kecerahan LCDnya
    public void setBrightness(int tingkatKecerahan) { // Mengatur nilai kecerahan di method ini
        this.brightness = tingkatKecerahan;
    }

    // Disesuaikan dengan nilai yg ada di kelas main
    public void brightnessUp() {
        if (brightness < 100) {
            brightness++;
        }
    }

    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    // Method pengatur jenis kabel yg terhubung
    public void setCable(int option) { // Tidak boleh dirubah
        if (option >= 0 && option < jenisKabel.length) {
            cable = jenisKabel[option];
        }
    }

    // Method untuk mencetak status, volume, kecerahan, dan kabel
    public void displayMessage() { // Tidak boleh dirubah
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
}
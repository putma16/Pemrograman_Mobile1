package anis.nat.myapp;

import java.util.ArrayList;

public class BukuData {
    public static String[][] data = new String[][]{
            {"0","Miss Peregrine’s Home for Peculiar Children", "Novel ini berputar pada cerita panti asuhan milik Miss Peregrine. Panti asuhan ini bukanlah panti asuhan biasa. Anak-anak yang ada di dalamnya memiliki kemampuan istimewa, yaitu kekuatan supranatural yang tergolong langka. Jacob, seorang permuda berusia 16 tahun mencoba menemukan panti asuhan Miss Peregrine berdasarkan pesan terakhir yang ditinggalkan kakeknya sebelum meninggal.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/Ax2yhgZcms.jpg"},
            {"1","Lorien Legacies","Bercerita tentang sembilan anak yang dilarikan dari planet Lorien yang telah hancur karena perang. Setiap anak disembunyikan di tempat berbeda di Bumi. Namun satu per satu dari mereka terbunuh sesuai dengan nomor urutannya. John Smith adalah yang keempat.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/HfigvVAaCd.jpg"},
            {"2","Neverwhere" , "Richard Mayhew menjalani kehidupan yang biasa-biasa saja di London. Hidupnya berubah setelah menolong seorang gadis gelandangan yang berdarah dan terkapar di jalan. Dalam sekejap Richard kehilangan tunangan, identitas, rumah, dan pekerjaannya. Tiba-tiba saja ia terlempar dalam dunia gelap London yang tidak dikenalnya. Mau tidak mau Richard harus bergabung dengan Door, gadis yang ia selamatkan. Bersama dengan Hunter dan Marquis de Carabas, mereka berusaha mencari pembunuh keluarga Door.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/scWnmtY9H9.jpg"},
            {"3","Prince of Thorns","The Broken Empire adalah trilogi novel fantasi yang ditulis oleh Harper Voyage. Buku pertamanya berjudul Prince of Thorns. Bercerita tentang Pangeran Honorous Jorg Ancrath yang harus menyaksikan ibu dan saudaranya terbunuh saat usianya sembilan tahun. Di usia tiga belas tahun ia menjadi pemimpin sebuah kelompok jalanan, dan di usia lima belas ia ingin menjadi raja. Dengan amarah dan dendam, ia bertekad untuk mengalahkan musuhnya",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/v3mDi7gCLk.jpg"},
            {"4", "The Red Pyramid","Carter dan Sadie mengalami sebuah pengalaman buruk dimana ayah mereka dikurung ke dalam sebuah peti mati oleh seorang manusia api. Peti itu kemudian ditenggelamkan hingga ke dalam Bumi. Kedua bersaudara itu terjebak dalam sebuah petualangan menegangkan yang nantinya menguak rahasia terdalam keluarga mereka. Tujuan akhirnya adalah menyelamatkan ayah mereka.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/DWCR2fpW6u.jpg"},
            {"5", "Mr. Penumbra’s 24-Hours Bookstore", "Seorang desainer web bernama Clay Jannon harus kehilangan pekerjaannya di New Bagel yang harus terpaksa tutup. Namun hidup harus terus berjalan karena Clay harus menyambung hidup. Ia kemudian bekerja di toko buku Mr Penumbra yang buka 24 jam. Toko buku ini penuh dengan keanehan karena ketika seorang pembeli menanyakan buku biografi Steev Jobs, Clay tidak bisa menemukannya di sana. Berbagai misteri yang ada di dalam toko buku membuat novel ini menjadi lebih seru.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/0IE2P9yNaf.jpg"},
            {"6", "Seri Immortals" ,"Bercerita tentang Ever Bloom, seorang gadis baru di sekolah yang cantik namun kikuk. Setelah mengalami kecelakaan yang merenggut nyawa seluruh keluarganya, Ever memiliki kemampuan aneh yaitu bisa menderngarkan pikiran orang lain, mengetahui seluruh kisah hidup mereka, hingga melihat aura mereka hanya dengan satu sentuhan. Kehidupan Ever kembali berubah saat ia bertemu dengan Damen Auguste.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/kKWiAgddNE.jpg"},
            {"7", "Trials of Apollo","Bercerita tentang Apollo yang merasa sangat terhina untuk pertama kalinya selama empat ribu tahun ia hidup. Terkenal sebagai dewa paling tampan, berbakat, dan mengagumkan, wujud Apollo kini berubah menjadi culun, berambut keriting, dengan wajah penuh jerawat dan perut menggelambir. Identitasnya berubah menjadi Lester Papadopoulos. Apollo harus menyudahi kutukan ini dan kembali bersama para dewa di Olympus",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/MdQ632FP77.jpg"},
            {"8","Ender's Game" ,"Ender’s Game berkisah tentang seorang remaja bernama Ender yang bertanggung jawab untuk menyelamatkan Bumi. Serangan dari Bugger, makhluk luar angkasa yang berbentuk mirip belalang berupaya untuk memusnahkan semua makhluk di Bumi. Di tengah-tengah tugas yang harus ia selesaikan, Ender harus menghadapi masalah yang lebih dari sekedar Bugger. Ia mulai diperebutkan oleh banyak pemimpin termasuk kakak sulungnya sendiri, Peter.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/c0gHeGsBBD.jpg"},
            {"9", "The KingKiller Chronicle, Patrick Rothfuss","The KingKiller Chronicle menceritakan tentang Kvothe, petulang dan musisi yang tumbuh menjadi seorang penyihir terkenal. Sebagai seorang yatim piatu, ia tumbuh di kota yang penuh kejahatan. Berkat keberaniannya, ia berhasil masuk ke dalam sekolah sihir legendaris. Namun ia harus hidup sebagai buron setelah terjadi pembunuhan terhadap seorang raja.",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/BSdjHcSeyu.jpg"}
    };
    public static ArrayList<Buku> getListData(){
        ArrayList<Buku> list = new ArrayList<>();
        for (String[] aData: data){
            Buku buku= new Buku();
            buku.setId(Integer.parseInt(aData[0]));
            buku.setName(aData[1]);
            buku.setDescription(aData[2]);
            buku.setPhoto(aData[3]);
            list.add(buku);
        }
        return list;
    }
}
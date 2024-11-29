/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenwisata;

// Abstraction
import java.util.Scanner;

public abstract class LayananWisata {
    protected Scanner scanner = new Scanner(System.in);

    public abstract void daftarPaket();
    public abstract void booking();
}

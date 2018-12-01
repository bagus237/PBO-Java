package project;
import java.io.*;
public class program_diskon{
	public static void main(String[] args){
		BufferedReader datakita = new BufferedReader (new InputStreamReader(System.in));
		DataInputStream dataAngka = new DataInputStream (System.in);
		
		//deklarasi variable dengan tipe datanya masing-masing
		double belanja = 0.0;
		double disc = 0;
		double bayar = 0.0;
		
		//hasil utama program
		System.out.println("masukan total belanja dengan enter");
		try{
			belanja = Double.parseDouble(dataAngka.readLine());
		}
		catch(Exception e){
		}
			System.out.println("Terjadi Error");
	
	//proses hitung diskon
	if(belanja>=100000){disc=belanja*0.1;}else
	if(belanja>=50000){disc=belanja*0.05;}else
	{disc=0;}
	
	//proses hitung total bayar
	bayar=belanja-disc;
	
	//mencetak hasil belanja discount dan total bayar
	System.out.println("Total belanja anda : "+belanja);
	System.out.println("Diskon belanja anda : "+disc);
	System.out.println("Total bayar anda : "+bayar);
}
}
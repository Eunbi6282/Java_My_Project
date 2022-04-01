package chapter16.Ex06;
public class Printer_Test {
	public static void main(String[] args) {
		
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<>();
		powerPrinter.setMaterial(new Powder());
		
		Powder powder = powerPrinter.getMaterial();		//객체를 가져와서 변수에 powder변수에 할당
		System.out.println(powerPrinter);
		powder.doPrinting();
		System.out.println();
		
		System.out.println("============================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		
		System.out.println("---------------------------");
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting();
		

	}

}

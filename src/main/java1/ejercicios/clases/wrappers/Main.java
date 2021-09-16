package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// byte
		byte datoByte = 2;// primitivo
		Byte datoByteWrapper = 3;// Wrapper
		System.out.println("primitivo:" + datoByte);
		System.out.println("Wrapper:" + datoByteWrapper);
		// Conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido:" + datoConvertido);
		// Conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido:" + datoByte2);

		// short
		short datoShort = 1;// primitivo
		Short datoShortWrapper = 1;// Wrapper
		System.out.println("primitivo:" + datoShort);
		System.out.println("Wrapper:" + datoShortWrapper);
		// Conversiones
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido:" + shortConvertido);
		// Conversiones 2
		Short shortConvertido2 = 23;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("short convertido:" + datoShort2);

		// int
		int edad = 45;// primitivo
		Integer edadWrapper = 48;// Wrapper
		System.out.println("primitivo:" + edad);
		System.out.println("Wrapper:" + edadWrapper);
		// Conversiones
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Integer convertido:" + integerConvertido);
		// Conversiones 2
		Integer integerConvertido2 = 23;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido:" + edad2);

		// long
		long valorGrande = 12534L;// primitivo
		Long valorGrandeWrapper = 123467L;// Wrapper
		System.out.println("primitivo:" + valorGrande);
		System.out.println("Wrapper:" + valorGrandeWrapper);
		// Conversiones
		long valorGrande1 = 56789L;
		Long longConvertido = valorGrande1;
		System.out.println("Long convertido:" + longConvertido);
		// Conversiones 2
		Long longConvertido2 = 23412L;
		long valorGrande2 = longConvertido2.longValue();
		System.out.println("long convertido:" + valorGrande2);

		// boolean
		boolean valor = true;// primitivo
		Boolean valorWrapper = false;// Wrapper
		System.out.println("primitivo:" + valor);
		System.out.println("Wrapper:" + valorWrapper);
		// Conversiones
		boolean valor1 = true;
		Boolean booleanConvertido = valor1;
		System.out.println("Boolean convertido:" + booleanConvertido);
		// Conversiones 2
		Boolean booleanConvertido2 = false;
		boolean valor2 = booleanConvertido2.booleanValue();
		System.out.println("boolean convertido:" + valor2);

		// float
		float dato = 1.5F;// primitivo
		Float datoWrapper = 2.2F;// Wrapper
		System.out.println("primitivo:" + dato);
		System.out.println("Wrapper:" + datoWrapper);
		// Conversiones
		float dato1 = 1.2F;
		Float floatConvertido = dato1;
		System.out.println("Float convertido:" + floatConvertido);
		// Conversiones 2
		Float floatConvertido2 = 3.4F;
		float dato2 = floatConvertido2.floatValue();
		System.out.println("float convertido:" + dato2);

		// double
		double datoDouble = 1.56;// primitivo
		Double datoDoubleWrapper = 2.26;// Wrapper
		System.out.println("primitivo:" + datoDouble);
		System.out.println("Wrapper:" + datoDoubleWrapper);
		// Conversiones
		double datoDouble1 = 1.26;
		Double doubleConvertido1 = datoDouble1;
		System.out.println("Double convertido:" + doubleConvertido1);
		// Conversiones 2
		Double doubleConvertido2 = 3.47;
		double datoDouble2 = doubleConvertido2.doubleValue();
		System.out.println("double convertido:" + datoDouble2);

		// char
		char datoChar = 'a';// primitivo
		Character datoCharWrapper = 'a';// Wrapper
		System.out.println("primitivo:" + datoChar);
		System.out.println("Wrapper:" + datoCharWrapper);
		// Conversiones
		char datoChar1 = 'b';
		Character charConvertido1 = datoChar1;
		System.out.println("Character convertido:" + charConvertido1);
		// Conversiones 2
		Character charConvertido2 = 'g';
		char datoChar2 = charConvertido2.charValue();
		System.out.println("char convertido:" + datoChar2);
	}

}

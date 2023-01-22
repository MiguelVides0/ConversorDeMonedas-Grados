import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		//conversores
		String[] conversores={"Conversor de moneda", "Conversor de temperatura"};
		
		//Bandera para detener la aplicación
		boolean flag = true;
		//Tipos de monedas
		String [] monedas= {"Dólar a peso colombiano","Dólar a euro","Dólar a libra esterlina",
				"Dólar a yen","Dólar a won coreano","Dólar a bitcoin","Peso colombiano a dólar","Euro a dólar","Libra esterlina a dólar",
				"Yen a dólar","Won coreano a dólar", "Bitcoin a dólar"};
		
		String [] grados = {"Fahrenheit a celsius", "Celsius a Farenheit"};
		
		//capturar que conversor usar
		while(flag) {
			String respuesta=(String) JOptionPane.showInputDialog(null, "¿Qué desea usar?", "CONVERSOR"
					,JOptionPane.QUESTION_MESSAGE ,null, conversores, conversores[0]);
			System.out.println(monedas.length);
			//mostrar el conversor
			if (respuesta.equals(conversores[0])) {
				try {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero "
							+ "que deseas convertir"));
					String tipoMoneda=(String)JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero", "CONVERSOR DE MONEDA"
							,JOptionPane.QUESTION_MESSAGE ,null, monedas,monedas[0]);
					if(tipoMoneda.equals(monedas[0])) {
						valor=valor*4648.58;
						System.out.println(valor);
					} else if(tipoMoneda.equals(monedas[1])) {
						valor = valor *18.39;
					}else if(tipoMoneda.equals(monedas[2])) {
						valor = valor *0.81;
					}else if(tipoMoneda.equals(monedas[3])) {
						valor = valor *129.56;
					}else if(tipoMoneda.equals(monedas[4])) {
						valor = valor *1231.03;
					}else if(tipoMoneda.equals(monedas[5])) {
						valor = valor*0.000044;
					}else if(tipoMoneda.equals(monedas[6])) {
						valor = valor * 0.00021;
					}else if(tipoMoneda.equals(monedas[7])) {
						valor = valor *1.09;
					}else if(tipoMoneda.equals(monedas[8])) {
						valor = valor *1.24;
					}else if(tipoMoneda.equals(monedas[9])) {
						valor = valor*0.0077;
					}else if(tipoMoneda.equals(monedas[10])) {
						valor = valor*0.0081;
					}else if(tipoMoneda.equals(monedas[11])) {
						valor = valor*22747.50;
					}
					JOptionPane.showMessageDialog(null, "Un / una "+ tipoMoneda+" es: "+valor);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no válido \n"+e);
				}
			}else {
				try {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los grados "
							+ "que deseas convertir"));
					String tipoGrados=(String)JOptionPane.showInputDialog(null, "Elija los grados a los que desea convertir su valor", "CONVERSOR DE TEMPERATURA"
							,JOptionPane.QUESTION_MESSAGE ,null, grados,grados[0]);
					if(tipoGrados.equals(grados[0])) {
						valor = (valor -32)*(5/9);
					}else {
						valor = (valor *(9/5))+32;
					}
					JOptionPane.showMessageDialog(null, "Un grado "+tipoGrados+" es: "+valor);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no válido \n"+e);
				}
			}
			int resultado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			if(resultado==0) {
				flag = true;
			} else {
				flag= false;
			}
		}
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
}

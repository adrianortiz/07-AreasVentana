/**
 * 
 * @author Adrian
 *
 */
public class Area {
	
	/**
	 * Retorna el área de un cuadrado
	 * 
	 * @param l de tipo Int
	 * @return retorna área tipo Int
	 */
	public int areaCuadrado(int l) {
		return l * l;
	}
	
	/**
	 * Retorna el área de un rectangulo
	 * 
	 * @param l1 tipo Int
	 * @param l2 tipo Int
	 * @return área de tipo int
	 */
	public int areaRectangulo(int l1, int l2) {
		return l1 * l2;
	}
	
	
	/**
	 * Retorna el área de un triángulo
	 * 
	 * @param l1 tipo Int
	 * @param l2 tipo Int
	 * @return área de tipo int
	 */
	public int areaTriangulo(int l1, int l2) {
		return (l1 * l2) / 2;
	}
	
	/**
	 * Retorna el área de un ciruculo
	 * 
	 * @param radio de tipo Int
	 * @return área de tipo Double
	 */
	public double areaCirculo(int radio) {
		return Math.PI*Math.pow(radio, 2);
	}
}

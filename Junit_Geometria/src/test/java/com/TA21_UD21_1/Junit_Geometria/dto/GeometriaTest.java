package com.TA21_UD21_1.Junit_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ABEL 
 * Fecha modificacion: 17/02/2022
 */
class GeometriaTest {

	Geometria geo;

	@BeforeEach
	void before() throws Exception {
		geo = new Geometria();
	}

	@AfterEach
	void after() throws Exception {
		geo = null;
	}

	@Test
	void testGeometriaInt() {
		Geometria geo2 = new Geometria(2);
		Geometria geo3 = new Geometria(2);

		assertEquals(geo2.getId(), geo3.getId());
	}

	@Test
	void testGeometria() {
		Geometria geometria2 = new Geometria();
		assertEquals(geometria2.getId(), geo.getId());
	}

	@Test
	void testAreaCuadrado() {
		int resultado = geo.areaCuadrado(6);
		int esperado = 36;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = geo.areaCirculo(30);
		double esperado = 2827.44;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaTriangulo() {
		int resultado = geo.areaTriangulo(6, 5);
		int esperado = 15;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaRectangulo() {
		int resultado = geo.areaRectangulo(8, 7);
		int esperado = 56;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaPentagono() {
		int resultado = geo.areaPentagono(10, 6);
		int esperado = 30;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaRombo() {
		int resultado = geo.areaRombo(16, 8);
		int esperado = 64;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaRomboide() {
		int resultado = geo.areaRomboide(4, 24);
		int esperado = 96;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaTrapecio() {
		int resultado = geo.areaTrapecio(6, 6, 3);
		int esperado = 18;
		assertEquals(resultado, esperado);
	}

	@Test
	void testFigura() {

		String[] figuras = new String[] { "Default", "Cuadrado", "Circulo", "Triangulo", "Rectangulo", "Pentagono",
				"Rombo", "Romboide", "Trapecio" };

		for (int i = 0; i < figuras.length; i++) {
			String resultado = geo.figura(i);
			String esperado = figuras[i].toString();
			assertEquals(resultado, esperado);
		}
	}

	@Test
	void testGetId() {

		geo.setId(1);
		int resultado = geo.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetId() {

		geo.setId(1);
		int resultado = geo.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetNom() {

		geo.setNom("Rombo");
		String resultado = geo.getNom();
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetNom() {

		geo.setNom("Rombo");
		String resultado = geo.getNom();
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetArea() {

		geo.setArea(20);
		double resultado = geo.getArea();
		double esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetArea() {

		geo.setArea(20);
		double resultado = geo.getArea();
		double esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	void testToString() {

		geo.setId(1);
		geo.setNom("cuadrado");
		geo.setArea(20);

		String resultado = geo.toString();
		String esperado = "Geometria [id=1, nom=cuadrado, area=20.0]";

		assertEquals(resultado, esperado);
	}
}

package main

import ("fmt")

func main() {
	var codigoPeca1 int
	var numeroPecas1 int
	var valorUnitario1 float64
	fmt.Scanf("%d %d %f", &codigoPeca1, &numeroPecas1, &valorUnitario1)

	var codigoPeca2 int
	var numeroPecas2 int
	var valorUnitario2 float64
	fmt.Scanf("%d %d %f", &codigoPeca2, &numeroPecas2, &valorUnitario2)

	var total float64 = (float64(numeroPecas1) * valorUnitario1) + (float64(numeroPecas2) * valorUnitario2)

	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", total)
}
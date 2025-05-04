package main

import ("fmt")

func main() {
	var nome string
	fmt.Scan(&nome)

	var salarioFixo float64
	fmt.Scan(&salarioFixo) 

	var totalVendas float64
	fmt.Scan(&totalVendas)

	salarioFixo += totalVendas * 0.15

	fmt.Printf("TOTAL = R$ %.2f\n", salarioFixo)
}
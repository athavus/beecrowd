package main

import (
	"fmt"
)

func main() {
	var a float64
	fmt.Scan(&a)
	
	var b float64
	fmt.Scan(&b)
	
	var c float64
	fmt.Scan(&c)

	var media float64 = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0

	fmt.Printf("MEDIA = %.1f\n", media)
}
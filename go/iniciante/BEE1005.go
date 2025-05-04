package main

import (
	"fmt"
)

func main() {
	var a float64
	fmt.Scan(&a)

	var b float64
	fmt.Scan(&b)

	var media float64 = ((a * 3.5) + (b * 7.5)) / 11.0

	fmt.Printf("MEDIA = %.5f\n", media)

}
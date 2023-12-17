package main

import (
	"fmt"
)

func main() {
	var x int

	fmt.Scanf("%d", &x)
	var output string

	for i := 0; i < x; i++ {
		for j := 0; j < x-i-1; j++ {
			output += " "
		}

		for j := 0; j <= i; j++ {
			output += "*"
		}
		output += "\n"
	}

	fmt.Print(output)
}

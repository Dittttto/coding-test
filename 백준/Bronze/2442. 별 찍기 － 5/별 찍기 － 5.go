package main

import (
	"bytes"
	"fmt"
)

func main() {
	var x int

	fmt.Scanf("%d", &x)
	var output bytes.Buffer

	for i := 0; i < x; i++ {
		for j := 0; j < x-i-1; j++ {
			output.WriteString(" ")
		}

		for j := 0; j < 2*i+1; j++ {
			output.WriteString("*")
		}

		output.WriteString("\n")
	}

	fmt.Print(output.String())
}

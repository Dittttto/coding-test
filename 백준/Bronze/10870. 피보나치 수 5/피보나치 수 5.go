package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

	var n int

	fmt.Fscanf(reader, "%d", &n)
	result := fibonnaci(n)

	writer.WriteString(strconv.Itoa(result))
	defer writer.Flush()
}

func fibonnaci(n int) int {
	if n < 2 {
		return n
	}

	return fibonnaci(n-1) + fibonnaci(n-2)
}